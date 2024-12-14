package dsa;

import java.util.Stack;

public class ParenthesisBalancing {

	public static boolean areParenthesesBalanced(String expression) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);

			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			} else if (ch == ')' || ch == ']' || ch == '}') {
				if (stack.isEmpty()) {
					return false; // Stack underflow, no matching opening parenthesis
				}

				char top = stack.pop(); // Pop top of the stack to check for matching opening parenthesis
				if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
					return false; // Mismatched parentheses
				}
			}
		}

		return stack.isEmpty(); // If stack is empty, parentheses are balanced
	}

	public static void main(String[] args) {
		String expression1 = "{[()]}";
		String expression2 = "{[(])}";
		String expression3 = "{[(";

		System.out.println("Expression 1: " + expression1 + " - "
				+ (areParenthesesBalanced(expression1) ? "Balanced" : "Unbalanced"));
		System.out.println("Expression 2: " + expression2 + " - "
				+ (areParenthesesBalanced(expression2) ? "Balanced" : "Unbalanced"));
		System.out.println("Expression 3: " + expression3 + " - "
				+ (areParenthesesBalanced(expression3) ? "Balanced" : "Unbalanced"));
	}
}
