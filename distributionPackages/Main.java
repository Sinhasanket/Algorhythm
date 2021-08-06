package distributionPackages;

import java.util.*;
import java.io.*;
import java.net.URL;

public class Main {

//this is a method of main class which takes the input here i am adding a Id with each elements 
// so that it will be easy for me to track information of each depot
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Number of Points");
		int vertex = sc.nextInt();
		ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

		for (int i=0;i<=vertex;i++){
			graph.add(new ArrayList<>());
		}

		//taking input from txt fill to make it easy instead of writing same thing again and again
			
		File file = new File("C:\\Users\\91758\\eclipse-workspace\\Algo\\src\\distributionPackages\\input.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		while ((st = br.readLine()) != null){
			String stringInput[] = st.split(" ");
			String source = stringInput[0];
			int sorceId = Integer.parseInt(stringInput[1]);
			String destination = stringInput[2];
			int destinationId = Integer.parseInt(stringInput[3]);
			int leadTime = Integer.parseInt(stringInput[4]);
			int freightCost = Integer.parseInt(stringInput[5]);
			graph.get(sorceId).add(new Edge(sorceId,destinationId,source,destination,leadTime,freightCost));
		}


		FrieghtCostCalculator calculator = new FrieghtCostCalculator();
		calculator.calculate(vertex,graph);

	}
}
