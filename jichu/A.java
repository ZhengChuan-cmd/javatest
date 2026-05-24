package jichu;

public class A {
    { 
        System.out.print("A_inst "); 
    }
    static {
        System.out.print("A_static ");
    }
    A() {
        System.out.print("A_con "); 
    }
}
