
public class Client {
	String Nom;
	String Prenom;
	String Ville;
	
	public Client (String LeNom, String LePrenom, String LaVille) {
		this.Nom = LeNom;
		this.Prenom = LePrenom;
		this.Ville = LaVille;
	}
	
	public String GetNom () {
		return this.Nom;
	}
	
	public String GetPrenom () {
		return this.Prenom;
	}
	
	public String GetVille () {
		return this.Ville;
	}
	
	public void SetNom (String LeNom) {
		this.Nom = LeNom;
	}
	
	public void SetPrenom (String LePrenom) {
		this.Prenom = LePrenom;
	}
	
	public void SetVille (String LaVille) {
		this.Ville = LaVille;
	}
}
