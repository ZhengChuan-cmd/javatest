package jichu;
/**
 * 运算符
*/
public class yunsuanfu {
    public static void main(String[] args) {
        //1.算术运算符
        int a = 10;
        int b = 3;
        System.out.println("a + b = " + (a + b)); //加法
        System.out.println("a - b = " + (a - b)); //减法
        System.out.println("a * b = " + (a * b)); //乘法
        System.out.println("a / b = " + (a / b)); //除法
        System.out.println("a % b = " + (a % b)); //取模

        //2.关系运算符
        System.out.println("a > b: " + (a > b)); //大于
        System.out.println("a < b: " + (a < b)); //小于
        System.out.println("a == b: " + (a == b)); //等于 比较基本类型值或者引用地址
        System.out.println("a != b: " + (a != b)); //不等于

        //3.逻辑运算符
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y)); //逻辑与
        System.out.println("x || y: " + (x || y)); //逻辑或
        System.out.println("!x: " + (!x)); //逻辑非
        System.out.println("x & y: " + (x & y)); //按位与
        System.out.println("x | y: " + (x | y)); //按位或
        System.out.println("x ^ y: " + (x ^ y)); //按位异或 可以用于快速交换两个数

        //按位异或 可以用于快速交换两个数
        int x1 = 10;
        int y1 = 3;
        x1 ^= y1; 
        System.out.println("x: " + x1+" y: " + y1);
        x1 ^= y1; 
        System.out.println("x: " + x1+" y: " + y1);

        //4.位运算符 (仅对整型有效)
        int m = 5; //二进制：0000 0101
        int n = 3; //二进制：0000 0011
        System.out.println("m & n: " + (m & n));
        System.out.println("m | n: " + (m | n));
        System.out.println("m ^ n: " + (m ^ n));
        System.out.println("~m: " + (~m));
        System.out.println("m << 1: " + (m << 1)); //左移一位
        System.out.println("m >> 1: " + (m >> 1)); //右移一位（高位补1）
        System.out.println("m >>> 1: " + (m >>> 1)); //无符号右移一位（高位补0）

        //5.赋值运算符 +=、-=、*=、/=、%=、&=、|=、^=、<<=、>>=、>>>=
        //自动强制转换 
        byte o = 1; 
        System.out.println("o+=1: " + (o+=1)); //自动强制转换为byte类型

        //6.instanceof运算符 用于判断一个对象是否是某个类的实例 java 16+ 支持模式匹配 instanceof
        String str = "Hello";
        System.out.println("str instanceof String: " + (str instanceof String)); //true
        //java 16+ 支持模式匹配 instanceof
        if (str instanceof String s) {
            System.out.println("s: " + s); //s: Hello
        }
    }
}
