 
package com.patterns.singleton; 
 
/** 
 * @author study study@126.com 
 * I'm glad to share my knowledge with you all. 
 * ͨ�õ���ģʽ 
 */ 

@SuppressWarnings("all")
public class SingletonPattern {
	private static final SingletonPattern singletonPattern = new SingletonPattern();

	// ����ס����ֱ�Ӳ���һ��ʵ��
	private SingletonPattern() {
	}

	public synchronized static SingletonPattern getInstance() {
		return singletonPattern;
	}

}