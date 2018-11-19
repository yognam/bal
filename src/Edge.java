
public class Edge {
private double weight;
private Vertex startvertex;
private Vertex endvertex;


public Edge(double weight, Vertex startvertex, Vertex endvertex) {
	super();
	this.weight = weight;
	this.startvertex = startvertex;
	this.endvertex = endvertex;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}
public Vertex getStartvertex() {
	return startvertex;
}
public void setStartvertex(Vertex startvertex) {
	this.startvertex = startvertex;
}
public Vertex getEndvertex() {
	return endvertex;
}
public void setEndvertex(Vertex endvertex) {
	this.endvertex = endvertex;
}


}
