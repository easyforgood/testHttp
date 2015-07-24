/**   
* @File_name: Paragraph.java 
* @Package txsng.minigogo.models 
* @Description: 段落业务模型(用一句话描述该文件做什么) 
* @author siplexypeng 朋翔   
* @date 2015年7月24日 下午6:06:57 
* @version V1.0   
*/ 
package txsng.minigogo.models;

import java.util.List;

public class Paragraph {
	/*
	 * 段落ID
	 */
	private String id;
	/*
	 * 作者ID
	 */
	private String author_id;
	/*
	 * 所在故事的ID
	 */
	private String story_id;
	/**
	 *  创建时间
	 */
	private String create_time;
	/*
	 * 点赞数
	 */
	private Integer favours;
	/*
	 * 段落故事内容
	 */
	private String content;
	/*
	 * 图片url列表
	 */
	private List<String> pictures;
	
	
}
