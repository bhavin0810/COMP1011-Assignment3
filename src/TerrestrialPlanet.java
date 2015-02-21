/**
 * @author: Bhavin Patel
 * @Description: Implementation Of the TerrestrialPlanet Class with necessary properties and methods
 * @version 1.0  Feb-20-2015 Creating the TerrestrialPlanet Class with necessary Properties and methods
 * @version 2.0 Feb-20-2015 Creating method with necessary information
 * 
 *  */
public class TerrestrialPlanet extends Planet implements iHasMoons, iHabitable{
	
	//private variables
	private boolean oxygen;

	//constructor 
	public TerrestrialPlanet(double diameter, double mass, String name, boolean oxygen) {
		super(diameter, mass, name);
		this.oxygen = oxygen;		
	}
	
	//habitable method using interface
	public boolean habitable() {
		return oxygen;
	}

	//hasMoons method using interface
	public boolean hasMoons() {
		if (getMoonCount() > 0) {
			return true;
		}
		return false;
	}
	
}
