/*
 * 
 * 
 */

package txsng.minigogo.testhttp;

import java.net.URLEncoder;

import org.apache.http.Header;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements OnClickListener {
	ACache mCache;
	TextView txtviewShow ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btnGetHttpReq = (Button) findViewById(R.id.btnGetHttpReq);
		txtviewShow = (TextView) findViewById(R.id.txtviewShow);
		btnGetHttpReq.setOnClickListener(this);
		mCache = ACache.get(this);
		if(NetworkHelper.isMobileConnected(this)){
			Toast.makeText(this, "3G网络连接", Toast.LENGTH_SHORT).show();
		}
		else if(NetworkHelper.isNetworkConnected(this)){
			Toast.makeText(this, "有网路连接", Toast.LENGTH_SHORT).show();
		}
		else{
			Toast.makeText(this, "无网络连接", Toast.LENGTH_SHORT).show();
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		AsyncHttpClient client = new AsyncHttpClient();
    	final TextView txtviewShow=(TextView) findViewById(R.id.txtviewShow);
        String cacheString=mCache.getAsString("testCache");
    	try {
        	
        	if(cacheString!=null){
                txtviewShow.setText(cacheString);

            }
        	else{
	            String url = "http://baidu.com";
	            client.get(url, new AsyncHttpResponseHandler() {
	                @SuppressLint("ShowToast")
					@Override
	                public void onSuccess(int statusCode, Header[] headers,
	                        byte[] responseBody) {
	                    String receiveString = new String(responseBody);
	                    
	                    txtviewShow.setText(receiveString);
	                    mCache.put("testCache", receiveString,20);
	                	Toast.makeText(MainActivity.this,
	                            "请求成功" + receiveString, 0).show();
	                }
	
	                @Override
	                public void onFailure(int statusCode, Header[] headers,
	                        byte[] responseBody, Throwable error) {
	                    // TODO Auto-generated method stub
	                }
	            
	            });
            }
        } catch (Exception e) {
        }
		
	}
}
