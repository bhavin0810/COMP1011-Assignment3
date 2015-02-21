/**
 * @author: Bhavin Patel
 * @Description: Implementation Of the GiantPlanet Class with necessary properties and methods
 * @version 1.0  Feb-20-2015 Creating the GiantPlanet Class with necessary Properties and methods
 * 
 *  */
public class GiantPlanet extends Planet implements iHasMoons, iHasRings {
	
	//private variables
	private String type;

	//constructor 
	public GiantPlanet(double diameter, double mass, String name,String type){
		super(diameter,mass,name);
		this.type = type;
	}
	
	//hasMoon Method using interface
	public boolean hasMoons() {
		return false;
	}

	//hasRings Method using interface
	public boolean hasRings() {
		return false;
	}
}
