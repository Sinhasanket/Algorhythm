package bicycle;
import java.util.HashMap;

//This class acts lika a repository wherw my input data is given and i am using it futher for
//calculation purpose
public class MaterialRepo {
	
	private HashMap<String,MaterialDetail> inHandInventory;
	
	public MaterialRepo() {
		inHandInventory = new HashMap<>();
		initInventory();
	}
	
	private void initInventory() {
	  inHandInventory.put("seats", new MaterialDetail(50,1));
	  inHandInventory.put("frames", new MaterialDetail(80,1));
	  inHandInventory.put("brakeSets", new MaterialDetail(25,2));
	  inHandInventory.put("brakePaddles", new MaterialDetail(100,1));
	  inHandInventory.put("brakeCables", new MaterialDetail(75,1));
	  inHandInventory.put("levers", new MaterialDetail(60,1));
	  inHandInventory.put("brakeShoes", new MaterialDetail(150,2));
	  inHandInventory.put("handleBars", new MaterialDetail(100,1));
	  inHandInventory.put("wheels", new MaterialDetail(60,2));
	  inHandInventory.put("tires", new MaterialDetail(80,2));
	  inHandInventory.put("chains", new MaterialDetail(100,1));
	  inHandInventory.put("crankSets", new MaterialDetail(50,1));
	  inHandInventory.put("paddles", new MaterialDetail(150,2));
	}
	 
	
	public MaterialDetail getMaterialDetailByName(String materialName) {
		if(this.inHandInventory.containsKey(materialName))
			return this.inHandInventory.get(materialName);
		return null;
	}
	 
}
