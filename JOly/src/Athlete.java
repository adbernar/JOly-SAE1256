import java.util.*;

public class Athlete extends Utilisateur {

	Equipe sonEquipe;
	Pays sonPays;
	ArrayList<Medaille> sesMedailles;
	private float taille;
	private float poids;

	/**
	 *
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param age
	 * @param mail
	 * @param poids
	 * @param taille
	 */
	public Athlete(int id, String nom, String prenom, int age, String mail, float poids, float taille) {

		super(id, nom, prenom, age, mail);
		this.taille = taille;
		this.poids = poids;

	}

}