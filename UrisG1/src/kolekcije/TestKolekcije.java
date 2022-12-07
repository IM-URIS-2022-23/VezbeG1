package kolekcije;

import java.util.Scanner;

public class TestKolekcije {

	public static void main(String[] args) {
		
						//ZADATAK 1
		/*int[] brojevi = {4,5,6,7,8};
		
		for(int i = brojevi.length - 1; i>=0; i--) {
			System.out.print(brojevi[i]+ " ");
		}*/
		
						//ZADATAK 2
		/*int[] brojevi = {4, 20, 33, 2, 88, 5};
		if(brojevi[2] > brojevi[3]) {
			System.out.println("Treci element je veci za: " +
					(brojevi[2] - brojevi[3]));
		}else {
			System.out.println("Cetvrti element je veci za: " +
					(brojevi[3] - brojevi[2]));
		}*/
		
					//ZADATAK 3
		/*int[] niz = {    3,6,9,12,15,18,21,24,27,30};
		//indeksi niza = 0,1,2,3,4,5,6,7,8,9 
		for(int i = niz.length-1; i>=0; i--) {
			System.out.print(niz[i]*5 + " ");
		}*/
		
					//ZADATAK 4
		System.out.println("Unesite svoje ime i prezime razdvojeno spejsom");
		Scanner it = new Scanner(System.in);
		String input = it.nextLine();
		
		// Primer ime = "Marko Markovic";
		String ime = "";
		String prezime = "";
		boolean check = false;
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == ' ') {
				check = true;
			}
			if(check == false) {
				ime += input.charAt(i);
			}else {
				prezime += input.charAt(i);
			}
		}
		System.out.println("Ime je: " + ime + ", a prezime: " + prezime);
	}

}
