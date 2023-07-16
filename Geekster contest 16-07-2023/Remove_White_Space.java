// https://www.hackerrank.com/contests/ks-02-m3-contest-02-geekster/challenges/remove-white-space

import java.io.*;
import java.util.*;

public class Remove_White_Space {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
            }
        }
        
        System.out.println(sb);
    }
}