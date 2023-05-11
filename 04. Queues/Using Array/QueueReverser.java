import java.util.Arrays;

public class QueueReverser {
    int[] items = {30, 20, 10, 40, 50};

    public Object reverse(int k){
        int[] newItems = new int[items.length];
        for(int i = 0; i < items.length ; i++){
            if(i < k){
                newItems[i] = items[k - i - 1];
            }
            else{
                newItems[i] = items[i];
            }
        }
        return Arrays.toString(newItems);
    }
}
