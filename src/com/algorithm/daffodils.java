package com.algorithm;
/**
 * ��Ŀ����ӡ�����е�"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ����λ�������λ���������͵��ڸ�������
 * ���磺153��һ��"ˮ�ɻ���"����Ϊ153=1�����η���5�����η���3�����η���
 * 1.�������������forѭ������100-999������ÿ�����ֽ����λ��ʮλ����λ��
 * 
 * @author cade
 */
public class daffodils {
    public static void main(String[] args) {
        int hundredsDigit, tensDigit, unitsDigits;
        int data;
        System.out.println("the daffodils number between 100 and 999:");
        for (int i = 100; i < 999; i++) {
            hundredsDigit = i / 100;
            tensDigit = (i - 100 * hundredsDigit) / 10;
            unitsDigits = i - 100 * hundredsDigit - 10 *tensDigit;
            data = hundredsDigit*hundredsDigit*hundredsDigit+tensDigit*tensDigit*tensDigit+unitsDigits*unitsDigits*unitsDigits;
            if(data == i){
                System.out.println(i);
            }
        }
        System.out.println("end");
    }

}