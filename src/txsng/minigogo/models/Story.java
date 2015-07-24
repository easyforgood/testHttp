/**   
* @File_name: Story.java 
* @Package txsng.minigogo.models 
* @Description: Story ����(��һ�仰�������ļ���ʲô) 
* @author siplexypeng ����   
* @date 2015��7��24�� ����5:56:50 
* @version V1.0   
*/ 
package txsng.minigogo.models;

import java.util.List;

public class Story {
	/*
	 * ��ʶID
	 */
	private String id; 
	/*
	 * ���� ����
	 */
	private String title;
	/*
	 * ������
	 */
	private Integer total_favours;
	/*
	 * 0 - δ��ռ�� 
	 * 1 - ���ڱ༭ 
	 */
	private Integer state;
	/*
	 * ��������ʱ��
	 */
	private String recycle_time;
	/*
	 * ����id����
	 */
	private List<String> paragraph_ids; 
	
}
