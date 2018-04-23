import java.util.Scanner;
//Kruskal's alogorithm 
public class Kruskal2 {
	int V;
	int E;
	Edge[] edge;
	public class Edge implements Comparable<Edge>{
		int bv;
		int ev;
		int cost;
		@Override
		public int compareTo(Edge o) {
			// TODO Auto-generated method stub
			return this.cost-o.cost;
		}
	}
	public Kruskal2(int v, int e) {
		V = v;
		E = e;
		edge = new Edge[E];
		for (int i=0; i<E; i++) {
			edge[i] = new Edge();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		Kruskal2 graph = new Kruskal2(v, e);
		for (int i=0; i<e; i++) {
			graph.edge[i].bv = sc.nextInt();
			graph.edge[i].ev = sc.nextInt();
			graph.edge[i].cost = sc.nextInt();
		}
//		for (int i=0; i<e; i++) {
//			System.out.print(graph.edge[i].bv+" ");
//			System.out.print(graph.edge[i].ev+" ");
//			System.out.print(graph.edge[i].cost+" ");
//			System.out.println();
//		}
		
	}

}


