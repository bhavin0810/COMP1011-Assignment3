/**
 * @author: Bhavin Patel
 * @Description: Implementation Of the Program Class to test the Program
 * @version 1.0  Feb-20-2015 Test the Program with necessary information
 * 
 *  */
public class Program {

	public static void main(String[] args) {
		GiantPlanet jupiter = new GiantPlanet(100, 10000, "Jupiter", "hydrogen");
		System.out.println(jupiter);

		TerrestrialPlanet sun = new TerrestrialPlanet(100, 10000, "Sun", true);
		System.out.println(sun);

	}

}
