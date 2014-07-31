package com.algorithm;

/**
 * �������� 쳲�����������ֵ
 * 
 * ��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�
 *            С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ���������Ϊ���٣� 
 * 1.��������� ���ӵĹ���Ϊ���� Jan:1
 *                     Feb:1 
 *                     Mar:2 
 *                     Apr:3 
 *                     May:5 
 *                     Jun:8 
 *                     Jul:13 
 * ���з��֣��ӵ������¿�ʼ��ǰ������������֮��Ϊ��������������.
 * 
 * @author cade
 */
public class rabbit {
	public static final int MONTH = 15;

	public static void main(String[] args) {
		long theMonthBeforeLast = 1L, lastMonth = 1L;
		long currentMonth;
		for (int i = 3; i < MONTH; i++) {
			currentMonth = theMonthBeforeLast + lastMonth;
			theMonthBeforeLast = lastMonth;
			lastMonth = currentMonth;
			System.out.println("��" + i + "���µ����Ӷ�����" + lastMonth);
		}
		/*
		 * for(int i =1 ; i<MONTH; i++){
		 * System.out.println("��"+i+"���µ����Ӷ�����"+fib(i)); }
		 */
	}

	// �ݹ鷽��ʵ��
	public static int fib(int month) {
		if (month == 1 || month == 2) {
			return 1;
		} else {
			return fib(month - 1) + fib(month - 2);
		}
	}
}