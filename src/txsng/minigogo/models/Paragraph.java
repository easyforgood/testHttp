/**   
* @File_name: Paragraph.java 
* @Package txsng.minigogo.models 
* @Description: ����ҵ��ģ��(��һ�仰�������ļ���ʲô) 
* @author siplexypeng ����   
* @date 2015��7��24�� ����6:06:57 
* @version V1.0   
*/ 
package txsng.minigogo.models;

import java.util.List;

public class Paragraph {
	/*
	 * ����ID
	 */
	private String id;
	/*
	 * ����ID
	 */
	private String author_id;
	/*
	 * ���ڹ��µ�ID
	 */
	private String story_id;
	/**
	 *  ����ʱ��
	 */
	private String create_time;
	/*
	 * ������
	 */
	private Integer favours;
	/*
	 * �����������
	 */
	private String content;
	/*
	 * ͼƬurl�б�
	 */
	private List<String> pictures;
	
	
}
