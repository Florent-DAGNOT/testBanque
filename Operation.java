
public class Operation {
	int Montant;
	int TypeOp;
	
	public Operation () {
		this.EnregistrerOperation(0, -1);
	}
	
	public void EnregistrerOperation (int LaSomme, int LeType) {
		this.Montant = LaSomme;
		this.TypeOp = LeType;
	}
	
	public int DonneMontant () {
		return this.Montant;
	}
	
	public int DonneType () {
		return this.TypeOp;
	}
}
