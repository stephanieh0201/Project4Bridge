
public abstract class Vehicle {
	protected Warehouse assembleWarehouse;
	protected Warehouse produceWarehouse;
	
	public Vehicle(Warehouse assembleWarehouse, Warehouse produceWarehouse){
		this.assembleWarehouse=assembleWarehouse;
		this.produceWarehouse=produceWarehouse;
	}
	
	abstract public void manufacture();
	
	
}
