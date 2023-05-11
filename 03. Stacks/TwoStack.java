import java.util.Arrays;

public class TwoStack {
    int[] items = new int[4];
    int top1 = -1;
    int top2 = items.length - 1;
    
    public void push1 (int item){
        if(isFull()){
            throw new StackOverflowError();
        }
        else{
            items[++top1] = item;
        }

    }

    public void push2(int item){
        if(isFull()){
            throw new StackOverflowError();
        }
        else{
            items[top2--] = item;
        }
    }

    public int pop1(){
        if(top1 < 0){
            throw new IllegalStateException();
        }
        int item = items[top1];
        top1--;
        return item;
    }

    public int pop2(){
        if(top2 == items.length - 1){
            throw new IllegalStateException();
        }
        int item = items[++top2];
        return item;
    }

    public boolean isEmpty1(){
        return top1 < 0;
    }

    public boolean isEmpty2(){
        return top2 == items.length - 1;
    }

    public boolean isFull(){
        return top1 == top2;
    }

    @Override
    public String toString(){
        // var content = Arrays.copyOfRange(items, 0, 3);
        return Arrays.toString(items);
    }
}
