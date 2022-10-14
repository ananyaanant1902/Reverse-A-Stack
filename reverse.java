import java.util.*;
class reverse{
 public static void pushbottom(int data,Stack<Integer>stack){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        int top= stack.pop();
        pushbottom(data,stack);
        stack.push(top);
    }

    public static void reverse(Stack<Integer>stack){
        if(stack.isEmpty()){
            return;
        }
        int top= stack.pop();
        reverse(stack);
        pushbottom(top,stack);

    }
}
