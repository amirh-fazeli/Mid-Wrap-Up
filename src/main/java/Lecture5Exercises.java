import java.util.Random;

public class Lecture5Exercises {

    /*
     *   implement a function to create a random password with
     *   given length using lower case letters
     *   lecture 5 page 14
     */
    public String weakPassword(int length) {
        String password = "";
        for (int i = 0; i < length; i++) {
            password = password + (char) randomNum(97, 122);
        }
        return password;
    }

    /*
     *   implement a function to create a random password with
     *   given length and at least 1 digit and 1 special character
     *   lecture 5 page 14
     */
    public String strongPassword(int length) throws Exception {
        return null;
    }

    /*
     *   implement a function that checks if a integer is a fibobin number
     *   integer n is fibobin is there exist an i where:
     *       n = fib(i) + bin(fib(i))
     *   where fib(i) is the ith fibonacci number and bin(i) is the number
     *   of ones in binary format
     *   lecture 5 page 17
     */
    public boolean isFiboBin(int n) {
        int i=0;
        while (fibonacci(i) + binSum(i) < n){
            i++;
        }

        return fibonacci(i) + binSum(i) == n;
    }

    public int randomNum(int a, int b) {
        Random r = new Random();
        int result = r.nextInt(b - a + 1) + a;
        return result;
    }



    static int binSum(int n) {
        int[] binaryNum = new int[1000];

        int i = 0;
        while (n > 0) {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }

        int sum = 0;
        for (int value : binaryNum) {
            sum += value;
        }

        return sum;
    }

    public long fibonacci(int n) {
        Long a= Long.valueOf(1),b= Long.valueOf(1),i= Long.valueOf(2);

        while(i<n){
            a+=b;
            b+=a;
            i+=2;
        }

        if(i==n){
            return b;
        }

        else{
            return a;
        }
    }

}
