import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        var list = new LinkedList();
        list.addLast(10); 
        list.addLast(20); 
        list.addLast(30);
        list.addLast(40);
        // list.printMiddle();
        System.out.println(list.hasLoop());
        // System.out.println(list.getKthFromTheEnd(2));
        // list.removeLast();
        // list.addFirst(1);
        // list.reverse();
        // int[] array = list.toArray();
        // System.out.println(Arrays.toString(array));
        // System.out.println(list.size());
        // System.out.println(list.contains(30));
        // list.print();
    }
}