/**
 * @author: Bhavin Patel
 * @Description: Implementation Of the Planet Abstract Class with necessary properties and methods
 * @version 1.0  Feb-20-2015 Creating the Planet Class with necessary Properties and constructor
 * @version 2.0 Feb-20-2015 Creating Getters and Setters and Override toString Method
 * *  */
public abstract class Planet {
	
	//private Variables
	private double diameter;
	private double mass;
	private int moonCount;
	private String name;
	private double orbitalPeriod;
	private int ringCount;
	private double rotationPeriod;

	//constructor
	public Planet(double diameter, double mass, String name) {		
		this.diameter = diameter;
		this.mass = mass;
		this.name = name;
	}
	
	//Getters and Setters  for the Private Properties
	public int getMoonCount() {
		return moonCount;
	}

	public void setMoonCount(int moonCount) {
		this.moonCount = moonCount;
	}

	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}

	public void setOrbitalPeriod(double orbitalPeriod) {
		this.orbitalPeriod = orbitalPeriod;
	}

	public int getRingCount() {
		return ringCount;
	}

	public void setRingCount(int ringCount) {
		this.ringCount = ringCount;
	}

	public double getRotationPeriod() {
		return rotationPeriod;
	}

	public void setRotationPeriod(double rotationPeriod) {
		this.rotationPeriod = rotationPeriod;
	}

	public double getDiameter() {
		return diameter;
	}

	public double getMass() {
		return mass;
	}

	public String getName() {
		return name;
	}
	

	//toString override method
	@Override
	public String toString() {
		return "Planet [Name=" + name + ", Mass=" + mass + ", Diameter="
				+ diameter + "]";
	}
	
}