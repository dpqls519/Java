//1
//import java.util.LinkedList;
//
//public class Test {
//
//	public static void main(String[] args) {
//		LinkedList<Integer> stack = new LinkedList<>(); // ���߿��Ḯ��Ʈ ����
//
//		stack.addLast(1); // list.push(1)
//		stack.addLast(2); // list.push(2)
//		stack.addLast(3); // list.push(3)
//		System.out.println("���� ��ü ����: " + stack);
//		System.out.println("���� ũ��=" + stack.size());
//		System.out.println("������ ��� �ִ°�? " + stack.isEmpty());
//		int v;
//		v = stack.getLast();
//		System.out.println("���� top ��ġ �ڷ� Ȯ��=" + v);
//		v = stack.removeLast(); // list.pop()
//		System.out.println("����top ��ġ �ڷ� ����=" + v);
//		System.out.println("���� ��ü ����: " + stack);
//		System.out.println("���� top ��ġ �ڷ� ����=" + stack.removeLast());
//		System.out.println("���� ��ü ����: " + stack);
//		System.out.println("���� top ��ġ �ڷ� ����=" + stack.removeLast());
//		System.out.println("���� ��ü ����: " + stack);
//		System.out.println("������ ��� �ִ°�? " + stack.isEmpty());
//	}
//}

//2
//import java.util.Stack;
//
//public class Test {
//	public static void main(String args[]) {
//		Stack<String> stack = new Stack<>();
//		stack.push("��");
//		stack.push("ȭ");
//		stack.push("��");
//		System.out.println("������ ��ü ����: " + stack);
//		System.out.println("���� ũ��= " + stack.size());
//		System.out.println("������ ��� �ִ°�? " + stack.isEmpty());
//		String v;
//		v = stack.peek();
//		System.out.println("���� top ��ġ �ڷ� Ȯ��= " + v);
//		System.out.println("���� ��ü ����: " + stack);
//		System.out.println("���� top ��ġ �ڷ� ����=" + stack.pop());
//		System.out.println("���� ��ü ����: " + stack);
//		System.out.println("���� top ��ġ �ڷ� ����=" + stack.pop());
//		System.out.println("���� ��ü ����: " + stack);
//		System.out.println("������ ��� �ִ°�? " + stack.isEmpty());
//	}
//}

//3
//import java.util.Stack;
//
//public class Test {
//	public static void main(String args[]) {
//		String s = "���ѹα��� ������ �����̴�.";
//		Stack<Character> stack = new Stack<>();
//		for (int i = 0; i < s.length(); i++) {
//			char c = s.charAt(i);
//			stack.push(c);
//		}
//		while (stack.isEmpty() == false) {
//			System.out.print(stack.pop());
//		}
//	}
//}

//4
//import java.util.LinkedList;
//
//public class Test{
//	public static void main(String args[]) {
//		String s="���ѹα��� ������ �����̴�.";
//		LinkedList<Character> stack=new LinkedList<>();
//		for (int i = 0; i < s.length(); i++) {
//			stack.push(s.charAt(i));
//		}
//		while (stack.isEmpty() == false) {
//			System.out.print(stack.pop());
//		}
//	}
//}

//5
//import java.util.Stack;
//
//public class Test {
//	public static void main(String args[]) {
//		String s = "(1+3*(4+5))/(6*(7+8))";
//		System.out.println(checkParen(s));
//	}
//
//	private static boolean checkParen(String s) {
//		Stack<Character> stack = new Stack<>();
//		for (Character c : s.toCharArray()) {
//			if (c == '(')
//				stack.push(c);
//			else if (c == ')')
//				if (stack.isEmpty() == true)
//					return false;
//				else
//					stack.pop();
//			else continue;
//		}
//		if (stack.isEmpty() == true) {
//			return true;
//		}
//		return false;
//	}
//}

//6
//import java.util.Stack;
//
//public class Test {
//	public static void main(String args[]) {
//		String s = "�λ�({Busan}[(Boo)(saan)])��û({City}{hall}[(See)(Cheong)])";
//		System.out.println(checkParen(s));
//	}
//
//	private static boolean checkParen(String s) {
//		Stack<Character> stack = new Stack<>();
//		for (Character c : s.toCharArray()) {
//			if (c == '(' || c == ')') {
//				if (c == '(')
//					stack.push(c);
//				else {
//					if (stack.isEmpty() == true)
//						return false;
//					else
//						stack.pop();
//				}
//			} 
//			else if (c == '{' || c == '}') {
//				if (c == '{')
//					stack.push(c);
//				else {
//					if (stack.isEmpty() == true)
//						return false;
//					else
//						stack.pop();
//				}
//			} 
//			else if (c == '[' || c == ']') {
//				if (c == '[')
//					stack.push(c);
//				else {
//					if (stack.isEmpty() == true)
//						return false;
//					else
//						stack.pop();
//				}
//			}
//			else continue;
//		}
//		if (stack.isEmpty() == true) {
//			return true;
//		}
//		System.out.println(stack);
//		return false;
//	}
//}

//7
//import java.util.Stack;
//
//public class Test{
//	public static void main(String args[]) {
//		int n1,n2;
//		Stack<Integer> stack = new Stack<>();
//		stack.push(3);
//		stack.push(4);
//		stack.push(5);
//		
//		n2=stack.pop();
//		n1=stack.pop();
//		System.out.println(n2+" "+n1);
//		stack.push(n1+n2);
//		
//		n2=stack.pop();
//		n1=stack.pop();
//		System.out.println(n2+" "+n1);
//		stack.push(n1*n2);
//		System.out.println("�����="+stack.pop());
//	}
//}

