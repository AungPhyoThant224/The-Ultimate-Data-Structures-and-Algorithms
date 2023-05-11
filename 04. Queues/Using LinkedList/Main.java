class Main{
    public static void main(String[] args) {
        
        QueueWithLinkedList queue = new QueueWithLinkedList();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
    }
}