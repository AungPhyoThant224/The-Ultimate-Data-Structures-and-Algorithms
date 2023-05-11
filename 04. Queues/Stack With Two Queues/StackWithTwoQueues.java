import java.util.ArrayDeque;
import java.util.Queue;

public class StackWithTwoQueues {
    Queue<Integer> items1 = new ArrayDeque<>();
    Queue<Integer> items2 = new ArrayDeque<>();
    int count;

    public void push(int item){
        items1.add(item);
        count++;
    }

    public int pop(){
        moveItems1ToItem2();
        count--;
        return items2.remove();
    }

    public int peek(){
        moveItems1ToItem2();
        return items2.peek();
    }

    public int size(){
        return count;
    }

    public boolean isEmpty(){
        return items1.isEmpty() && items2.isEmpty();
    }

    public void moveItems1ToItem2(){

        if(isEmpty()){
            throw new IllegalStateException();
        }

        if(items2.isEmpty()){
            while(!items1.isEmpty()){
                items2.add(items1.remove());
            }
        }

        items1 = items2;
    }

    @Override
    public String toString(){
        return items1.toString();
    }
}
