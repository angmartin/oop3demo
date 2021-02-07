package vehicleInterface;

public class Motorcycle implements VehicleInterface {

	public int speed;
	public int gear;
	
	
	@Override   
	public void changeGear(int newGear) {
		this.gear = newGear;
		
	}

	@Override
	public void accelerate(int increase) {
		this.speed = speed + increase;
		
	}

	@Override
	public void brake(int decrease) {
		this.speed = speed - decrease;
				
		
	}
	
	public void displayStatus() {
		System.out.println("speed = "+speed+", Gear = "+gear);
	}

}
