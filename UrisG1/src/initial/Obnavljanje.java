package initial;

public class Obnavljanje {

	public static void main(String[] args) {
		
		
		/*int x = 55; // "55"
		boolean y = true; 
		double c = 10.33333;
		String b = "50";
		String ab = b+x;
		System.out.println(ab);
		char a = '%';
		char f = ab.charAt(1);
		System.out.println(f);
		float s = 55.56789f;
		System.out.println(s);
		System.out.println(c);
		
		// x = 55
		if(x%5 == 0 && x==55) {
			System.out.println("Moja vrednost je 55");
		
		}else if(x == 55) {
			System.out.println("Moja vrednost je 55, bez dileme");
		}
		
		
		//int i = 10;
		for(int i = 10;i>0;) {
			System.out.println(i);
			i=i-4;
		}
		
		double brojac = 55.5;
		while(brojac > 0) {
			System.out.println(brojac);
			brojac = brojac - 0.5;
		}
		
		System.out.println(faktorijel(21));*/
		
		for(int i = 0;i<=200; i++) {
			if(i<10) {
				int faktorijelJedinice = faktorijel(i);
				if(i == faktorijelJedinice) {
					System.out.println(i);
				}
			}else if(i<100) {
				int jedinica = i%10;
				int desetica = i/10;
				int faktorijelJedinice = faktorijel(jedinica);
				int faktorijelDesetice = faktorijel(desetica);
				if(i == faktorijelJedinice+faktorijelDesetice) {
					System.out.println(i);
				}
			}else {
				int jedinica = i%10;
				int stotina = i/100;
				int desetica = (i - stotina*100)/10;
				int faktorijelJedinice = faktorijel(jedinica);
				int faktorijelDesetice = faktorijel(desetica);
				int faktorijelStotine = faktorijel(stotina);
				if(i == faktorijelJedinice+faktorijelDesetice+faktorijelStotine) {
					System.out.println(i);
				}
			}
		}
		
	}
	
	public static int faktorijel(int broj) {
		int rezultat = 1;
		for(;broj>0;broj--) {
			rezultat = rezultat * broj;
		}
		return rezultat;
	}
	
	

}
