package hackerrank;

import java.util.Scanner;

public class StdinFormating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            // 15 char for string and 3 digit for integer
            System.out.printf("%-15s", s1);
            //diawali angka 0 max 3 char
            System.out.printf("%03d", x);
            System.out.println();
        }
        System.out.println("================================");

    }

}
