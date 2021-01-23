import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        double prob = (double)p1 / (double)p2;
        int firstFail = sc.nextInt();
        sc.close();
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println(df.format(Math.pow(1 - prob,firstFail - 1) * prob));
    }
}
