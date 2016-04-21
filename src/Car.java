
public class Car extends Vehicle{
	public Car (Warehouse assembleWarehouse, Warehouse produceWarehouse){
		super(assembleWarehouse, produceWarehouse);
	}
	
	@Override
	public void manufacture(){
		System.out.println("Manufacturing Car");
		assembleWarehouse.create();
		produceWarehouse.create();
		System.out.println("Car manufacturing complete");
	}
}
