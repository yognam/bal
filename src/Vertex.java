import java.util.List;
import java.util.ArrayList;

public class Vertex {
private String name;
private boolean visited;
private List<Edge> adjacenciesList;
private double minDistance = Double.MAX_VALUE;
private Vertex privertex;

public Vertex(String name) {
	
	this.name = name;
	this.adjacenciesList = new ArrayList<>();
	
}
public void addEdge(Edge edge) {
	this.adjacenciesList.add(edge);
}

public boolean isVisited() {
	return visited;
}
public void setVisited(boolean visited) {
	this.visited = visited;
}
public double getMinDistance() {
	return minDistance;
}
public void setMinDistance(double minDistance) {
	this.minDistance = minDistance;
}
public Vertex getPrivertex() {
	return privertex;
}
public void setPrivertex(Vertex privertex) {
	this.privertex = privertex;
}
public List<Edge> getAdjacenciesList() {
	return adjacenciesList;
}
@Override
	public String toString() {
		
		return this.name;
	}

}
