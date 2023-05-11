class Main {
    public static void main(String[] args){
       QueueWithTwoStacks queue = new QueueWithTwoStacks();

       queue.enqueue(10);
       queue.enqueue(20);
       queue.enqueue(30);
       queue.enqueue(40);
       System.out.println(queue.peek());
    }
}
