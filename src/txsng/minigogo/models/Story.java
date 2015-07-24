/**   
* @File_name: Story.java 
* @Package txsng.minigogo.models 
* @Description: Story 故事(用一句话描述该文件做什么) 
* @author siplexypeng 朋翔   
* @date 2015年7月24日 下午5:56:50 
* @version V1.0   
*/ 
package txsng.minigogo.models;

import java.util.List;

public class Story {
	/*
	 * 标识ID
	 */
	private String id; 
	/*
	 * 故事 标题
	 */
	private String title;
	/*
	 * 总赞数
	 */
	private Integer total_favours;
	/*
	 * 0 - 未被占有 
	 * 1 - 正在编辑 
	 */
	private Integer state;
	/*
	 * 回收依赖时间
	 */
	private String recycle_time;
	/*
	 * 段落id集合
	 */
	private List<String> paragraph_ids; 
	
}
