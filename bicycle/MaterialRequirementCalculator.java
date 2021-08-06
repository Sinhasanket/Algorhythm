package bicycle;

//This Class Just calculates the material requirement cost and prints it
public class MaterialRequirementCalculator {
	private MaterialRepo materialRepo;
	
	public MaterialRequirementCalculator(MaterialRepo materialRepo) {
		this.materialRepo = materialRepo;
	}

	public void generate(int bicycleRequirement, String material) {
		
			MaterialDetail materialDetail = materialRepo.getMaterialDetailByName(material);
			
			int materialBom = 
					materialDetail != null
					? materialDetail.calculateBom(bicycleRequirement)
					: 0;
			
			int materialInventoryNetOff =
					materialDetail != null
					? materialDetail.calculateInventoryNetOff(materialBom)
					: 0;
			
			System.out.print("Required Material of "+material +" :"+materialBom);
			System.out.println(", Inventory net Off of "+material+" : "+materialInventoryNetOff);
	}
}
