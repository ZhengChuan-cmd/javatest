package jichu;

public class hexinApi {
    public static void main(String[] args) {
        String s;
        StringBuilder sb;
        StringBuffer sb2;
        String a = "ab";
        String b = "a" + "b";
        System.out.println(a == b);        // ?
        System.out.println(System.identityHashCode(a));   
        System.out.println(System.identityHashCode(b));   
        String c = "a";
        String d = c + "b";
        System.out.println(a == d);        // ?
        System.out.println(System.identityHashCode(c));   
        System.out.println(System.identityHashCode(d));   
    }
}
