
public class ParkgarageLevel1 {

	public static void main(String[] args) {
		int parkplaetze = 50;
		int autos = 50;
		String parken = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 -1 -2 -3 -4 -5 -6 -7 -8 -9 -10 -11 -12 -13 -14 -15 -16 -17 -18 -19 -20 -21 -22 -23 -24 -25 -26 -27 -28 -29 -30 -31 -32 -33 -34 -35 -36 -37 -38 -39 -40 -41 -42 -43 -44 -45 -46 -47 -48 -49 -50";
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
