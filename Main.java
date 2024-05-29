import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // queue is a template/interface and we need a class to apply it
        // 2 types of class: LinkedList and PriorityQueue

        // initialize a queue with LinkedList
        Queue<String> queue = new LinkedList<String>();

        // example: a line of people
        // add = enqueue, offer()
        queue.offer("Karen");
        queue.offer("Ms. Jackson");
        queue.offer("Steve");
        queue.offer("Harold");
        System.out.println(queue);

        // size()
        System.out.println("Number of elements: " + queue.size());

        // isEmpty() = true
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.isEmpty());

        // print queue
        // System.out.println(queue);


    };
}