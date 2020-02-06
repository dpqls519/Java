//1
//import java.util.LinkedList;
//
//public class Test {
//
//	public static void main(String[] args) {
//		LinkedList<Integer> stack = new LinkedList<>(); // 이중연결리스트 구현
//
//		stack.addLast(1); // list.push(1)
//		stack.addLast(2); // list.push(2)
//		stack.addLast(3); // list.push(3)
//		System.out.println("스택 전체 내용: " + stack);
//		System.out.println("스택 크기=" + stack.size());
//		System.out.println("스택이 비어 있는가? " + stack.isEmpty());
//		int v;
//		v = stack.getLast();
//		System.out.println("스택 top 위치 자료 확인=" + v);
//		v = stack.removeLast(); // list.pop()
//		System.out.println("스택top 위치 자료 제거=" + v);
//		System.out.println("스택 전체 내용: " + stack);
//		System.out.println("스택 top 위치 자료 제거=" + stack.removeLast());
//		System.out.println("스택 전체 내용: " + stack);
//		System.out.println("스택 top 위치 자료 제거=" + stack.removeLast());
//		System.out.println("스택 전체 내용: " + stack);
//		System.out.println("스택이 비어 있는가? " + stack.isEmpty());
//	}
//}

//2
//import java.util.Stack;
//
//public class Test {
//	public static void main(String args[]) {
//		Stack<String> stack = new Stack<>();
//		stack.push("월");
//		stack.push("화");
//		stack.push("수");
//		System.out.println("스택의 전체 내용: " + stack);
//		System.out.println("스택 크기= " + stack.size());
//		System.out.println("스택이 비어 있는가? " + stack.isEmpty());
//		String v;
//		v = stack.peek();
//		System.out.println("스택 top 위치 자료 확인= " + v);
//		System.out.println("스택 전체 내용: " + stack);
//		System.out.println("스택 top 위치 자료 제거=" + stack.pop());
//		System.out.println("스택 전체 내용: " + stack);
//		System.out.println("스택 top 위치 자료 제거=" + stack.pop());
//		System.out.println("스택 전체 내용: " + stack);
//		System.out.println("스택이 비어 있는가? " + stack.isEmpty());
//	}
//}

//3
//import java.util.Stack;
//
//public class Test {
//	public static void main(String args[]) {
//		String s = "대한민국의 수도는 서울이다.";
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
//		String s="대한민국의 수도는 서울이다.";
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
//		String s = "부산({Busan}[(Boo)(saan)])시청({City}{hall}[(See)(Cheong)])";
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
//		System.out.println("계산결과="+stack.pop());
//	}
//}

//설명
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
//		char vv[]=s.toCharArray();  //문자열에 있는 문자를 문자배열로 만들어 문자 하나하나씩 불러옴
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
//		String v[] = e.split("\\s+");  //( ' ', '\t', '\r', '\n' )보이지 않는 문자를 하나 이상
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
//			if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {// 연산자
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
//			else {   //피연산자
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
//		int stack[] = new int[5];  //크기 5의 스택 생성
//		int top = -1;
//		//스택에 5,9,1을 차례대로 삽입(push)
//		stack[++top] = 5;
//		stack[++top] = 9;
//		stack[++top] = 1;
//		System.out.println(Arrays.toString(stack) + ",top=" + top + ",스택 크기=" + (top + 1));
//		System.out.println("스택이 비어 있는가? " + (top == -1));
//		System.out.println("스택 peek: " + stack[top]); // 스택 top 확인 peek
//		System.out.println("스택 pop: " + stack[top--]); // 스택에서 자료 추출(pop)	
//		System.out.println(Arrays.toString(stack) + ",top=" + top + ", 스택 크기=" + (top + 1));
//		System.out.println("스택 pop: " + stack[top--]); // 스택에서 자료 추출(pop)
//		System.out.println(Arrays.toString(stack) + ", top=" + top + ", 스택크기=" + (top + 1));
//		System.out.println("스택 pop: " + stack[top--]); // 스택에서 자료 추출(pop)
//		System.out.println(Arrays.toString(stack) + ", top=" + top + ", 스택크기=" + (top + 1));
//		System.out.println("스택이 비어 있는가? " + (top == -1));
//	}
//}

//13
//public class Test{
//	public static void main(String[] args){
//		String s="대한민국의 수도는 서울이다.";
//		char stack[]=new char[s.length()];
//		int top=-1;
//		for (int i = 0; i < s.length(); i++) {
//			char c=s.charAt(i);
//			//문자 c를 스택에 push
//			stack[++top]=c;
//		}
//		while(top != -1)    //빈스택이 아닌 동안 
//			System.out.print(stack[top--]);     //pop한 자료
//	}
//}

//15
//import java.util.Arrays;
//
//public class Test {
//	public static void main(String[] args) {
//		int n[] = { 1, 2, 3, 4 };
//		System.out.println(Arrays.toString(n));
//		int m[] = Arrays.copyOf(n, n.length * 2); // 2배 확장
//		n = m;
//		System.out.println(Arrays.toString(n));
//		n = Arrays.copyOf(n, (int) (n.length * 0.25)); // 1/4로 축소
//		System.out.println(Arrays.toString(n));
//	}
//}

//16
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int n[] = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(n));
		int m[] = arrayCopy(n, n.length * 2); // 2배 확장
		n = m;
		System.out.println(Arrays.toString(n));
		n = arrayCopy(n, (int) (n.length * 0.25)); // 1/4로 축소
		System.out.println(Arrays.toString(n));
	}

	private static int[] arrayCopy(int[] n, int newSize) {
		return n;

	}
}