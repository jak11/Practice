package com.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kumavatj on 6/26/17.
 */
public class StreamTets {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println("args = [" + l.stream().mapToInt(i -> i.intValue()).sum() + "]");

    }
}
