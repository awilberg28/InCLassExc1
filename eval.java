import java.util.Stack;
public class eval {

    public static double evaluatePostfix(String expr){

        String[] parts = expr.split(" +"); 
        Stack<Double> stank = new Stack<>();

        for(String p : parts){
            switch (p) {
            case "+": 
                stank.push(stank.pop()+stank.pop());
                break;
            case "-":
                stank.push(stank.pop()*(-1) + stank.pop());
                break;
            case "*":
                stank.push(stank.pop() * stank.pop());
                break;
            case "/":
                stank.push(1/stank.pop() * stank.pop());
                break;
            default:
                stank.push(Double.parseDouble(p));

        }


        
     }

     return stank.pop();


}

public static void main(String[] args) {
    // Test the evaluatePostfix method
    eval evaluator = new eval();

    // Example Postfix expressions to evaluate
    String expression1 = "3 4 +";             // Expected output: 7.0
    String expression2 = "10 2 /";            // Expected output: 5.0
    String expression3 = "5 1 2 + 4 * + 3 -"; // Expected output: 14.0
    String expression4 = "6 2 3 + -";         // Expected output: 1.0
    String expression5 = "2.5 1.5 +";         // Expected output: 4.0
    String expression6 = "10.5 2.5 /";        // Expected output: 4.2
    String expression7 = "4.5 3.2 1.1 + *";   // Expected output: 19.44
    String expression8 = "12.7 2.3 3.1 * +";  // Expected output: 19.83
    String expression9 = "8.5 2.0 - 4.0 /";   // Expected output: 1.625

    // Evaluate and print the results
    System.out.println("Result of '" + expression1 + "': " + evaluator.evaluatePostfix(expression1));
    System.out.println("Result of '" + expression2 + "': " + evaluator.evaluatePostfix(expression2));
    System.out.println("Result of '" + expression3 + "': " + evaluator.evaluatePostfix(expression3));
    System.out.println("Result of '" + expression4 + "': " + evaluator.evaluatePostfix(expression4));
    System.out.println("Result of '" + expression5 + "': " + evaluator.evaluatePostfix(expression5));
    System.out.println("Result of '" + expression6 + "': " + evaluator.evaluatePostfix(expression6));
    System.out.println("Result of '" + expression7 + "': " + evaluator.evaluatePostfix(expression7));
    System.out.println("Result of '" + expression8 + "': " + evaluator.evaluatePostfix(expression8));
    System.out.println("Result of '" + expression9 + "': " + evaluator.evaluatePostfix(expression9));
}
}

