package hackerrank;

import java.util.Scanner;

public class JavaStdinStdout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Double  d = scan.nextDouble();
        // ketika berganti dari integer ke string maka kita harus nextLine kemudian diikuti next Line
        scan.nextLine();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

}