//����
//public class Test {
//	public static void main(String args[]) {
//		char v[] = { 'K', 'O', 'R', 'E', 'A' };
//		for (int i = 0; i < v.length; i++) {
//			System.out.println(v[i]);
//		}
//		for (char c : v) {
//			System.out.println(c);
//		}
//		String s="Korea";
//		char vv[]=s.toCharArray();  //���ڿ��� �ִ� ���ڸ� ���ڹ迭�� ����� ���� �ϳ��ϳ��� �ҷ���
//		for (char c : vv) {
//		}
//		for(char c:s.toCharArray()){
//		}
//	}
//}

//8
//import java.util.StringTokenizer;
//public class Test {
//	public static void main(String args[]) {
//		String e="2018-09-17 17:23:49";
//		StringTokenizer stok = new StringTokenizer(e,"-:");
//		while(stok.hasMoreTokens()) {
//			System.out.println(stok.nextToken());
//		}		
//	}
//}

//9
//import java.util.Arrays;
//
//public class Test {
//	public static void main(String[] args) {
//		String e = "3 1 2 / *";
//		String v[] = e.split("\\s+");  //( ' ', '\t', '\r', '\n' )������ �ʴ� ���ڸ� �ϳ� �̻�
//		System.out.println(Arrays.toString(v));
//	}
//}

//10
//import java.util.Stack;
//
//public class Test {
//	public static void main(String[] args) {
//		String e = "3 1 2 / *";
//		System.out.println(postfixEval(e));
//	}
//
//	private static double postfixEval(String e) {
//		Stack<Double> stack = new Stack<>();
//		for (String token : e.split("\\s+")) {
////			System.out.println(stack);
//			if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {// ������
//				double n1 = stack.pop();
//				double n2 = stack.pop();
//				
//				if (token.equals("+"))
//					stack.push(n2 + n1);
//				else if (token.equals("-"))
//					stack.push(n2 - n1);
//				else if (token.equals("*"))
//					stack.push(n2 * n1);
//				else if (token.equals("/"))
//					stack.push(n2 / n1);
////				System.out.println(stack);
//				
//			}
//			else {   //�ǿ�����
//				stack.push((double) Integer.parseInt(token));
////				System.out.println(stack);
//			}
//		}
//		return stack.pop();
//	}
//}

//12
//import java.util.Arrays;
//
//public class Test {
//	public static void main(String[] args) {
//		int stack[] = new int[5];  //ũ�� 5�� ���� ����
//		int top = -1;
//		//���ÿ� 5,9,1�� ���ʴ�� ����(push)
//		stack[++top] = 5;
//		stack[++top] = 9;
//		stack[++top] = 1;
//		System.out.println(Arrays.toString(stack) + ",top=" + top + ",���� ũ��=" + (top + 1));
//		System.out.println("������ ��� �ִ°�? " + (top == -1));
//		System.out.println("���� peek: " + stack[top]); // ���� top Ȯ�� peek
//		System.out.println("���� pop: " + stack[top--]); // ���ÿ��� �ڷ� ����(pop)	
//		System.out.println(Arrays.toString(stack) + ",top=" + top + ", ���� ũ��=" + (top + 1));
//		System.out.println("���� pop: " + stack[top--]); // ���ÿ��� �ڷ� ����(pop)
//		System.out.println(Arrays.toString(stack) + ", top=" + top + ", ����ũ��=" + (top + 1));
//		System.out.println("���� pop: " + stack[top--]); // ���ÿ��� �ڷ� ����(pop)
//		System.out.println(Arrays.toString(stack) + ", top=" + top + ", ����ũ��=" + (top + 1));
//		System.out.println("������ ��� �ִ°�? " + (top == -1));
//	}
//}

//13
//public class Test{
//	public static void main(String[] args){
//		String s="���ѹα��� ������ �����̴�.";
//		char stack[]=new char[s.length()];
//		int top=-1;
//		for (int i = 0; i < s.length(); i++) {
//			char c=s.charAt(i);
//			//���� c�� ���ÿ� push
//			stack[++top]=c;
//		}
//		while(top != -1)    //������ �ƴ� ���� 
//			System.out.print(stack[top--]);     //pop�� �ڷ�
//	}
//}

//15
//import java.util.Arrays;
//
//public class Test {
//	public static void main(String[] args) {
//		int n[] = { 1, 2, 3, 4 };
//		System.out.println(Arrays.toString(n));
//		int m[] = Arrays.copyOf(n, n.length * 2); // 2�� Ȯ��
//		n = m;
//		System.out.println(Arrays.toString(n));
//		n = Arrays.copyOf(n, (int) (n.length * 0.25)); // 1/4�� ���
//		System.out.println(Arrays.toString(n));
//	}
//}

//16
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int n[] = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(n));
		int m[] = arrayCopy(n, n.length * 2); // 2�� Ȯ��
		n = m;
		System.out.println(Arrays.toString(n));
		n = arrayCopy(n, (int) (n.length * 0.25)); // 1/4�� ���
		System.out.println(Arrays.toString(n));
	}

	private static int[] arrayCopy(int[] n, int newSize) {
		return n;

	}
}