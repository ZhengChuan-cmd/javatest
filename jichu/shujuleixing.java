package jichu;

/*
 * 数据类型
 */
public class shujuleixing {
    public static void main(String[] args) {
        //1.字节型 byte 8位
        byte a = 127;
        System.out.println("byte："+a);

        //2.短整型 short 16位
        short b = 32767;
        System.out.println("short："+b);
        
        //3.整型 int 32位
        int c = 2147483647;
        Integer d1 = Integer.valueOf(c);
        System.out.println("int："+c);
        System.out.println("Integer："+d1);
        
        //4.长整型 long 64位
        long d = 9223372036854775807L;
        System.out.println("long："+d);
        
        //5.浮点型 float 32位
        float e = 3.14f;
        Float e1 = Float.valueOf(e);
        System.out.println("float："+e);
        
        //6.双精度浮点型 double 64位
        double f = 3.141592653589793;
        Double f1 = Double.valueOf(f);
        System.out.println("double："+f);
        
        //7.字符类 char 16位
        char g = 'A'; 
        Character g1 = Character.valueOf(g);
        
        //8.布尔类型 boolean
        boolean h = true;
        Boolean h1 = Boolean.valueOf(h);
        System.out.println("boolean："+h);

    }
}
