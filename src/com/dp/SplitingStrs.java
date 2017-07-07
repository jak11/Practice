package com.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kumavatj on 6/15/17.
 */
public class SplitingStrs {
    public static void main(String[] args) {
        String[] in = new String[]{
          "w1#w2", "v1#v2#v3"
        };
        List<String> res = new ArrayList<>();
        for (String s: in) {
            String[] temp = s.split("#");
            for (String tmp: temp) {
                res.add(tmp);
            }
         }

        System.out.println("res = " + res);
    }
}
