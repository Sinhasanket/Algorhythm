package distributionPackages;

//This is a edge class which contains information about the information about neighbour of
//current node and cost and leadtime to reach the neighbour
public class Edge {
	int node;
	int neighbour;
	String source;
	String destination;
	int leadTime;
	int frieghtCost;
	Edge(int node,int neighbour,String source,String destination,int leadTime, int frieghtCost){
		this.node=node;
		this.neighbour=neighbour;
		this.source=source;
		this.destination=destination;
		this.leadTime = leadTime;
		this.frieghtCost=frieghtCost;

	}
}