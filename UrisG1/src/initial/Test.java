package initial;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//ZADATAK 1 - VEZBE 2
		/*int prviBroj = 24;
		int drugiBroj = 12;
		
		String operation = "/";
		//char operation = '+';
		
		switch(operation) {
		case "+":
			//int rezultat = prviBroj+drugiBroj;
			System.out.println(prviBroj + drugiBroj);
			break;
		case "-":
			System.out.println(prviBroj - drugiBroj);
			break;
		case "/":
			System.out.println(prviBroj/drugiBroj);
			break;
		case "*":
			System.out.println(prviBroj*drugiBroj);
			break;
		}*/
		
		//ZADATAK 2 - VEZBE 2
			//Citanje inputa sa konzole
		/*int korisnickiPoluprecnik;
		System.out.println("Unesite poluprecnik");
		Scanner it = new Scanner(System.in);
		korisnickiPoluprecnik = it.nextInt();
		
			//Logika zadatka
		if(korisnickiPoluprecnik > 0 && korisnickiPoluprecnik < 60) {
			double povrsinaKruga = korisnickiPoluprecnik*korisnickiPoluprecnik*Math.PI;
			double obimKruga = 2*korisnickiPoluprecnik*Math.PI;
			System.out.println("Povrsina kruga je: " + povrsinaKruga + " a obim je: "+ obimKruga);
		}else {
			System.out.println("Poluprecnik mora biti u rasponu od 1 do 59!");
		}*/
		
		//ZADATAK 3 - VEZBE 2 od 0 do 120
		int zbirParnih = 0;
		for(int i=0; i<=6; i= i+2) {
			zbirParnih = zbirParnih+i;
		}
		System.out.println(zbirParnih);
		
		zbirParnih = 0;
		int brojac = 0;
		while(brojac <= 6) {
			zbirParnih = zbirParnih+brojac;
			brojac = brojac +2;
		}
		System.out.println(zbirParnih);

	}

}
