package com.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by kumavatj on 7/4/17.
 */
public class ReversingQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();

        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("args = [" + q + "]");
        while (!q.isEmpty()){
            s.push(q.poll());
        }

        while (!s.isEmpty()){
            q.add(s.pop());
        }
        System.out.println("args = [" + q + "]");

    }
}
