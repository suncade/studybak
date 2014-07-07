package com.patterns.multitionPattern;
/** 
 * @author study study@126.com 
 * I'm glad to share my knowledge with you all. 
 * ���Ǳ����ˣ�һ���ʵ۶��ź򲻹����ˣ����ڻ������������ʵ� 
 * TND�������ˣ��ҵ����ʵۣ���ͷ���밴�ͳ��ˣ� 
 */ 
@SuppressWarnings("all")
public class Minister {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int ministerNum = 10; // 10����

		for(int i = 0; i < ministerNum; i++) {
			Emperor emperor = Emperor.getInstance();
			if(i == 3) {
				emperor = Emperor.getInstance(1);
				System.out.print("��������ֻ�ΰݵڶ����ʵۣ�");
			} else {
				System.out.print("��" + (i + 1) + "���󳼲ΰݵ��ǣ�");
			}
			emperor.emperorInfo();
		}
	}
}