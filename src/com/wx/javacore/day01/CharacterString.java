package com.wx.javacore.day01;

/**
 * @author wangxu
 * @date 2018/05/14
 * @description
 * 字符串:Java字符串就是Unicode字符序列。例如，串"Java\u2122"由5个Unicode字符J,a,c,a和tm。
 *         每个用双引号括起来的字符串都是String 类的一个实例。
 *
 * 子串：substring可以从较大的字符串提取出一个子串
 *
 * 拼接：Java语言允许使用+号连接（拼接）两个字符串。
 *
 * 不可变字符串：String类没有提供用于修改字符串的方法。因此在Java文档中将String类对象称为不可变字符串。
 *
 * 检测字符串是否相等：equala
 *      equalsIgnoreCase：不区分大小写，比较两个字符串是否相等
 *      一定不能使用==运算符检测两个字符串是否相等！这个运算符只能确定两个字符串是否放置在同一个位置上，
 *
 *
 **/
public class CharacterString {
    public static void main(String[] args) {
        String e = "";//空字符串
        String greeting = "hello";//一个hello的字符串

        String s = greeting.substring(0,3);
        System.out.println(s);

        String str1="aaa";
        String str2 = "bbb";
        String str3 = str1+str2;
        System.out.println(str3);

        String str4 = "hello";
        System.out.println("hello"==str4);//TRUE
        System.out.println("hel"==str4.substring(0,3));//FALSE

        System.out.println(str4.charAt(0));//h

        StringBuilder sb = new StringBuilder();
        sb.append("aaa");
        sb.append(123);
        System.out.println(sb.toString());
    }
}
