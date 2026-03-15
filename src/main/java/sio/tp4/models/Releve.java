package sio.tp4.models;

public class Releve
{

    private String dateReleve;
    private int valeurReleve;

    public Releve(String dateReleve, int valeurReleve) {
        this.dateReleve = dateReleve;
        this.valeurReleve = valeurReleve;
    }

    public String getDateReleve() {
        return dateReleve;
    }

    public void setDateReleve(String dateReleve)
    {
        this.dateReleve = dateReleve;
    }

    public int getValeurReleve()
    {
        return valeurReleve;
    }

    public void setValeurReleve(int valeurReleve) {
        this.valeurReleve = valeurReleve;
    }
}
