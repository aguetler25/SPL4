
public class Level1 {

	public static void main(String[] args) {
		int parkplaetze = 10;
		int autos = 4;
		String parken = "6 2 -6 3 4 -3 -4 -2";
		String[] parkvorgaenge = parken.split(" ");
		int autosInGarage = 0;
		int maxAutosInGarage = 0;

		for (int a = 0; a < parkvorgaenge.length; a++) {
			int auto = Integer.parseInt(parkvorgaenge[a]);
			
			if (auto < 0) {
				System.out.println("Auto parkt aus ... " + auto);
			} else {
				System.out.println("Auto parkt ein ... " + auto);
			}
		}
	}

}
