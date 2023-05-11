import java.util.Stack;

public class StringReverser {
    
    public String reverse(String input){
        Stack<Character> stack = new Stack<>();

        if(input == null){
            throw new IllegalArgumentException();
        }
        
        for(char ch : input.toCharArray()){
            stack.push(ch);
        }

        StringBuffer reverse = new StringBuffer();
        while(!stack.empty()){
            reverse.append(stack.pop());
        }

        return reverse.toString();
    }
}
