
public class VehicleManufacturing {

	public static void main(String[] args) {
		Vehicle car = new Car(new Produce(), new Assemble());
		car.manufacture();
		Vehicle motorcycle= new Motorcycle(new Produce(), new Assemble());
		motorcycle.manufacture();

	}

}
