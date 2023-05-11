import java.util.Arrays;

class Main{
    public static void main(String[] args){

        // String str = "abc";
        // StringReverser reverser = new StringReverser();
        // System.out.println(reverser.reverse(null));

        // String str = "<{([1] + 2)}>";
        // Expression expression = new Expression();
        // System.out.println(expression.isBalance(str));

        // Stack stack = new Stack();

        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // stack.push(2);
        // stack.push(1);
        
        // System.out.println(stack.min());
        // System.out.println(stack.pop());
        // System.out.println(stack.min());
        // System.out.println(stack.toString());
        // stack.print();
        // System.out.println(stack.peek());
        // System.out.println(stack.isEmpty());


        //------------Exercises--------------
        TwoStack stack = new TwoStack();

        stack.push1(1);
        stack.push2(2);
        stack.push1(3);
        stack.push2(4);
        System.out.println(stack.toString());
        System.out.println(stack.pop1());
        System.out.println(stack.pop2());

        System.out.println(stack.toString());
        System.out.println(stack.pop1());
        System.out.println(stack.pop2());

        System.out.println(stack.toString());
        System.out.println(stack.isEmpty1());
        System.out.println(stack.isEmpty2());

        System.out.println(stack.isFull());
    }
}