package codewars;

public class Sum {
    public static void main(String[] args) {
        System.out.println("my formula : " + GetSum(-3,1));
        System.out.println("euler formula : " + GetSum2(1,-3));
    }

    public static int GetSum(int a, int b)
    {
        int cont = 0;
        if(a < b){
            for (int i = a; i <= b; i++){
                cont+=i;
            }
        }else if(a==b){
            cont += a;
        }else{
            for(int i=b; i<=a;i++){
                cont+=i;
            }
        }
        return cont;
    }
    // Euler formula tu sum up all numbers form  0 to bigger
    public static int GetSum2(int smaller, int bigger){
        if(bigger < smaller){
            return GetSum2(bigger, smaller);
        }else{
            return (bigger + smaller) * (bigger - smaller +1) / 2;
        }
    }

}
