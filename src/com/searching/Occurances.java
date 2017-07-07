package com.searching;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kumavatj on 6/4/17.
 */
public class Occurances {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,6,7,8};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] - 1;
        }

        for (int i = 0; i < n; i++) {
            arr[arr[i]%n] = arr[arr[i]%n] + n;
        }

        System.out.println(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(i +1 + "---->" + arr[i]/n);
        }

    }


    public static String solution(String S) {
        // write your code in Java SE 8
        //return S;
        return result(S.toCharArray(), 0 , S.length());

    }

    private static String result(char[] chars, int i, int length) {
        if(i < length){
            return new String(chars);
        }

        return "";
    }

    private static Map<String, String>  r;
    {
        r = new HashMap<>();
        r.put("AB","AA");
        r.put("BA","AA");
        r.put("CB","CC");
        r.put("BC","CC");
        r.put("AA","A");
        r.put("CC","C");
    }


}
