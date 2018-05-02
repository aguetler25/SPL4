
public class ParkgarageLevel1 {

	public static void main(String[] args) {
		int parkplaetze = 100;
		int autos = 20;
		String parken = "19 -19 11 -11 1 -1 17 -17 10 7 -10 -7 3 14 -14 -3 13 -13 4 12 20 18 6 16 -18 -12 -16 5 -5 -20 -6 -4 8 15 -8 2 -15 9 -2 -9";
		String[] parkvorgaenge = parken.split(" ");
		int autosInGarage = 0;
		int maxAutosInGarage = 0;
		
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
