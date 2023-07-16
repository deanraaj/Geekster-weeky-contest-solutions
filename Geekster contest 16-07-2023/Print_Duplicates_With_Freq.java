// https://www.hackerrank.com/contests/ks-02-m3-contest-02-geekster/challenges/print-duplicates-with-frequency

import java.io.*;
import java.util.*;

public class Print_Duplicates_With_Freq {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i< n;i++) {
            int ele = arr[i];
            hm.put(ele, hm.getOrDefault(ele, 0) + 1);
        }
        
        for(int key : hm.keySet()) {
            if(hm.get(key) > 1) {
                System.out.println(key + "->" + hm.get(key));
            }
        }
    }
}