package distributionPackages;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

//This class calculates the freight cost in bredth first search manner between two nodes
//then finally sees how much goods it can take in one iteration if few of the goods are left behind 
//because of some capacity issue it will be taken in next iteration, also id of each thing is taken
//for easy of calculation. here starting point is 1 which is id of factory 1

public class FrieghtCostCalculator {
	public static void calculate(int vertex, ArrayList<ArrayList<Edge>> graph) {
		//Starting Point
		Scanner sc = new Scanner(System.in);
		int src = 1;

		System.out.println("Enter Number Of Days");
		int days = sc.nextInt();

		for(int iteration=1;iteration<=days;iteration++) {

			System.out.println("Enter Number of Customers");
			int customers = sc.nextInt();
			while(customers-->0) {

				System.out.println("Enter Customer id");
				int cutomerId = sc.nextInt();
				System.out.println("Enter Customer name");
				String cutomerName = sc.next();
				System.out.println("Enter Customer demand Quantity");
				int quantity = sc.nextInt();

				System.out.println("Day "+iteration);
				System.out.println("Customer Name "+cutomerName);
				System.out.println(" ====================================== ");

				int checkDifference = 0;
				int costOfFrieght = 0;
				int capcityHoldPath = Integer.MAX_VALUE;
				int timeTaken = 0;

				PriorityQueue<Sorter> pq = new PriorityQueue<>();
				boolean visited[] = new boolean[vertex+1];
				pq.add(new Sorter(src,src+"",0,0,0));

				while (pq.size() > 0 ){
					Sorter remove = pq.remove();
					if (visited[remove.vertex]){
						continue;
					}
					visited[remove.vertex] = true;
					char convCustId = String.valueOf(cutomerId).charAt(0);

					if(remove.psf.charAt(remove.psf.length()-1) == convCustId) {
						costOfFrieght = remove.wtsf;
						timeTaken = remove.tsf;

					}

					for (Edge e : graph.get(remove.vertex)){
						if (visited[e.neighbour]==false){
							if(e.frieghtCost < quantity) {
								capcityHoldPath = Math.min(capcityHoldPath,e.frieghtCost);
								checkDifference = Math.max(quantity - e.frieghtCost, checkDifference);
							}

							pq.add(new Sorter(e.neighbour,remove.psf+e.neighbour,remove.wtsf+e.frieghtCost,remove.tsf + e.leadTime ,0));
						}
					}
				}

				if(checkDifference > capcityHoldPath) {
					int times = 0;
					while(checkDifference > 0) {
						checkDifference -= capcityHoldPath;
						times++;
					}
					costOfFrieght *= times;
					timeTaken *= times;
				}
				System.out.println("Frieght Cost to reach "+cutomerName+" is : "+costOfFrieght+" and Time taken is : "+timeTaken );

			}
		}
	}
}