import static java.lang.Integer.bitCount;

public class BitCounting {
    public static void main(String[] args) {
        System.out.println(countBits(1234));
    }

    public static int countBits(int n){
        return bitCount(n);
    }
}
