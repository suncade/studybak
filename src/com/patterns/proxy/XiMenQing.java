package com.patterns.proxy;

/**
 * 'm glad to share my knowledge with you all. ����һ�������죬����ɫ�ж���
 * 
 * @author study study@126.com I
 */
public class XiMenQing {

	/*
	 * ˮ���������д�ģ������챻�˽������������һ���ѵ��������ˣ� �����ſ�����, �Ϳ�ʼ������˺��£�������Ϊ�˽����Ĵ�����
	 * ���˲��ٺô��ѣ������Ǽ���һ�£� ���û���������м�ǣ�ߣ���������Ҫ�����ܳ�����˵�ĺܣ�
	 */
	public static void main(String[] args) {
		// �����Žг���
		WangPo wangPo = new WangPo();

		// Ȼ���������˵����Ҫ���˽���happy��Ȼ�����žͰ����������춪���ӵ��ǳ�Ϸ:
		wangPo.makeEyesWithMan(); // ����û����Ȼ������ʱ����������ʵ����ˬ�����˽���
		wangPo.happyWithMan();
		
		WangPo wangPo2 = new WangPo(new JiaShi());
		wangPo2.makeEyesWithMan();
		wangPo2.happyWithMan();
	}
}