package com.searching;

/**
 * Created by kumavatj on 5/20/17.
 */
public class FIndOddNumber {
    public static void main(String args[]){
        int[] arr = new int[]{1,2,3,2,3,1,3};
        int X =0 ;
        for (int i = 0; i < arr.length; i++){
            X ^= arr[i];
        }
        System.out.println(X);
    }
}
