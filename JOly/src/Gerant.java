public class Gerant extends Utilisateur {

	private String role;

	public void ajoutResultat() {
		// TODO - implement Gerant.ajoutResultat
		throw new UnsupportedOperationException();
	}

	public Gerant(int id, String nom, String prenom, int age, String mail, String role) {

		super(id, nom, prenom, age, mail);
		this.role = role;
	}

}