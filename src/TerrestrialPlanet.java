/**
 * @author: Bhavin Patel
 * @Description: Implementation Of the TerrestrialPlanet Class with necessary properties and methods
 * @version 1.0  Feb-20-2015 Creating the TerrestrialPlanet Class with necessary Properties and methods
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
		return false;
	}

	//hasMoons method using interface
	public boolean hasMoons() {
		return false;
	}

	
}
