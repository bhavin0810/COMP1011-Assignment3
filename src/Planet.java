/**
 * @author: Bhavin Patel
 * @Description: Implementation Of the Planet Abstract Class with necessary properties and methods
 * @version 1.0  Feb-20-2015 Creating the Planet Class with necessary Properties and constructor
 * 
 *  */
public abstract class Planet {
	
	//private Variables
	private double diameter;
	private double mass;
	private int moonCount;
	private String name;
	private double orbitalPeriod;
	private int ringCount;
	private double rotationPeriod;

	public Planet(double diameter, double mass, String name) {		
		this.diameter = diameter;
		this.mass = mass;
		this.name = name;
	}
	
}