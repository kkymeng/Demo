package com.kk.algorithm.test;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int firstNum = sc.nextInt();
        System.out.println("请输入第二个数:");
        int secondNum = sc.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("两数和为:"+sum);

    }
}
