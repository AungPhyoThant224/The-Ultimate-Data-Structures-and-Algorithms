import java.util.Arrays;

class Main{
    public static void main(String[] args){
        // var queue = new ArrayQueue(5);
        // queue.add(10);
        // queue.add(20);
        // queue.add(30);
        // queue.add(40);
        // queue.add(50);
        // System.out.println(queue.peek());
        // queue.remove();
        // queue.add(60);
        // System.out.println(queue.peek());
        // System.out.println(queue);

        var queue = new PriorityQueue(5);
        queue.add(1);
        queue.add(3);
        queue.add(4);
        queue.add(2);
        queue.add(5);
        queue.add(7);
        queue.add(6);
        System.out.println(queue);

        while(!queue.isEmpty()){
            System.out.println(queue.remove());
        }

        QueueReverser reverser = new QueueReverser();
        var reverse = reverser.reverse(5);
        System.out.println(reverse);
    }

    // public static void reverse(Queue<Integer> queue){
    //     Stack<Integer> stack = new Stack<>();
    //     while(!queue.isEmpty()){
    //         stack.push(queue.remove());
    //     }

    //     while(!stack.isEmpty()){
    //         queue.add(stack.pop());
    //     }

    //     System.out.println(queue);
        
    // }
}