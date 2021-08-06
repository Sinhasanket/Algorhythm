package bicycle;
import java.util.Scanner;

//This is the main method from where i am calling all my classes it has on inputMaterial array which 
//contains all parts as a string 
public class Main {
  public static void main(String[] args) {
	  Scanner takeInput = new Scanner(System.in);
	  
	  String inputMaterials[] = {
			 "seats",
			  "frames",
			  "brakeSets",
			  "brakePaddles",
			  "brakeCables",
			  "levers", 
			  "brakeShoes", 
			  "handleBars", 
			  "wheels",
			  "tires", 
			  "chains", 
			  "crankSets",
			  "paddles"
	  };
	  
	  System.out.println("Please Enter Number Of Requirements for Bicycle");
	  int bicycleRequirement = takeInput.nextInt();
	  
	  MaterialRequirementCalculator materialRequirementPlan = new MaterialRequirementCalculator(new MaterialRepo());
	  
	  for(String material : inputMaterials) {
		  materialRequirementPlan.generate(bicycleRequirement, material);
	  }
	  takeInput.close();
  }
}
