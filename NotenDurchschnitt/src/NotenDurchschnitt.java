
public class NotenDurchschnitt {

	public static void main(String[] args) {
		/*
Schreiben Sie ein Programm in dem als erstes ein Array
int[] Noten = {1,1,3,2,4,5,5,4,4,3,2,2,1,1,3,2,4,5,4,3,2,1,4,4,3,2,1,1,5,3}
initialisiert wird.

a.) Das Programm soll alle Noten auf der Konsole ausgeben.

b.) Schreiben Sie eine Funktion die den Notendurchschnitt berechnet. Die Funktion übernimmt als Parameter das Array mit den Noten und gibt als Rückgabewert den Durchschnitt als double zurück. Der Durchschnitt soll auf der Konsole ausgegeben werden.

c.) Schreiben Sie eine Funktion AnzahlNoten die die Anzahl einer Note berechnet. Diese Funktion soll für jede Note einmal aufgerufen und damit der Notenspiegel berechnet werden. Übergeben Sie der Funktion das Array und die zu berechnende Note als int.

int AnzahlNote(int [] Noten, int note)
der Notenspiegel soll in einem int Array gespeichert und anschließend auf der Konsole ausgegeben werden.
		 */

		int[] noten = {1,1,3,2,4,5,5,4,4,3,2,2,1,1,3,2,4,5,4,3,2,1,4,4,3,2,1,1,5,3};
		for (int n = 0; n < noten.length; n++) {
			System.out.println("Schueler " + (n+1) + " hat die Note " + noten[n]);
		}
		
	}

}
