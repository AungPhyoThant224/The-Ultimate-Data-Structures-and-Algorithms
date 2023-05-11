import java.util.Arrays;
import java.util.LinkedList;

public class QueueWithLinkedList {
    LinkedList<Integer> items = new LinkedList<>();

    public void enqueue(int item){
        items.addLast(item);
    }

    public int dequeue(){
        var i = items.removeFirst();
        return i;
    }

    public int peek(){
        var i = items.getFirst();
        return i;
    }

    public int size(){
        return items.size();
    }

    public boolean isEmpty(){
        return items.isEmpty();
    }

    public String toString(){
        var arr = items.toArray();
        return Arrays.toString(arr);
    }
}
