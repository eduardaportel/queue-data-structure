import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // Queue is a template/interface and we need a class to apply it
        // 2 types of class: LinkedList and PriorityQueue

        // initialize a queue with LinkedList
        Queue<String> queue = new LinkedList<String>();

        // example: a line of people

        // FIFO 
        // enqueue = offer()
        queue.offer("Karen");
        queue.offer("Ms. Jackson");
        queue.offer("Steve");
        queue.offer("Harold");

        // print queue
        System.out.println(queue);


    };
}