package bicycle;

//This class Calculates the Bom and Inventory net off by implementing the interface 
//and few getters and setters for stock and material ratio
public class MaterialDetail implements IMaterialBomCalculator, IMaterialInventoryNetOff{
    private int stock;
    private int materialRatio;
    
    MaterialDetail(int stock, int materialRatio){
    	this.materialRatio = materialRatio;
    	this.stock = stock;
    }
    
    public int getStock() {
		return stock;
	}
    
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public int getMaterialRatio() {
		return materialRatio;
	}
	
	public void setMaterialRation(int materialRatio) {
		this.materialRatio = materialRatio;
	}

	@Override
	public int calculateBom(int requirements) {
		// TODO Auto-generated method stub
		return this.getMaterialRatio() * requirements;
	}

	@Override
	public int calculateInventoryNetOff(int materialBom) {
		// TODO Auto-generated method stub
		return materialBom - this.stock;
	}
	
}
