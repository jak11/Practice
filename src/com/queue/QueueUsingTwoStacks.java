package com.queue;

import java.util.Stack;

/**
 * Created by kumavatj on 7/4/17.
 */
public class QueueUsingTwoStacks {
    Stack<Integer> s1 = null;
    Stack<Integer> s2 = null;

    public QueueUsingTwoStacks(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    public void enqueue(int i){
        s1.push(i);
    }
    public int dequeue(){
        if(!this.isEmpty()){
            if(!s2.isEmpty()){
                return s2.pop();
            }
        }

        return -1;
    }
    public boolean isEmpty(){
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        if(!s2.isEmpty()){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks q = new QueueUsingTwoStacks();
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        System.out.println("EMpty = [" + q.isEmpty() + "]");

        System.out.println("EMpty = [" + q.dequeue() + "]");
        System.out.println("EMpty = [" + q.dequeue() + "]");
        System.out.println("EMpty = [" + q.dequeue() + "]");

        System.out.println("EMpty = [" + q.dequeue() + "]");


    }
}
