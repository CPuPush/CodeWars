package codewars;

public class FindPerfectSquare {
    public static void main(String[] args) {
        System.out.println(perfectSquare(676));
    }

    static long perfectSquare(long n){
        double cont = Math.sqrt(n);
        if(cont != Math.floor(cont)){
            System.out.println(Math.floor(cont));
            System.out.println(cont);
            return -1;
        }
        // the output will double so we have to convert to integer
        return (long) Math.pow(cont + 1, 2);
    }
}
