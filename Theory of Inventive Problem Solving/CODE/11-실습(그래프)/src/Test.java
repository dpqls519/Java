
//11 그래프

//1
//public class Test {
//	public static void main(String[] args) {
//		int V=8;
//		String input="0 1 0 3 1 2 3 2 3 4 2 5 4 5 6 7";
//		int adjMat[][]=new int[V][V];
//		String s[]=input.split("\\s+");
//		for (int i = 0; i < s.length; i+=2){
//		int v1=Integer.parseInt(s[i]);
//		int v2=Integer.parseInt(s[i+1]);
//		adjMat[v1][v2]=1;
//		adjMat[v2][v1]=1;
//		}
//		for (int i = 0; i < adjMat.length; i++) {
//		for (int j = 0; j < adjMat[i].length; j++) {
//		System.out.print(adjMat[i][j]);
//		}
//		System.out.println();
//		}
//	}
//}

//2
//import java.util.LinkedList;
//
//public class Test {
//	public static void main(String[] args) {
//		int V = 8;
//		String input = "0 1 0 3 1 2 3 2 3 4 2 5 4 5 6 7";
//		LinkedList<Integer> adjList[] = new LinkedList[V];
//		for (int i = 0; i < adjList.length; i++) {
//			adjList[i] = new LinkedList<>();
//		}
//		String s[] = input.split("\\s+");
//		for (int i = 0; i < s.length; i += 2) {
//			int v1 = Integer.parseInt(s[i]);
//			int v2 = Integer.parseInt(s[i + 1]);
//			adjList[v1].add(v2);
//			adjList[v2].add(v1);
//		}
//		for (int i = 0; i < adjList.length; i++) {
//			System.out.println("node " + i + " => " + adjList[i]);
//		}
//	}
//}

//3
//import java.util.LinkedList;
//
//public class Test {
//	public static void main(String[] args) {
////		String input = "0 1 0 3 1 2 3 2 3 4 2 5 4 5 6 7"; // 무방향 간선으로 해석
//		String input = "0 1 0 3 1 2 3 2 3 4 2 5 4 5"; // 연결요소 3개
//		int V = 8;
//
//		LinkedList<Integer> adjList[] = new LinkedList[V];
//		for (int i = 0; i < adjList.length; i++)
//			adjList[i] = new LinkedList<>();
//		String s[] = input.split("\\s+");
//		for (int i = 0; i < s.length; i += 2) {
//			int v1 = Integer.parseInt(s[i]);
//			int v2 = Integer.parseInt(s[i + 1]);
//			adjList[v1].add(v2);
//			adjList[v2].add(v1);
//		}
//		for (int i = 0; i < adjList.length; i++)
//			System.out.println("node " + i + " => " + adjList[i]);
//		connected(adjList, V);
//	}
//
//	private static void connected(LinkedList<Integer>[] adjList, int V) {
//		boolean visited[] = new boolean[V];
//		int count = 0;
//		for (int i = 0; i < visited.length; i++) {
//			if (visited[i] == false) {
//				dfs(adjList, V, visited, i);
//				count++;
//				System.out.println();
//			}
//		}
//		System.out.println("연결요소 개수 : " + count);
//	}
//
//	private static void dfs(LinkedList<Integer>[] adjList, int V, boolean[] visited, int v) {
//		visited[v] = true;
//		System.out.print(v + " ");
//		for (Integer i : adjList[v]) {
//			if (visited[i] == false)
//				dfs(adjList, V, visited, i);
//		}
//	}
//}

//4
//public class Test {
//	public static void main(String[] args) {
//		int V = 8;
//		String input = "0 1 0 3 1 2 3 2 3 4 2 5 4 5 6 7"; // 무방향 간선으로 해석
//		int adjMat[][] = new int[V][V];
//		String s[] = input.split("\\s+");
//		for (int i = 0; i < s.length; i += 2) {
//			int v1 = Integer.parseInt(s[i]);
//			int v2 = Integer.parseInt(s[i + 1]);
//			adjMat[v1][v2] = 1;
//			adjMat[v2][v1] = 1;
//		}
//		dfs(adjMat, V); // 3번 실습의 connected() 함수
//	}
//
//	private static void dfs(int[][] adjMat, int V) { // 3번 실습의 connected() 함수
//		boolean visited[] = new boolean[V];
//		for (int i = 0; i < visited.length; i++) {
//			if (visited[i] == false) {
//				dfs(adjMat, V, visited, i);
//				System.out.println();
//			}
//		}
//	}
//
//	private static void dfs(int[][] adjMat, int V, boolean[] visited, int v) {
//		visited[v] = true;
//		System.out.print(v + " ");
//		for (int w = 0; w <= V-1; w++) {
//			if(adjMat[v][w]==1 && visited[w]==false)	
//				dfs(adjMat, V, visited, w);
//		}
//		
//		for (Integer i : adjMat[v]) {
//			if (visited[i] == false)
//				dfs(adjMat, V, visited, i);
//		}
//	
//	}
//}

