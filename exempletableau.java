package exempletableau;

import java.util.Scanner;

public class taile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Le programme devrait demander a l'utilisateur de saisir la taille du tableau
		
		int[] tabentiers ;
		int taille ; 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Donnez le nombre d'element de votre tableau : ");
		
		taille = sc.nextInt();
		
		tabentiers = new int[taille];
		
		// remplissage du tableau
		
		for (int i=0 ; i < tabentiers.length ; i++ ) {
			
			System.out.print("element "+ (i+1)+ ": ");
			
			tabentiers[i]=sc.nextInt();
			
			
		}
		
		// Affichage de la valeur la plus grande (max du tableau)
		
		int Max = maxTab (tabentiers);
		
				System.out.print("Le max de mon tableau est : " + Max +"\n");
				
				int [] nouvTableau = {16,18,59,32};
				
				Max = maxTab (nouvTableau);
				
				System.out.print("le max de mon tableau est :" + Max +"\n");
				
				//il devrait afficher le maximum parmi ces éléments
			}
		
		
	
			
		static int maxTab (int[] tab) {
		
		int Max = tab[0];
		
		for (int i = 1 ; i < tab.length;i++) {
			
			if (tab[i] < Max) {
				Max = tab[i];
			 
			}
		}
		return Max;
		
	}

}
