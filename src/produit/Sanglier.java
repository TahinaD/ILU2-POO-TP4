package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private Gaulois chasseur;
	private int poids;

	public Sanglier(Unite unite, Gaulois chasseur, int poids) {
		super("sanglier", Unite.KILOGRAMME);
		this.chasseur = chasseur;
		this.poids = poids;
	}

	@Override
	public void decrireProduit() {
		System.out.println(nom + " de " + poids + unite + " chassé par " + chasseur.getNom());
	}

}
