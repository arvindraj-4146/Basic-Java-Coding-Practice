public class SwapWithoutThirdvar {

    public static void swapValuesWithoutThirdVariable(int m, int n){

        m = m-n;
        n = m+n;
        m = n-m;

        System.out.println("Values of m is " + m + "Valuse of n is " + n);
    }
    public static void main(String[] args){

        int m = 9, n = 5;

        swapValuesWithoutThirdVariable(m, n);
    }

    
}
