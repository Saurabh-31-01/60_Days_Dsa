package DSA.day01;

import java.util.Stack;

// this give O(n) time, where n = length of String
public class ValidParantheses {

    public static boolean check(String s){
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '{'){
                stack.push('}');
            }else if(c == '['){
                stack.push(']');
            }else if(c == '('){
                stack.push(')');
            }else if(stack.isEmpty() || stack.pop() != c){
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "[{}]";

        boolean b = check(s);
        System.out.println(b);
    }

}
