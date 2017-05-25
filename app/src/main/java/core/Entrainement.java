package core;

import java.sql.Time;
import java.util.Date;

public class Entrainement {

    private int id;
    private int id_planning;
    private int id_groupe;
    private Date date;
    private Time horaire_debut;
    private Time horaire_fin;
    private String lieu;
    private int etat;

    public Entrainement(int id, int id_planning, int id_groupe, Date date, Time horaire_debut, Time horaire_fin, String lieu, int etat) {
        this.id = id;
        this.id_planning = id_planning;
        this.id_groupe = id_groupe;
        this.date = date;
        this.horaire_debut = horaire_debut;
        this.horaire_fin = horaire_fin;
        this.lieu = lieu;
        this.etat = etat;
    }

    public int getId() {
        return id;
    }

    public int getId_planning() {
        return id_planning;
    }

    public int getId_groupe() {
        return id_groupe;
    }

    public Date getDate() {
        return date;
    }

    public Time getHoraire_debut() {
        return horaire_debut;
    }

    public Time getHoraire_fin() {
        return horaire_fin;
    }

    public String getLieu() {
        return lieu;
    }

    public int getEtat() {
        return etat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_planning(int id_planning) {
        this.id_planning = id_planning;
    }

    public void setId_groupe(int id_groupe) {
        this.id_groupe = id_groupe;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setHoraire_debut(Time horaire_debut) {
        this.horaire_debut = horaire_debut;
    }

    public void setHoraire_fin(Time horaire_fin) {
        this.horaire_fin = horaire_fin;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }


}
