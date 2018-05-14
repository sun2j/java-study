package com.wx.javacore.day01;

/**
 * @author
 * @date 2018/05/14
 * @description
 * java 数据类型：1.整型：用于表示没有小数部分的数值，它允许是负数。
 *                      int:4字节，
 *                      short:2字节
 *                      long:8字节
 *                      byte;1字节-128~127
 *                2.浮点型：用于表示没有小数部分的数值。
 *                      float:4字节
 *                      double:8字节
 *                3.char型：表示单个字符，通常用来表示字符常量。
 *                4.boolean :只有两个值：true,false,用来判定逻辑条件。
 *
 **/
public class DataType {
    public static void main(String[] args) {
        //整形
        int a =129;
        System.out.println(a);
        byte b = 127 ;
        System.out.println(b);

        int c_16 = 0x010;//十六进制16
        System.out.println(c_16);
        int c_8 =010;//八进制8
        System.out.println(c_8);
        long d = 12000L;
        System.out.println(d);


        //浮点型
        float e = 12.123456789f;
        System.out.println(e);
        double f = 12.123456789;
        System.out.println(f);

        //字符型
        char g = 'A';
        System.out.println(g);
        System.out.println('\u0061');//unicode编码
        char h = 'a';
        System.out.println(h);

        //boolean
        boolean i = true;
        System.out.println(i);
    }
}
