// https://www.hackerrank.com/contests/ks-02-m3-contest-02-geekster/challenges/three-stacks

import java.io.*;
import java.util.*;

public class Three_Stacks {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        
        int h1[] = new int[n1];
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        
        for(int h1_i=0; h1_i < n1; h1_i++)
        {
            h1[h1_i] = in.nextInt();
            sum1 += h1[h1_i];
        }
        
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++)
        {
            h2[h2_i] = in.nextInt();
            sum2 += h2[h2_i];
        }
        
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++)
        {
            h3[h3_i] = in.nextInt();
            sum3 += h3[h3_i];
        }
        
        boolean equal = false;
        
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        
        while(!equal)
        {
            if((sum1 == sum2) && ( sum1 == sum3))
                equal = true;
            else
            {
                if(sum1 > sum2)
                {
                   if(sum1 > sum3)
                   {
                      sum1 -= h1[index1];
                      index1++;
                   }
                   else
                   {
                      sum3 -=h3[index3];
                      index3++;
                   } 
                 }
                 else
                 {
                     if(sum2 > sum3)
                     {
                         sum2 -= h2[index2];
                         index2++;
                     }
                     else
                     {
                         sum3 -= h3[index3];
                         index3++;
                     } 
                  }
              }
          }
          System.out.println(sum1);
    }
}