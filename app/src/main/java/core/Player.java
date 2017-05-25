package core;

import java.net.PasswordAuthentication;
import java.sql.Blob;

public class Player {

    private int id;
    private int id_groupe;
    private int statut_in_groupe;
    private String prenom;
    private String nom;
    private String derby_name;
    private PasswordAuthentication mdp;
    private int sexe; //0 homme/1 femme
    private String email;
    private Blob photo;
    private int privilege; //0 membre/1 admin/ 2 super admin

    public Player() {
        
    }

    public Player(int id, int id_groupe, int statut_in_groupe, String prenom, String nom, String derby_name, PasswordAuthentication mdp, int sexe, String email, Blob photo, int privilege) {
        this.id = id;
        this.id_groupe = id_groupe;
        this.statut_in_groupe = statut_in_groupe;
        this.prenom = prenom;
        this.nom = nom;
        this.derby_name = derby_name;
        this.mdp = mdp;
        this.sexe = sexe;
        this.email = email;
        this.photo = photo;
        this.privilege = privilege;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_groupe() {
        return id_groupe;
    }

    public void setId_groupe(int id_groupe) {
        this.id_groupe = id_groupe;
    }

    public int getStatut_in_groupe() {
        return statut_in_groupe;
    }

    public void setStatut_in_groupe(int statut_in_groupe) {
        this.statut_in_groupe = statut_in_groupe;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDerby_name() {
        return derby_name;
    }

    public void setDerby_name(String derby_name) {
        this.derby_name = derby_name;
    }

    public PasswordAuthentication getMdp() {
        return mdp;
    }

    public void setMdp(PasswordAuthentication mdp) {
        this.mdp = mdp;
    }

    public int getSexe() {
        return sexe;
    }

    public void setSexe(int sexe) {
        this.sexe = sexe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Blob getPhoto() {
        return photo;
    }

    public void setPhoto(Blob photo) {
        this.photo = photo;
    }

    public int getPrivilege() {
        return privilege;
    }

    public void setPrivilege(int privilege) {
        this.privilege = privilege;
    }
}
