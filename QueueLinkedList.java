import java.util.Queue;
import java.util.LinkedList;

public class QueueLinkedList {
    public static void main(String[] args) {

        // Queue = FIFO data structure
        //      also is a template/interface and we need a class to apply it
        //      2 types of class: LinkedList and PriorityQueue

        // enqueue = offer()
        // dequeue = poll()

        // initialize a queue with LinkedList
        Queue<String> queue = new LinkedList<String>();

        // example: a line of people

        // FIFO 
        // enqueue
        queue.offer("Karen");
        queue.offer("Ms. Jackson");
        queue.offer("Steve");
        queue.offer("Harold");

        // print queue
        System.out.println(queue);


    };
}