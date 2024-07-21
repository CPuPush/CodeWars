package hackerrank;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 1;
        while (in.hasNextLine()) {
            String s = in.nextLine();
            System.out.println(n + " " + s);
            n++;
        }
//        boolean check = true;
//        int n = 1;
//        while(check){
//            String s = in.nextLine();
//            if(!s.equals("Read me until end-of-file.")){
//                System.out.println(n + " " + s);
//            }else{
//                System.out.println(n + " " + s);
//                check = false;
//            }
//            n++;
//        }
        in.close();
    }
}
