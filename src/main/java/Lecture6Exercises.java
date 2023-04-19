import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lecture6Exercises {

    /*
     *   implement a function that takes an array of int and return sum of
     *   elements at even positions
     *   lecture 6 page  16
     */
    public long calculateEvenSum(int[] arr) {
        long sum=0;
        for(int i=0;i<arr.length;){
            sum+=arr[i];
            i+=2;
        }
        return sum;
    }

    /*
     *   implement a function that takes an array of int and return that
     *   array in reverse order
     *   lecture 6 page 16
     */
    public int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        int j=0;
        for(int i=arr.length - 1;i>=0;i--){
            reversed[j]=arr[i];
            j++;
        }
        return reversed;
    }

    /*
     *   implement a function that calculate product of two 2-dim matrices
     *   lecture 6 page 21
     */
    public double[][] matrixProduct(double[][] m1, double[][] m2) throws RuntimeException {
        int row = m1.length;
        int coloumn_row = m1[0].length;
        int coloumn = m2[0].length;
        double[][] r = new double[row][coloumn];
        for (int i=0;i<row;i++){
            for(int j=0;j<coloumn;j++){
                r[i][j]=0;
                for(int k=0;k<coloumn_row;k++){
                    r[i][j]+=m1[i][k]*m2[k][j];
                }
            }
        }
        return r;
    }

    /*
     *   implement a function that return array list of array list of string
     *   from a 2-dim string array
     *   lecture 6 page 30
     */
    public List<List<String>> arrayToList(String[][] names) {
        List<List<String>> ans = new ArrayList<>();
        for (int i=0;i< names.length;i++){
            ans.add(new ArrayList<String>(List.of(names[i])));
        }
        return ans;
    }

    /*
     *   implement a function that return a list of prime factor of integer n
     *   in ascending order
     *   lecture 6 page 30
     */
    public List<Integer> primeFactors(int n) {
        List<Integer> primes = new ArrayList<Integer>();
        for (int i=2;i<=n;i++){
            if (isPrime(i)){
                if (n%i==0){
                    primes.add(i);
                }
            }
        }

        return primes;
    }

    /*
     *   implement a function that return a list of words in a given string
     *   lecture 6 page 30
     */
    public List<String> extractWord(String line) {
        line = line.replaceAll("[$&+,:;=?@#|'<>.-^*()%!]" , "");
        List<String> myList = new ArrayList<String>(Arrays.asList(line.split(" ")));
        return myList;
    }

    public boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=num/2;i++)
        {
            if((num%i)==0)
                return  false;
        }
        return true;
    }
}
