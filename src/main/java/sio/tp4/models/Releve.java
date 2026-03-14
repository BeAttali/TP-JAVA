package sio.tp4.models;

public class Releve
{

    private String dateRevele;
    private int valeurRevele;

    public Releve(String dateRevele, int valeurRevele) {
        this.dateRevele = dateRevele;
        this.valeurRevele = valeurRevele;
    }

    public String getDateRevele() {
        return dateRevele;
    }

    public void setDateRevele(String dateRevele)
    {
        this.dateRevele = dateRevele;
    }

    public int getValeurRevele()
    {
        return valeurRevele;
    }

    public void setValeurRevele(int valeurRevele) {
        this.valeurRevele = valeurRevele;
    }
}
