package com.algorithm;
import java.util.Scanner;

/**
 * ��Ŀ����������������m��n���������Լ������С��������
 *  1.�������������շ������
 * @author cade
 */
public class comonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int first = a;
        int second = b;
        System.out.println("a=" + a + ";b=" + b);
        int temp;
        
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
                temp = a % b;
                a = b;
                b = temp;
        }
        System.out.println("���Լ��Ϊ"+a);
        System.out.println("��С������Ϊ"+first*second/a);
    }
}