import java.util.*;

public class PriorityQueueTest {
    public static void main(String[] args) {
        // queue is a interface only
        // Priority Queue = FIFO data structure
        
        // equeue = offer()
        // dequeue = poll()

        // creating a queue that receive double numbers
        // Priority Queue arranges them in crescent order
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        // offer() to equeue
        queue.offer(3.4);
        queue.offer(2.5);
        queue.offer(4.6);
        queue.offer(1.0);
        queue.offer(1.2);

        // display elements with while() loop
        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); //FIFO
        }

    }
}
