// Ex01 - Considere uma fila vazia sobre vetores, para a qual foram executadas 32 inserções, 15 remoções, 5 das quais geraram fila vazia. Qual o tamanho atual da fila?
import java.util.Queue;
import java.util.LinkedList;

public class Exercise1 {
    public static void main(String[] args) {

        // queue = FIFO data structure
        Queue<Integer> queue = new LinkedList<Integer>();

        // enqueue = offer()
        for (int i = 0; i <= 32; i++){
            queue.offer(i);
        }

        // dequeue = poll()
        for (int i = 0; i <=15; i++){
            System.out.println(queue.poll());
            System.out.println(queue.isEmpty());
        }


        // print queue
        System.out.println(queue);
    }   
}
