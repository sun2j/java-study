package com.wx.javacore.day01;

import java.io.Console;
import java.util.Scanner;

/**
 * @author wangxu
 * @date 2018/05/17
 * @description 输入输出，
 **/
public class InputOutput {

    public static void main(String[] args) {
        //读取输入，从控制台获取
        Scanner in = new Scanner(System.in);
        System.out.println("what is your name?");
        String name = in.nextLine();
        System.out.println("My name is "+name);
        System.out.println("How old are you?");
        int age = in.nextInt();
        System.out.println("I am "+age+" years old!");



    }

}
