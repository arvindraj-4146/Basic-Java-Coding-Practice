public class Swap {

    public static void swapValuesUsingThirdVariable(int n ,int m){

        int temp = m;
        m = n;
        n = temp;
        System.out.println("Value of m is" + m + "and value of n is " + n);

    }
    public static  void main(String[] args){

        int m = 9, n = 5;

        swapValuesUsingThirdVariable(n, m);
    }
  
}
