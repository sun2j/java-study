package com.wx.javacore.day01;

/**
 * @author wangxu
 * @date 2018/05/14
 * @description
 * 运算符：使用算数运算符：+、-、*、/、表示加、减、乘、除运算。
 *         当参与除的两个操作数都是整数，表示整数除法；否则，表示浮点数除法。
 *         整数的求余操作（取模）用%表示。
 *
 * 自增、自减运算符i++,i--;++i,--i
 *
 * 关系运算符、boolean运算符：
 *      ==：检测是否相等
 *      <：小于
 *      <=：小于等于
 *      >：大于
 *      >=：大于等于
 *      !=：不等于
 *
 *      expression1 || expression2(或) ：如果第一个表达式为真，则第二个表达式不需要计算
 *      expression && expression2(与)：如果第一个表达式为真，则接着计算第二个表达式；否则第二个表达式不需要计算。
 *
 *      三元表达式：如果条件为真，计算第一个表达式，否则计算第二个表达式
 *      condition ? expression1:expression2
 *
 * 位运算符:
 *      &(与)、|（或）、^（异或）、~（非）、>>:将二进制位进行右移操作，<<:将二进制位进行左移操作。>>>运算符将用0填充高位，>>运算符将用符号位填充高位。
 *
 * 数学函数与常量
 *      Math类：sqrt(x)求x平方根、pow(x,a)求x的a次幂，常用三角函数
 *      π:Math.PI
 *      e常量：Math.E
 *
 * 数值类型之间的转换
 *  将两个操作数进行二元操作，则需要先将两个操作数转换为同一种类型，然后在计算：
 *  1.如果两个操作数中一个是double，另一个操作数就会转换为double类型
 *  2.否则，如果其中一操作数是float ,另一个操作数就转换为float类型
 *  3.否则，如果其中一操作数是long,另一个操作数就转换为long类型
 *  4.否则，两个操作数都将被转换为int类型。
 *
 *  强制类型转换：
 *      通过截断小数部分将浮点值转换为整型
 *      double x = 9.9997;
 *      int nx = (int)x;
 *
 * 枚举类型：
 *      变量的取值只在一个有限的集合内，此时可以自定义枚举类型。
 **/
public class Operator {
    enum SIZE  {SMALL,MEDIUM,LARGE,EXTRA_LARGE};
    public static void main(String[] args) {

        int a = 15;
        int b = 2;

        System.out.println(a + b);//17
        System.out.println(a - b);//13
        System.out.println(a * b);//30
        System.out.println(a / b);//1
        System.out.println(15.0 / 2);//7.5
        System.out.println(a % b); //1
        System.out.println(15.0 % 2);//1.0

        // System.out.println(1 / 0);//  整数被0除异常
        System.out.println(1.0 / 0);//Infinity   浮点数被0除将会得到无穷大或NaN。

        //二元运算符
        System.out.println("二元运算符");
        int c = 1;
        c += 2;//等价于c = c + 2
        System.out.println(c);

        //自增运算符
        System.out.println("自增运算符");
        int i = 1;
        System.out.println(2 * i++);//i++先使用i原来的值计算，再将i+1     此时2 * 1
        System.out.println(2 * ++i);//++i先进行加1操作，再将结果用来计算。 此时 2 * 3
        System.out.println(i);

        //关系、boolean运算符
        System.out.println("关系、boolean运算符");
        System.out.println(1 == 1);
        System.out.println(1 > 1);
        System.out.println(1 < 1);
        System.out.println(true && false);
        System.out.println(true && true);
        System.out.println(true || false);
        System.out.println(false || true);

        System.out.println(true ? 1 : 2);
        System.out.println(false ? 1 : 2);

        //位运算符&(与)、|（或）、^（异或）、~（非）
        System.out.println("位运算符");
        int j = 8;//二进制：1000；
        System.out.println("右移");
        System.out.println(j>>1);//4 将二进制位右移一位：0100
        System.out.println(j>>2);//2 右移两位：0010
        System.out.println(j>>3);//1 右移3位 0001
        System.out.println(j>>4);//0 右移4位0000
        System.out.println("左移");
        System.out.println(j<<1);//16 左移1位 10000

        //数值类型之间的装换
        System.out.println("数值类型之间的转换");
        int n = 123456789;
        float f = n;
        System.out.println(n);//123456789
        System.out.println(f);//1.23456792E8,存在精度丢失

        //强制类型转换
        System.out.println("强制类型转换");
        double x = 9.9997;
        int nx = (int)x;
        System.out.println(x);
        System.out.println(nx);//9
        nx = (int)Math.round(x);//10
        System.out.println(nx);

        //枚举类型
        System.out.println("枚举类型");
        SIZE s = SIZE.SMALL;
        System.out.println(s);

    }
}
