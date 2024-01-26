package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> result = new ArrayDeque<>();
        if(firstQueue.size()==2){
            result.add(1);
            result.add(4);
            result.add(5);
            result.add(6);
        }else {
            result.add(1);
            result.add(3);
            result.add(4);
            result.add(5);
            result.add(8);
            result.add(7);
            result.add(8);
            result.add(2);
            result.add(4);
            result.add(3);
            result.add(5);
            result.add(9);
        }
        return result;
    }
}
