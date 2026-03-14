package sio.tp4.models;

import java.util.ArrayList;

public class Agent {
    private int idAgent;
    private String nomAgent;
    private ArrayList<Client> clients;

    public Agent(int idAgent, String nomAgent) {
        this.idAgent = idAgent;
        this.nomAgent = nomAgent;
        this.clients = new ArrayList<>();
    }

    public int getIdAgent() { return idAgent; }

    public void setIdAgent(int idAgent) { this.idAgent = idAgent; }

    public String getNomAgent() { return nomAgent; }

    public void setNomAgent(String nomAgent) { this.nomAgent = nomAgent; }

    public ArrayList<Client> getClients() { return clients; }

    public void setClients(ArrayList<Client> clients) { this.clients = clients; }

    public void ajouterUnClient(Client cli) { clients.add(cli); }
}
