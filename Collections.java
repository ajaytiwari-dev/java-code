package Java;
import java.util.Stack;
class Collections{
	public static void main (String[]arg) {
		String s= "(){}[]";
		boolean status = ValidateStringBracket(s);
		System.out.println(s);
		System.out.println(status);
	}
	
	private static boolean ValidateStringBracket(String s) {
		Stack<Character> Stack = new Stack<Character>();
				
				for(int i=0; i<s.length();i++){
					char ch=s.charAt(i);
				
					 if (ch==']') {
						 if (Stack.peek()=='[') {
							 Stack.pop();
						 }else return false;
					 }else if(ch=='}') {
						 if (Stack.peek()=='{') {
							 Stack.pop();
						 }else return false;
					 }else if (ch==')')
						 if (Stack.peek()=='(') {
							 Stack.pop();
						 }else return false;
				}if (Stack.size()==0) {
					return true;
				}else {
					return false;
					}
		}
}