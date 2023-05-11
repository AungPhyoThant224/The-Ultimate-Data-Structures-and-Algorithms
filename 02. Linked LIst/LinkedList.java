public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;
    private Node reverseFirst;
    private Node reverseLast;

    public void addLast(int item){
        var node = new Node(item);
        if(isEmpty()){
            first = last = node;
        }
        else{
            last.next = node;
            last = node;
        }

        size++;
    }

    public void addFirst(int item){
        var node = new Node(item);

        if(isEmpty()){
            first = last = node;
        }
        else{
            node.next = first;
            first = node;
        }

        size++;
    }

    private boolean isEmpty(){
        return first == null;
    }

    public int indexOf(int item){
        int index = 0;
        var current = first;

        while(current != null){
            if(current.value == item){
                return index;
            }
            current = current.next;
            index++;
        }

        return -1;
    }

    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    public void removeFirst(){
        if(isEmpty()){
            throw new NullPointerException();
        }

        if(first == last){
            first = last = null;
        }
        else{
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    public void removeLast(){

        if(isEmpty()){
            throw new NullPointerException();
        }

        if(first == last){
            first = last = null;
        }
        else{
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
        size--;
        
    }

    private Node getPrevious(Node item){
        var current = first;
        while (current != null){
            if(current.next == item){
                return  current;
            }
            current = current.next;
        }
        return null;
    }

    public int size(){
        return size;
    }

    public int[] toArray(){
        int[] array = new int[size];
        var current = first;
        int index = 0;
        while(current != null){
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    //-----------Mosh Solution------------
    public void reverse(){
        if(isEmpty()){
            return;
        }
        var previous = first;
        var current = first.next;
        while(current != null){
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;
    }

    // ----------My Solution ---------------
    // public void reverse(){
    //     reverseFirst = null;
    //     reverseLast = null;
    //     for(int i = 0; i < size; i++){
    //         if(reverseFirst == null){
    //             reverseFirst = reverseLast = last;
    //         }
    //         else{
    //             reverseLast.next = last;
    //             reverseLast = last;
                
    //         }

    //         if(i != size - 1){
    //             var previous = getPrevious(last);
    //             last = previous;
    //             last.next = null;
    //         }
    //     }

    //     first = reverseFirst;
    //     last = reverseLast;

    // }


    public int getKthFromTheEnd(int k){
        
        if(isEmpty()){
            throw new IllegalArgumentException();
        }

        var pointA = first;
        var pointB = first;

        for(int i = 0; i < k - 1; i++){
            pointB = pointB.next;
            if(pointB == null){
                throw new IllegalArgumentException();
            }
        }

        while(pointB != last){
            pointA = pointA.next;
            pointB = pointB.next;
        }
        
        return pointA.value;
    }

    public void printMiddle(){

        if(isEmpty()){
            throw new IllegalArgumentException();
        }

        var pointA = first;
        var pointB = first;

        while(pointB != last && pointB.next != last){
            pointA = pointA.next;
            pointB = pointB.next.next;
        }

        if(pointB == last){
            System.out.println(pointA.value);
        }else{
            System.out.println(pointA.value + ", " + pointB.value);
        }
    }

    public boolean hasLoop(){
        var slow = first;
        var fast = first;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }

    public void print(){
        int index = 0;
        var current = first;

        while(current != null){
            System.out.println("{");
            System.out.println("  current : " + current);
            System.out.println("  index : " + index);
            System.out.println("  value : " + current.value);
            System.out.println("  next : " + current.next);
            System.out.println("}");
            current = current.next;
            index++;
        }
    }

}
