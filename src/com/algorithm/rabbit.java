package com.algorithm;

/**
 * 兔子问题 斐波那契数列求值
 * 
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 *            小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？ 
 * 1.程序分析： 兔子的规律为数列 Jan:1
 *                     Feb:1 
 *                     Mar:2 
 *                     Apr:3 
 *                     May:5 
 *                     Jun:8 
 *                     Jul:13 
 * 从中发现，从第三个月开始，前两个月兔子数之后为第三个兔子总数.
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
			System.out.println("第" + i + "个月的兔子对数：" + lastMonth);
		}
		/*
		 * for(int i =1 ; i<MONTH; i++){
		 * System.out.println("第"+i+"个月的兔子对数："+fib(i)); }
		 */
	}

	// 递归方法实现
	public static int fib(int month) {
		if (month == 1 || month == 2) {
			return 1;
		} else {
			return fib(month - 1) + fib(month - 2);
		}
	}
}