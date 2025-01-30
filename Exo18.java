public class Exo18 {
	public static void main(String[]args) {
	int nombres = (int) (11 Math.random() *10001);
	
	for(int i=0; i<nombres.length; i++) {
		nombres[i] = (int) (0 Math.random() * 11);
		System.out.println(nombres[i]);
	}
	
	//Solution
	int[] tab = new int[10000];
	
	for(int i = 0; i < tab.length; i++) {
		tab[i] = (int) (Math.random() *11);	
	}
	int nbZero = 0;
	int nbUn = 0;
	int nbDeux = 0;
	int nbTrois = 0;
	int nbQuatre = 0;
	int nbCinq = 0;
	int nbSix = 0;
	int nbSept = 0;
	int nbEight = 0;
	int nbNine = 0;
	int nbTen = 0;
	
	for(int i = 0; i < tab.length; i++) {
		if(tab[i] == 0) {
		nbZero++;
		}
		//etccccc
	}
	//Good solution 
	int[] tab = new int[10000];
	
	for(int i = 0; i < tab.length; i++) {
		tab[i] = (int) (Math.random() *11);	
	}
	
	int[] occurence = new int[11];
	for(int i = 0; i <tab.length; i++) {
		occurences[tab[i]]++;
	}
	for(int i = 0; i <occurences.length; i++) {
		System.out.printf("&d : %d\n",i,occurences[i]);
	}
	
	}
}