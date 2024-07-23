package hackerrank;

import java.util.Scanner;

public class StaticInitializerBlock {

    public static int n;
    public static int k;
    public static boolean flag;
    public static void main(String[] args) {
        if(flag){
            int area = n * k;
            System.out.println(area);
        }
    }
    static{
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        k=in.nextInt();

        if(n <=0 || k<=0){
            flag=false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else {
            flag = true;
        }
    }
}
/*
! Static Initialization Blocks
This is especially useful if subclasses might want to reuse the initialization method
static dapat memanggil class static yang lain
* */