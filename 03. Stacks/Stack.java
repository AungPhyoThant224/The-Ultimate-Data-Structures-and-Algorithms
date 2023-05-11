import java.util.Arrays;

public class Stack {

    //-------------- Mosh solution ------------
    private int[] items = new int[5];
    private int count;

    public void push(int item){
        if(count == items.length){
            throw new StackOverflowError();
        }
        items[count++] = item;
    }

    public int pop(){
        if(count == 0){
            throw new IllegalStateException();
        }
        return items[--count];
    }

    public int peek(){
        if(count == 0){
            throw new IllegalStateException();
        }
        return items[count-1];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public int min(){
        int minValue = items[0];
        for(int i = 0; i < count; i++){
            if(items[i] < minValue){
                minValue = items[i];
            }
        }
        return minValue;
    }

    @Override
    public String toString(){
        var content = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(content);
    }

    //-------------- My solution ------------
    // int[] items = new int[0];
    // int count= 0;

    // public void push(int item){
    //     count++;
    //     int[] newItems = new int[count];
    //     for(int i = 0; i < items.length; i++){
    //         newItems[i] = items[i];
    //     }
    //     items = newItems;
    //     items[count-1] = item;
    // }

    // public void pop(){
    //     if(count > 0){
    //         count--;
    //         int[] newItems = new int[count];
    //         for(int i = 0; i < newItems.length; i++){
    //             newItems[i] = items[i];
    //         }
    //         items = newItems;
    //     }
    // }

    // public int peek(){
    //     if(count > 0){
    //         return items[count-1];
    //     }
    //     return -1;
    // }

    // public boolean isEmpty(){
    //     if(count <= 0){
    //         return true;
    //     }
    //     return false;
    // }

    // public void print(){
    //     System.out.println(Arrays.toString(items));
    // }
}
