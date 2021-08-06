package distributionPackages;

//This class sorts the object on the basis of weight so far and it is implementing 
//comparable iterface for calculation
public class Sorter  implements Comparable<Sorter>{
	int vertex;
	String psf;
	int wtsf;
	int tsf;
	int capacityCalculator;
	Sorter(int vertex,String psf,int wtsf,int tsf,  int capacityCalculator){
		this.vertex=vertex;
		this.psf=psf;
		this.wtsf=wtsf;
		this.tsf = tsf;
		this.capacityCalculator=capacityCalculator;
	}

	public int compareTo(Sorter o){
		return this.wtsf - o.wtsf;
	}
}
