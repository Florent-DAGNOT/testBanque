//import java.util.*;

public class UtilBanque {

	public static void main(String[] args) {
		Banque Bank = new Banque();
		//Scanner Scan = new Scanner(System.in);
		//int Choix = 0;
		
		Bank.CreerCompte("CeB01", "Caiss", "Jean", "Lyon");
		Bank.CreerCompte("CeB02", "Clair", "Marie", "Paris");
		//Bank.CreerCompte("CeB03", "Abaco", "Josianne", "Bordeaux");
		//Bank.CreerCompte("CeB04", "McThune", "John", "Marseille");
		
		Bank.Crediter("CeB01", 100);
		Bank.Crediter("CeB02", 100);
		//Bank.Crediter("CeB03", 1500);
		//Bank.Debiter("CeB04", 250);
		
		Bank.AfficheLesComptes();
		
		/*Bank.Crediter("CeB04", 750);
		Bank.Crediter("CeB04", 300);
		Bank.Debiter("CeB04", 200);
		
		System.out.println("SommeCredit: " + Bank.SommeCredit("CeB04"));
		
		System.out.println("Difference: " + (Bank.SommeCredit("CeB04")-Bank.SommeDebit("CeB04")));
		
		if (Bank.DonneSolde("CeB04") - (Bank.SommeCredit("CeB04") - Bank.SommeDebit("CeB04")) == 0)
			System.out.println("OK");
		else
			System.out.println("PAS OK");*/
		
		//Menu
		/*do {
			System.out.println("Que souhaitez-vous faire ?");
			System.out.println("1) Cr�er un compte");
			System.out.println("2) Supprimer un compte");
			System.out.println("3) Ajouter une op�ration sur un compte");
			System.out.println("4) Supprimer une op�ration sur un compte");
			System.out.println("5) Lister les comptes d'un client");
			System.out.println("5) Afficher le nombre de clients");
			System.out.println("5) Afficher les sommes de credits et de debits d'un client");
			System.out.println("0) Quitter le menu");
			Choix = Scan.nextInt();
			Switch() {
				case 1: ;
				default: ;
			}
		} while();*/
	}

}
