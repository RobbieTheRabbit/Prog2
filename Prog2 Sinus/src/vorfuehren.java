
//	Aufgabe 4 Vorfuehrung
public class vorfuehren {

	public static void main(String[] args){
		
//		zahlen(200);	//	4.1
//		vorzeichen(2, 10);	//	4.2
//		berechnungFrequenzAmplitude(50., 4.); //	4.4
		berechnungFrequenzAmplitude2(50./9., -3*4.); //	4.4
	}

	
	//	4.1 - Gibt aus, welche Zahl Ungerade ist
	public static void zahlen(int anzahl) {
			for(int i=1;i<100;i++){
			int x= i*2-1;	//	Das -1 weg fue gerade Zahlen
			System.out.println(x);
			}	
	}
		
	//	4.2 - Wechelt das Vorzeichen bei jedem Durchgang
	public static void vorzeichen(int zahl, int durchlauf) {
		  for(int i=0;i<durchlauf;i++) {
			   System.out.print(zahl + ", ");
			   
			   zahl=zahl-2*zahl;
		  }
	}

	// 4.4 - 3.3 Berechnung Reihe fuer Amplitude / Frequenz

	public static void berechnungFrequenzAmplitude(double beginnAmp, double beginnFreq) {

			double amp;
			double freq;

			for (int i = 1; i <= 16; i++) {

				amp = beginnAmp / (i * 2 - 1);
				freq = beginnFreq * (i * 2 - 1);

				System.out.println("Amplitude: " + amp);
				System.out.println("Frequenz: " + freq);
				System.out.println("----------------------");
			}

		}

	// 4.4 - 3.4 Berechnung Reihe fuer Amplitude / Frequenz
	public static void berechnungFrequenzAmplitude2(double beginnAmp,
		double beginnFreq) {

			double amp;
			double freq;
			double freqFactor;

			for (int i = 1; i <= 16; i++) {

				amp = beginnAmp / ((i * 2 - 1) * (i * 2 - 1));

				freqFactor = (i * 2 - 1);
				if (i % 2 != 0) {
					freq = beginnFreq * freqFactor;
				} else {
					freq = beginnFreq * (freqFactor - 2 * freqFactor);
				}

				System.out.println("Amplitude: " + amp);
				System.out.println("Frequenz: " + freq);
				System.out.println("----------------------");
			}

		}

	
}




