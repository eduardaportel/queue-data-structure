import java.util.*;

public class PriorityQueueTest {
    public static void main(String[] args) {
        /*
        Priority Queue = FIFO data structure that serves elements with the highest priorities first before elements with lower priority

        offer() = equeue
        poll() = dequeue
        */
   
        // queue of scholl grades 
        Queue<String> queue = new PriorityQueue<String>(Collections.reverseOrder()); // reverse alphabetical order

        // equeue elements
        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");

        // display those elements with while() loop
        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); //FIFO
        }

    }
}
