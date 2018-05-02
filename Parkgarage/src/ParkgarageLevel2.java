
public class ParkgarageLevel2 {

	public static void main(String[] args) {
		int parkplaetze = 2;
		int autos = 4;
		String parken = "1 2 -1 3 4 -3 -4 -2";
		String[] parkvorgaenge = parken.split(" ");
		int autosInGarage = 0;
		int maxAutosInGarage = 0;
		int maxAutosWarteliste = 0;
		
		for (int p=0; p < parkvorgaenge.length; p++) {
			String parker = ""; 
			if (parkvorgaenge[p].indexOf("-") >= 0) {
				parker = "aus";
				autosInGarage--;
			} else {
				parker = "ein";
				autosInGarage++;
			}
			if (autosInGarage > maxAutosInGarage) {
				maxAutosInGarage = autosInGarage;
			}
			// System.out.println("Auto " + parkvorgaenge[p] + " parkt ... " + parker);
		}
		// System.out.println("\nMax. Autos in Garage: " + maxAutosInGarage);
		System.out.println(maxAutosInGarage);
	}

}
