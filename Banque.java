import java.util.*;

public class Banque {
	ArrayList<CompteEnBanque> LesComptes;
	
	public Banque () {
		this.LesComptes = new ArrayList<CompteEnBanque>();
	}
	
	public void CreerCompte (String NumCompte, String LeNom, String LePrenom, String LaVille) {
		CompteEnBanque Compte = new CompteEnBanque(NumCompte, LeNom, LePrenom, LaVille);
		this.LesComptes.add(Compte);
	}
	
	public void Crediter (String NumeroCompte, int LaSomme) {
		for (int i = 0 ; i < this.LesComptes.size() ; i++)
			if (this.LesComptes.get(i).DonneNumeroCompte() == NumeroCompte)
				this.LesComptes.get(i).Crediter(LaSomme);
	}
	
	public void Debiter (String NumeroCompte, int LaSomme) {
		for (int j = 0 ; j < this.LesComptes.size() ; j++)
			if (this.LesComptes.get(j).DonneNumeroCompte() == NumeroCompte)
				this.LesComptes.get(j).Debiter(LaSomme);
	}
	
	public int DonneSolde (String NumeroCompte) {
		int Sld = 0; 
		for (int k = 0 ; k < this.LesComptes.size() ; k++)
			if (this.LesComptes.get(k).DonneNumeroCompte() == NumeroCompte)
				Sld = this.LesComptes.get(k).DonneSolde();
		return Sld;
	}
	
	public Client DonneClient (String NumeroCompte) {
		Client Clt = new Client("INCONNU", "INCONNU", "INCONNU");
		for (int l = 0 ; l < this.LesComptes.size() ; l++)
			if (this.LesComptes.get(l).DonneNumeroCompte() == NumeroCompte)
				Clt = this.LesComptes.get(l).DonneLeClient();
		return Clt;
	}
	
	public void AfficheClient (String NumeroCompte) {
		for (int m = 0 ; m < this.LesComptes.size() ; m++)
			if (this.LesComptes.get(m).DonneNumeroCompte() == NumeroCompte)
				System.out.println("Nom: " + this.LesComptes.get(m).DonneLeClient().GetNom() + " Prenom: " + this.LesComptes.get(m).DonneLeClient().GetPrenom() + " Ville: " + this.LesComptes.get(m).DonneLeClient().GetVille());
	}
	
	public void AfficheClientEtOperations (String NumeroCompte) {
		this.AfficheClient(NumeroCompte);
		for (int n = 0 ; n < this.LesComptes.size() ; n++)
			if (this.LesComptes.get(n).DonneNumeroCompte() == NumeroCompte)
				this.LesComptes.get(n).AfficheLesOperations();
	}
	
	public void AfficheLesComptes () {
		for (int o = 0 ; o < this.LesComptes.size() ; o++) {
			System.out.println("N°Compte: " + this.LesComptes.get(o).DonneNumeroCompte() + " Solde: " + this.LesComptes.get(o).DonneSolde());
			this.AfficheClient(this.LesComptes.get(o).DonneNumeroCompte());
		}
	}
	
	public int NombreComptes () {
		return this.LesComptes.size();
	}
	
	public int SommeCredit (String NumeroCompte) {
		for (int p = 0 ; p < this.LesComptes.size() ; p++)
			if (this.LesComptes.get(p).DonneNumeroCompte() == NumeroCompte)
				return this.LesComptes.get(p).SommeCredit();
		return -1;
	}
	
	public int SommeDebit (String NumeroCompte) {
		for (int q = 0 ; q < this.LesComptes.size() ; q++)
			if (this.LesComptes.get(q).DonneNumeroCompte() == NumeroCompte)
				return this.LesComptes.get(q).SommeDebit();
		return -1;
	}
}
