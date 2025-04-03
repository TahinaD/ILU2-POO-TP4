package produit;

public class Poisson extends Produit {
	private String nom = "poisson";
	private String datePeche;

	public Poisson(String datePeche) {
		super("poisson", Unite.PIECE);
		this.datePeche = datePeche;
	}

	@Override
	public void decrireProduit() {
		System.out.println(nom + " pêché le " + datePeche);
	}

}
