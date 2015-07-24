/**   
* @File_name: HttpClient.java 
* @Package txsng.minigogo.testhttp 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author siplexypeng ����   
* @date 2015��7��24�� ����7:50:05 
* @version V1.0   
*/
package txsng.minigogo.testhttp;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import android.util.Log;

/**
 * @ClassName: HttpClient
 * @Description: TODO(������һ�仰��������������)
 * @author A18ccms a18ccms_gmail_com
 * @date 2015��7��24�� ����7:50:05
 * 
 */
public class HttpClient {
	public static AsyncHttpClient client;
	private static String API_URL = "http://www.oschina.net/%s";

	public static AsyncHttpClient getHttpClient() {
		return client;
	}

	public static void get(String partUrl, AsyncHttpResponseHandler handler) {
		client.get(getAbsoluteApiUrl(partUrl), handler);
	}

	public static void get(String partUrl, RequestParams params,
	            AsyncHttpResponseHandler handler) {
		client.get(getAbsoluteApiUrl(partUrl), params, handler);
	}
	
	
	 public static String getAbsoluteApiUrl(String partUrl) {
	        String url = String.format(API_URL, partUrl);
	        return url;
	    }

}
