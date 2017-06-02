package com.searching;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by kumavatj on 5/20/17.
 */
public class FIndRepeatingNumber {
    public static void main(String args[]){
        Map<Integer, Integer> mp = new TreeMap<>();
        //String[] in = new String[] { "1 5 20", "3 6 15", "7 10 8"};
        String[] in = new String[] { "1 2 7", "5 8 2", "9 10 20"};
        for(int i =0; i < in.length ; i++){
            String l = in[i];
            if(l != ""){
                String[] data = l.split(" ");
                int st = Integer.parseInt(data[0]);
                int ed = Integer.parseInt(data[1]);
                int v = Integer.parseInt(data[2]);


                //mp.put(st, Integer.parseInt(data[2]));
                while(st <= ed){
                    if(mp.containsKey(st)){
                        int old = mp.get(st);
                        if(old > v){
                            mp.put(st, v);
                        }else{
                            mp.put(st, old);
                        }
                    }else {
                        mp.put(st, v);
                    }
                    st++;
                }
            }
        }



        int max = Collections.max(mp.keySet());
        int min = Collections.min(mp.keySet());

        while(min <= max){
            if(!mp.containsKey(min)){
                mp.put(min, 0);
            }
            min++;
        }

        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        {
            System.out.println(entry.getKey() + "   " + entry.getValue());
            // System.out.println(entry.getKey() + " " + entry.getValue());
        }

        int fkey = mp.keySet().iterator().next();
        int lastvale = mp.get(fkey);
        int lastKey = 0;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        {
            if(lastvale != entry.getValue()){
                System.out.print(fkey);
                System.out.print(" ");
                System.out.print(lastKey);
                System.out.print(" ");
                System.out.print(lastvale);
                lastvale = entry.getValue();
                fkey = entry.getKey();
                System.out.println();
            }else{
                lastKey = entry.getKey();
            }
        }
        System.out.print(fkey);
        System.out.print(" ");
        System.out.print(lastKey);
        System.out.print(" ");
        System.out.print(lastvale);



    }

}
