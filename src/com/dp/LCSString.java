package com.dp;

/**
 * Created by kumavatj on 6/5/17.
 */
public class LCSString {
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CD";
        System.out.println(LCS(s1,0,s1.length(),s2,0,s2.length()));
    }

    private static int LCS(String s1, int i, int n, String s2, int j, int m) {
        if(i == n || j == m){
            return 0;
        }
        else if(s1.charAt(i) == s2.charAt(j)){
            return  1 + LCS(s1,i+1,n,s2,j+1,m);
        } else {
            return Math.max(LCS(s1,i+1,n,s2,j,m), LCS(s1,i,n,s2,j+1,m));
        }
    }
}
