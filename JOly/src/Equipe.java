import java.util.*;

public class Equipe {

	ArrayList<Athlete> sesMembres;
	Pays sonPays;
	ArrayList<Medaille> sesMedaille;
	ArrayList<Epreuve> sesEpreuves;
	private int numero;
	private String nom;

	private static int nbEquipe = 0;

	/**
	 * 
	 * @param nom
	 * @param pays
	 */
	public Equipe(String nom, Pays pays) {

		this.numero = nbEquipe;
		this.nom = nom;
		this.sonPays = pays;

		this.sesMembres = new ArrayList<Athlete>();
		this.sesMedaille = new ArrayList<Medaille>();
		this.sesEpreuves = new ArrayList<Epreuve>();

		nbEquipe++;
	}

	/**
	 * 
	 * @param athlete
	 */
	public void ajoutMembre(Athlete athlete) {

		if (sesMembres.contains(athlete))
			System.out.println("Athlete déjà dans l'equipe");
		else
			this.sesMembres.add(athlete);

	}

	/**
	 * 
	 * @param athlete
	 */
	public void suppressionMembre(Athlete athlete) {
		sesMembres.remove(athlete);
	}


}