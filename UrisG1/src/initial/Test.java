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
		}
		
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
		*/
		
		//Vezbe 3 - Zadatak 1
		
		/*Scanner it = new Scanner(System.in);
		int uneseniBroj;
		System.out.println("Unesite broj:");
		uneseniBroj = it.nextInt();
		
		int brojac = 1;
		while(brojac<=9) {
			System.out.println(uneseniBroj*brojac);
			brojac++;
		}*/
		
		
		//Zadatak 2
		/*Scanner it = new Scanner(System.in);
		int uneseniBroj;
		System.out.println("Unesite broj:");
		uneseniBroj = it.nextInt();
		
		/// 384  stotina - 3  desetica -8 jedinica - 4
		int jedinica = uneseniBroj%10 ;
		int desetica = (uneseniBroj%100 - jedinica)/10 ;
		int stotina = (uneseniBroj - desetica*10 - jedinica)/100;
		System.out.println("Prva cifra unesenog broja je: " + stotina + ", a poslednja: " + jedinica);
		*/
		
		//Zadatak 3
		/*System.out.println("Jaki brojevi od 0 do 200 su: ");
		for(int i=0; i<=200; i++) {
			int zbirFaktorijela;
			if(i<10) {
				zbirFaktorijela = faktorijel(i);
				if(i == zbirFaktorijela) {
					System.out.println(i);
				}
			}else {
				if(i<100) {
					int jedinica = i%10;
					int desetica = (i-jedinica)/10;
					zbirFaktorijela = faktorijel(jedinica) + faktorijel(desetica);
					if(i == zbirFaktorijela) {
						System.out.println(i);
					}
				}else {
					int jedinica = i%10 ;
					int desetica = (i%100 - jedinica)/10 ;
					int stotina = (i - desetica*10 - jedinica)/100;
					zbirFaktorijela = faktorijel(jedinica) + faktorijel(desetica) + faktorijel(stotina);
					if(i == zbirFaktorijela) {
						System.out.println(i);
					}
				}
			}
		}
		
	}
	
	public static int faktorijel(int broj) {
		int rezultat = 1;
		for(;broj>0; broj--) {
			rezultat = rezultat * broj;
		}
		return rezultat;*/
		
						//VEZBE 7
		Kljucna k1 = new Kljucna();
		Kljucna k2 = new Kljucna();
		for(int i=0; i<=10; i++) {
			//Kljucna.broj = Kljucna.broj + i;
		}
		Kljucna.ispisiBroj();
		
		System.out.println(k1.broj);
		System.out.println(k2.broj);
	}
		
		
		

}
