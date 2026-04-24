package modele;

public class UserModele {
    private String date;
    private String time;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
	private int id_user;
	private String nom;
	private String sexe;
	private String email;
	private String password;
	private int volaDepot;
	private int volaSolde;
	private int volaRetrait;
	private int volaTransfert;
	private long numCompte;
	private int numMandef;
	
	
	public int getVolaRetrait() {
		return volaRetrait;
	}
	public void setVolaRetrait(int volaRetrait) {
		this.volaRetrait = volaRetrait;
	}
	public int getVolaTransfert() {
		return volaTransfert;
	}
	public void setVolaTransfert(int volaTransfert) {
		this.volaTransfert = volaTransfert;
	}
	public int getVolaSolde() {
		return volaSolde;
	}
	public void setVolaSolde(int volaSolde) {
		this.volaSolde = volaSolde;
	}
	public int getVolaDepot() {
		return volaDepot;
	}
	public void setVolaDepot(int volaDepot) {
		this.volaDepot = volaDepot;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(long numCompte) {
		this.numCompte = numCompte;
	}
	public int getNumMandef() {
		return numMandef;
	}
	public void setNumMandef(int numMandef) {
		this.numMandef = numMandef;
	}
	
	
}
