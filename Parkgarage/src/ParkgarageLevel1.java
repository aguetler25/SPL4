
public class ParkgarageLevel1 {

	public static void main(String[] args) {
		int parkplaetze = 10;
		int autos = 4;
		String parken = "6 2 -6 3 4 -3 -4 -2";
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
			
			System.out.println("Auto " + parkvorgaenge[p] + " parkt ... " + parker);
		}
		System.out.println("\nMax. Autos in Garage: " + maxAutosInGarage);
	}

}
