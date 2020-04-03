package training.dto;

public class UtilisateurResponse {
    public String pseudo;
    public String email;
    public int pointsTotaux;

    public UtilisateurResponse(String pseudo, String email,int pointsTotaux){
        this.pseudo =pseudo;
        this.email = email;
        this.pointsTotaux = pointsTotaux;
    }
}
