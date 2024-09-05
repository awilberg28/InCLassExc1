import java.util.Stack;
public class Exc2 {
    public boolean isValid(String s){
        Stack<Character> charStack = new Stack<>();
        if (s.length() <= 1 || s.length() % 2 == 1){
            return false;
        }
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
            charStack.push(s.charAt(i));
            }
            else {
                if (charStack.isEmpty()) {
                    return false;
                }
                if(s.charAt(i) == ')'){
                    if(charStack.pop() != '('){
                        return false;
                    }
                }
                if(s.charAt(i) == '}'){
                    if(charStack.pop() != '{'){
                        return false;
                    }
                }
                if(s.charAt(i) == ']'){
                    if(charStack.pop() != '['){
                        return false;
                    }
                }


            }
        }
        return true;
    }
    public static void main(String[] args) {
        Exc2 exc2 = new Exc2();
        System.out.println(exc2.isValid("(){}[]"));  
        System.out.println(exc2.isValid("([{}])"));  
        System.out.println(exc2.isValid("([)]"));    
        System.out.println(exc2.isValid("{[}"));     
    }
}
