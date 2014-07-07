 
package com.patterns.singleton; 
 
/** 
 * @author study study@126.com 
 * I'm glad to share my knowledge with you all. 
 * 通用单例模式 
 */ 

@SuppressWarnings("all")
public class SingletonPattern {
	private static final SingletonPattern singletonPattern = new SingletonPattern();

	// 限制住不能直接产生一个实例
	private SingletonPattern() {
	}

	public synchronized static SingletonPattern getInstance() {
		return singletonPattern;
	}

}