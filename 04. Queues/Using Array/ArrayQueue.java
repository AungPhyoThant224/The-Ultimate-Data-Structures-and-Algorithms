import java.util.Arrays;

public class ArrayQueue {
    
    private int[] items;
    
    public ArrayQueue(int capacity){
        items = new int[capacity];
    }

    int front = 0;
    int count;
    int rear = 0;

    public void add(int item){

        if(isFull()){
            throw new IllegalArgumentException();
        }

        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }

    public int remove(){
        int item = items[front];
        items[front] = 0;
        front = (front+1) % items.length;
        count--;
        return item;
    }

    public int peek(){
        if(isEmpty()){
            throw new IllegalArgumentException();
        }
        if(count == items.length && rear == 0){
            return items[items.length-1];
        }
        return items[rear-1];
    }

    public boolean isFull(){
        return count == items.length;
    }

    public boolean isEmpty(){
        return count <= 0;
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }
}
