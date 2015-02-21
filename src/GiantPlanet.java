/**
 * @author: Bhavin Patel
 * @Description: Implementation Of the GiantPlanet Class with necessary properties and methods
 * @version 1.0  Feb-20-2015 Creating the GiantPlanet Class with necessary Properties and methods
 * @version 2.0 Feb-20-2015 Creating method with necessary information
 * 
 *  */
public class GiantPlanet extends Planet implements iHasMoons, iHasRings {
	
	//private variables
	private String type;  //no necessary of the type variable

	//constructor 
	public GiantPlanet(double diameter, double mass, String name,String type){
		super(diameter,mass,name);
		this.type = type;
	}
	
	//hasMoon Method using interface
	public boolean hasMoons() {
		if (getMoonCount() > 0) {
			return true;
		}
		return false;
	}

	//hasRings Method using interface
	public boolean hasRings() {
		if (getRingCount() > 0) {
			return true;
		}
		return false;
	}
	
}
