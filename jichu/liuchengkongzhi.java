package jichu;

/**
 * 流程控制
 */
public class liuchengkongzhi {
    public static void main(String[] args) {
        //1.条件语句 if-else switch-case
        //switch 可以支持byte short char int  不支持 long float double boolean
        //java5 新增 枚举类enum 
        //java7 新增 String

        //2.循环语句 for while do-while
        //增强for循环 只能用于遍历数组和集合 不能修改元素值
        int[] arr = {1,2,3};
        for (int x : arr) {
            x = x * 2;
        }
        System.out.println(arr[0]);
        
        //do-while循环至少执行一次
        
        //3.跳转语句 break continue return
        for (int i = 0; i < 5; i++) {
            if (i == 2) continue;
            if (i == 4) break;
            System.out.print(i);
        }
        //带标签的break和continue
        outer: for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 1) continue outer;
                System.out.print(i + "" + j + " ");
            }
        }
        
        
        //4.异常处理 try-catch-finally throw throws
        //finally块中的return会覆盖try块中的return
        // System.out.println(test());

    }

    // public static int test() {
    //     try {
    //         return 1;
    //     } finally {
    //         return 2;
    //     }
    // }

}
