package sio.tp4.models;

import java.util.ArrayList;

public class Client {
    private int idClient;
    private String nomClient;
    private ArrayList<Releve> releves;

    public Client(int idClient, String nomClient) {
        this.idClient = idClient;
        this.nomClient = nomClient;
        this.releves = new ArrayList<>();
    }

    public int getIdClient() { return idClient; }

    public void setIdClient(int idClient) { this.idClient = idClient; }

    public String getNomClient() { return nomClient; }

    public void setNomClient(String nomClient) { this.nomClient = nomClient; }

    public ArrayList<Releve> getReleves() { return releves; }

    public void setReleves(ArrayList<Releve> releves) { this.releves = releves; }

    public void ajouterUnReleve(Releve unReleve) { this.releves.add(unReleve); }

    public int calculerConsommation() {
        // Pas assez de relevés
        if (releves.size() < 2) return 0;

        // Récupérer le dernier relevé
        Releve dernier = releves.get(releves.size() - 1);

        // Récupérer l'avant dernier relevé
        Releve avantDernier = releves.get(releves.size() - 2);

        // Retourner la différence
        return dernier.getValeurReleve() - avantDernier.getValeurReleve();
    }

    public boolean verifierValeurNouveauReleve(int nouvelleValeur) {
        if(releves.isEmpty()) return true;
        Releve dernier = releves.get(releves.size()-1);
        return  nouvelleValeur >= dernier.getValeurReleve();
    }

}
