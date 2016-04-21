
public class Motorcycle extends Vehicle{
	public Motorcycle (Warehouse assembleWarehouse, Warehouse produceWarehouse){
		super(assembleWarehouse, produceWarehouse);
	}
	
	@Override
	public void manufacture(){
		System.out.println("Manufacturing Motorcycle");
		assembleWarehouse.create();
		produceWarehouse.create();
		System.out.println("Motorcycle manufacturing complete");
	}
}


