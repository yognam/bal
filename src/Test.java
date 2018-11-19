import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	List<Vertex> vertexList = new ArrayList<>();
	System.out.println("enter the number of vertex");
	int count=sc.nextInt();
	for(int i=0;i<count;i++) {
    vertexList.add(new Vertex("V"+i));
    
	}
	List<Edge> edgeList = new ArrayList<>();
	int j=1;
	for(int i=0;i<count-2;i++) {
		System.out.println("enter weight of "+i+"to "+j+":");
		int wei = sc.nextInt();
	    edgeList.add(new Edge(wei,vertexList.get(i),vertexList.get(j+1)));
	    j++;
		}
	System.out.println("enter weight of "+ (count-2) +"to " +(count-1)+ ":");
	  int wei = sc.nextInt();
      edgeList.add(new Edge(wei,vertexList.get(count-2),vertexList.get(count-1)));

	Algo algo = new Algo(vertexList,edgeList);
int end=count-1;
	algo.shortestpath(vertexList.get(0), vertexList.get(end));
	sc.close();
}

}