//5
//import java.util.LinkedList;
//
//public class Test {
//	public static void main(String[] args) {
//		String input = "0 1 0 3 1 2 3 2 3 4 2 5 4 5 6 7"; // 무방향 간선으로 해석.
//		int V = 8;
//
//		LinkedList<Integer> adjList[] = new LinkedList[V];
//		for (int i = 0; i < adjList.length; i++)
//			adjList[i] = new LinkedList<>();
//		String s[] = input.split("\\s+");
//		for (int i = 0; i < s.length; i += 2) {
//			int v1 = Integer.parseInt(s[i]);
//			int v2 = Integer.parseInt(s[i + 1]);
//			adjList[v1].add(v2);
//			adjList[v2].add(v1);
//		}
//		for (int i = 0; i < adjList.length; i++)
//			System.out.println("node " + i + " => " + adjList[i]);
//		connected(adjList, V);
//	}
//
//	private static void connected(LinkedList<Integer>[] adjList, int V) {
//		boolean visited[] = new boolean[V];
//		for (int i = 0; i < visited.length; i++) {
//			if (visited[i] == false) {
//				bfs(adjList, V, visited, i);
//				System.out.println();
//			}
//		}
//	}
//
//	private static void bfs(LinkedList<Integer>[] adjList, int V, boolean[] visited, int v) {
//		LinkedList<Integer> queue = new LinkedList<>();
//		visited[v] = true;
//		queue.addLast(v);
//		while (!queue.isEmpty()) {
//			v = queue.removeFirst();
//			System.out.print(v + " ");
//			for (Integer w : adjList[v]) {
//				if (visited[w] == false) {
//					visited[w] = true;
//					queue.addLast(w);
//				}
//			}
//		}
//	}
//}

//6
//import java.util.Arrays;
//import java.util.LinkedList;
//
//public class Test {
//	public static void main(String[] args) {
//		int V = 10;
//		String input = "0 1 2 3 3 4 5 6 6 7 7 8 8 9";
//
//		LinkedList<Integer> adjList[] = new LinkedList[V];
//		for (int i = 0; i < adjList.length; i++)
//			adjList[i] = new LinkedList<>();
//		String s[] = input.split("\\s+");
//		for (int i = 0; i < s.length; i += 2) {
//			int v1 = Integer.parseInt(s[i]);
//			int v2 = Integer.parseInt(s[i + 1]);
//			adjList[v1].add(v2);
//			adjList[v2].add(v1);
//		}
//		int groups[] = connected(adjList, V);
//		System.out.println(Arrays.toString(groups));
//		System.out.println(isFriend(groups, 1, 4));
//		System.out.println(isFriend(groups, 5, 9));
//		// input="0 1 2 3 3 4 5 6 6 7 7 8 8 9 4 5";
//	}
//
//	private static int[] connected(LinkedList<Integer>[] adjList, int V) {
//		int groups[] = new int[V];
//		int id = 0;
//		// 그래프내 모든 노드에 대해 미방문시 아래 dfs호출
//		for (int v = 0; v < V; v++) {
//			if (groups[v] == 0)
//				dfs(adjList, V, v, groups, ++id);
//		}
//		return groups;
//	}
//
//	private static void dfs(LinkedList<Integer>[] adjList, int V, int v, int[] groups, int id) {
//		groups[v] = id; // visited[v]=true
//		// 현재 노드 v의 인접 노드 중 미방문 노드에 대해 dfs호출
//		for (Integer w : adjList[v]) {
//			if (groups[w] == 0)
//				dfs(adjList, V, w, groups, id);
//		}
//	}
//
//	private static boolean isFriend(int[] groups, int i, int j) {
//		return groups[i] == groups[j];
//	}
//}

//재귀 실습 15
import java.util.Random;

public class Test {
	private static int size;

	public static void main(String args[]) {
		int R = 5, C = 5, count = 0;
		char ground[][] = new char[R][C];
		Random random = new Random();
		for (int i = 0; i < ground.length; i++) { // 임의 개수의 물웅덩이 포함 평면 생성
			for (int j = 0; j < ground[i].length; j++)
				ground[i][j] = (random.nextInt(3) == 0) ? '1' : '0';
		}
		for (int i = 0; i < ground.length; i++) { // 임의 개수의 물웅덩이 포함 평면 출력
			for (int j = 0; j < ground[i].length; j++)
				System.out.print(ground[i][j]);
			System.out.println();
		}
		for (int i = 0; i < ground.length; i++) {
			for (int j = 0; j < ground[i].length; j++) {
				if (ground[i][j] == '1') {
					size = 0;
					dfs(ground, R, C, i, j);
					System.out.println(size);
					count++;
				}
			}
		}
		System.out.println(count);
	}

	private static void dfs(char[][] ground, int R, int C, int i, int j) {
		size++;
		ground[i][j] = '0';
		for (int dx = -1; dx <= 1; dx++) {
			for (int dy = -1; dy <= 1; dy++) {
				int r = i + dx, c = j + dy;
				if (r >= 0 && r < R && c >= 0 && c < C && ground[r][c] == '1')
					dfs(ground, R, C, r, c);
			}
		}
//		if(ground[i-1][j-1]=='1') dfs(ground,R,C,i-1,j-1);
//		if(ground[i+1][j]=='1')dfs(ground,R,C,i+1,j);
	}
}