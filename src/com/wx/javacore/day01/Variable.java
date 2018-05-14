package com.wx.javacore.day01;

/**
 * @author wangxu
 * @date 2018/05/14
 * @description
 * 变量：每一个变量都属于一种类型，在声明变量时，变量所属的类型位于变量名之前。
 *      变量名命名规则：1.必须是一个以字母开头的由字母或数字构成的序列。
 *                      2.大小写敏感
 *                      3.不能将常量名命名为java保留字
 * 常量：利用关键字final声明常量。表示该变量只能被赋值一次，一旦赋值就不能改变。常量名使用大写。
 *      希望某个常量在一个类中的多个方法中使用，通常将这些常量称为类常量。使用static final 设置一个类常量
 **/
public class Variable {

    static final boolean NO = false;
    public static void main(String[] args) {
        int number;
//        System.out.println(number);//不能使用未初始化的变量
        number = 12;
        System.out.println(number);

        final boolean YES = true;
//        YES = false;
        System.out.println(NO);
    }
}
