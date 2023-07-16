// https://www.hackerrank.com/contests/ks-02-m3-contest-02-geekster/challenges/dec21-dsa-problem-3

import java.io.*;
import java.util.*;

public class Replace_With_2_100s {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i =0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int ele : arr) {
            if(ele > 100) {
                res.add(100);
                res.add(100);
            } else {
                res.add(ele);
            }
        }
        
        for(int r : res) {
            System.out.print(r + " ");
        }
    }
}