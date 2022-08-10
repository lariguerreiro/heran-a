package entities;

public class OutsourcedEmployee extends Employee{
	
	private double addCharge;
	
	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, int hours, double valuePerHour, double addCharge) {
		super(name, hours, valuePerHour);
		this.addCharge = addCharge;
	}

	public double getAddCharge() {
		return addCharge;
	}

	public void setAddCharge(double addCharge) {
		this.addCharge = addCharge;
	}

	@Override
	public double payment() {
		return super.payment() + (addCharge * 1.1);
	}
	
	
}
