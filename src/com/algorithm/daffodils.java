package com.algorithm;
/**
 * 题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
 * 例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
 * 1.程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
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