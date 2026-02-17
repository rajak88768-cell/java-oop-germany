import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("Germany");
        stack.push("Internship");

        System.out.println("Stack: " + stack);

        System.out.println("Top element: " + stack.peek());

        stack.pop();

        System.out.println("After pop: " + stack);
    }
}
