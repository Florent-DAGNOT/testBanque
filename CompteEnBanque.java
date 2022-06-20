import java.util.ArrayList;

public class CompteEnBanque {
	String NumeroCompte;
	Client LeClient;
	int LeSolde;
	ArrayList<Operation> LesOperations;
	
	public CompteEnBanque (String initNumCmpt, String initNom, String initPrenom, String initVille) {
		this.Initialisation(initNumCmpt, initNom, initPrenom, initVille);
	}
	
	public void Initialisation (String NumCompte, String LeNom, String LePrenom, String LaVille) {
		this.NumeroCompte = NumCompte;
		LeClient = new Client(LeNom, LePrenom, LaVille);
		this.LeSolde = 0;
		LesOperations = new ArrayList<Operation>();
	}
	
	public void Crediter (int LaSomme) {
		this.LeSolde += LaSomme;
		Operation Ope = new Operation();
		Ope.EnregistrerOperation(LaSomme, 2);
		this.LesOperations.add(Ope);
	}
	
	public void Debiter (int LaSomme) {
		this.LeSolde -= LaSomme;
		Operation Ope = new Operation();
		Ope.EnregistrerOperation(LaSomme, 1);
		this.LesOperations.add(Ope);
	}
	
	public int DonneSolde () {
		return this.LeSolde;
	}
	
	public void setSolde(int Solde) {
		this.LeSolde = Solde;
	}
	
	public String DonneNumeroCompte() {
		return this.NumeroCompte;
	}
	
	void AfficheLesOperations () {
		for (int i = 0 ; i < this.LesOperations.size() ; i++) {
			if (this.LesOperations.get(i).DonneType() == 1)
				System.out.println("Operation n°" + i + " - Type : Debit - Montant : " + this.LesOperations.get(i).DonneMontant());
			else if (this.LesOperations.get(i).DonneType() == 2)
				System.out.println("Operation n°" + i + " - Type : Credit - Montant : " + this.LesOperations.get(i).DonneMontant());
			else
				System.out.println("Operation n°" + i + " - Type : Inconnu - Montant : " + this.LesOperations.get(i).DonneMontant());
		}
	}
	
	Client DonneLeClient () {
		return this.LeClient;
	}
	
	public int SommeCredit () {
		int Somme = 0;
		for (int j = 0 ; j < this.LesOperations.size() ; j++)
			if (this.LesOperations.get(j).DonneType() == 2)
				Somme += this.LesOperations.get(j).DonneMontant();
		return Somme;
	}
	
	public int SommeDebit () {
		int Somme = 0;
		for (int j = 0 ; j < this.LesOperations.size() ; j++)
			if (this.LesOperations.get(j).DonneType() == 1)
				Somme += this.LesOperations.get(j).DonneMontant();
		return Somme;
	}
}
