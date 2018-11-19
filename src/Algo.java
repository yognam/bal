import java.util.List;

public class Algo {
private List<Vertex> vertexlist;
private List<Edge> edgeList;

public Algo(List<Vertex> vertexlist, List<Edge> edgeList) {
	super();
	this.vertexlist = vertexlist;
	this.edgeList = edgeList;
}

public void shortestpath ( Vertex sourseVertex,Vertex targetVertex ) {
	sourseVertex.setMinDistance(0);
	int len= this.vertexlist.size();
	for(int i=0;i<len-1;i++) {
		
		for(Edge edge : this.edgeList) {
			if(edge.getStartvertex().getMinDistance() == Double.MAX_VALUE)continue;
			Vertex v = edge.getStartvertex();
			Vertex u = edge.getEndvertex();
			double newdistance = v.getMinDistance()+edge.getWeight();
			if(newdistance<u.getMinDistance()) {
				u.setMinDistance(newdistance);
				u.setPrivertex(v);
				
			}
		}
	}
	
	for(Edge edge: this.edgeList ) {
		if(edge.getStartvertex().getMinDistance() != Double.MAX_VALUE) {
			
			if(hasCycle(edge)) {
				System.out.println("there is a negative cycle");
				return;
			}
			
		}
		
	
		
		
	}
if(targetVertex.getMinDistance()==Double.MAX_VALUE) {
		
		System.out.println("no path");
	}	
	else {
		System.out.println("sortest path:"+targetVertex.getMinDistance());
	}
	
	
	
	
	
	
}

private boolean hasCycle(Edge edge) {
	
	return (edge.getStartvertex().getMinDistance()+edge.getWeight())< edge.getEndvertex().getMinDistance();
}


 
}
