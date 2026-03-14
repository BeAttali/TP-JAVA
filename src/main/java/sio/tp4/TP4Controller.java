package sio.tp4;

import javafx.collections.FXCollections;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import sio.tp4.models.Agent;
import sio.tp4.models.Client;
import sio.tp4.models.Releve;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class TP4Controller implements Initializable {

    @FXML
    private TableColumn tcNumeroAgent;
    @FXML
    private TextField txtConsommation;
    @FXML
    private TableColumn tcNomClient;
    @FXML
    private Button btnInserer;
    @FXML
    private TableColumn tcNumeroClient;
    @FXML
    private TableView tvReleves;
    @FXML
    private TableColumn tcValeurReleve;
    @FXML
    private TableColumn tcDateReleve;
    @FXML
    private TableView tvClients;
    @FXML
    private TableColumn tcNomAgent;
    @FXML
    private DatePicker dpDateReleve;
    @FXML
    private TextField txtNouveauReleve;
    @FXML
    private TableView tvAgents;

    private ArrayList<Agent> agents = new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {

        tcNumeroAgent.setCellValueFactory(new PropertyValueFactory<>("idAgent"));
        tcNomAgent.setCellValueFactory(new PropertyValueFactory<>("nomAgent"));     // ← manquait !


        Agent agent1 = new Agent(1, "Enzo");
        Agent agent2 = new Agent(2, "Noa");
        Agent agent3 = new Agent(3, "Lilou");



        Client client1 = new Client(1, "Martin");
        Client client2 = new Client(2, "Alison");
        Client client3 = new Client(3, "Gand");
        Client client4 = new Client(4, "Muller");
        Client client5 = new Client(5, "Fortin");
        Client client6 = new Client(6, "Garnier");
        Client client7 = new Client(7, "Cousinot");

        Releve releve1  = new Releve("14/02/2024", 345);
        Releve releve2  = new Releve("21/07/2024", 987);
        Releve releve3  = new Releve("05/11/2024", 1117);
        Releve releve4  = new Releve("15/08/2024", 546);
        Releve releve5  = new Releve("05/11/2024", 261);
        Releve releve6  = new Releve("03/01/2024", 783);
        Releve releve7  = new Releve("13/04/2024", 904);
        Releve releve8  = new Releve("03/09/2024", 1283);
        Releve releve9  = new Releve("23/12/2024", 1846);
        Releve releve10 = new Releve("05/02/2024", 371);
        Releve releve11 = new Releve("11/06/2024", 613);
        Releve releve12 = new Releve("23/10/2024", 1071);
        Releve releve13 = new Releve("03/01/2024", 14);

// On ajoute nos relevés à nos clients
        client1.ajouterUnReleve(releve1);
        client1.ajouterUnReleve(releve2);
        client1.ajouterUnReleve(releve3);
        client2.ajouterUnReleve(releve4);
        client3.ajouterUnReleve(releve5);
        client3.ajouterUnReleve(releve6);
        client4.ajouterUnReleve(releve7);
        client4.ajouterUnReleve(releve8);
        client4.ajouterUnReleve(releve9);
        client5.ajouterUnReleve(releve10);
        client5.ajouterUnReleve(releve11);
        client5.ajouterUnReleve(releve12);
        client6.ajouterUnReleve(releve13);

// On ajoute nos clients à nos agents
        agent1.ajouterUnClient(client1);
        agent1.ajouterUnClient(client2);
        agent1.ajouterUnClient(client3);
        agent2.ajouterUnClient(client4);
        agent3.ajouterUnClient(client5);
        agent3.ajouterUnClient(client6);
        agent3.ajouterUnClient(client7);


        // Ajout des agents dans la collection
        agents.add(agent1);
        agents.add(agent2);
        agents.add(agent3);
        

        tvAgents.setItems(FXCollections.observableArrayList(agents));
    }

    public void initDatas()
    {
        // A vous de jouer
        // Créer le jeu d'essais
    }

    @FXML
    public void tvClientsClicked(Event event)
    {
        // A vous de jouer
    }

    @FXML
    public void btnInsererClicked(Event event)
    {
        // A vous de jouer
    }

    @FXML
    public void tvAgentsClicked(Event event)
    {
        // A vous de jouer
    }
}