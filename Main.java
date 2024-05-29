import java.util.Queue;
import java.util.LinkedList;

// queue : FIFO data structure, ex: a line of people
// linear data structure

public class Main {
    public static void main(String[] args) {

        // queue is a template/interface and we need a class to apply it
        // 2 types of class: LinkedList and PriorityQueue

        // initialize a queue with LinkedList
        Queue<String> queue = new LinkedList<String>();

        // add = enqueue, offer()
        queue.offer("Karen");
        queue.offer("Ms. Jackson");
        queue.offer("Steve");
        queue.offer("Harold");
        
        System.out.println(queue);

    };
}