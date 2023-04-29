import java.lang.reflect.Array;
import java.util.Locale;

public class Lecture4Exercises {

    /*
     *   implement a function that returns factorial of given n
     *   lecture 4 page 15
     */
    public long factorial(int n) {
        int ans = 1,i=n;

        while (i!=0){
            ans*=i;
            i--;
        }

        return ans;
    }

    /*
     *   implement a function that return nth number of fibonacci series
     *   the series -> 1, 1, 2, 3, 5, 8, ...
     *   lecture 4 page 19
     */
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

    /*
     *   implement a function that return reverse of a given word
     *   lecture 4 page 19
     */
    public String reverse(String word) {
        String reversed="";

        for (int i=word.length()-1;i>=0;i--){
            reversed = reversed + word.charAt(i);
        }

        return reversed;
    }

    /*
     *   implement a function that returns true if the given line is
     *   palindrome and false if it is not palindrome.
     *   palindrome is like 'wow', 'never odd or even', 'Wow'
     *   lecture 4 page 19
     */
    public boolean isPalindrome(String line) {
        String line1 = line;
        line1 = line1.replaceAll("\\s", "");
        line1 = line1.toLowerCase(Locale.ROOT);
        return reverse(line1).equals(line1);
    }

    /*
     *   implement a function which computes the dot plot of 2 given
     *   string. dot plot of hello and ali is:
     *       h e l l o
     *   h   *
     *   e     *
     *   l       * *
     *   l       * *
     *   o           *
     *   lecture 4 page 26
     */
    public char[][] dotPlot(String str1, String str2) {
        char [][] ans = new char[str1.length()][str2.length()];
        for (int i=0;i<str1.length();i++){
            for (int j=0;j<str2.length();j++){
                if (str1.charAt(i)==str2.charAt(j)){
                    ans[i][j]='*';
                }
                else{
                    ans[i][j]=' ';
                }
            }
        }

        return ans;
    }
}
