package jichu;

public class B extends A {
    { 
        System.out.print("B_inst "); 
    }
    static {
        System.out.print("B_static ");
    }
    B() {
        System.out.print("B_con "); 
    }

}
