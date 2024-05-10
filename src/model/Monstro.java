package model;

public class Monstro extends Mob{

    private String grito;

    public Monstro(String nome, String grito) {
        super(nome, Comportamento.AGRESSIVO);
        this.grito = grito;
    }

    public String getGrito() {
        return grito;
    }

    public void setGrito(String grito) {
        this.grito = grito;
    }

    @Override
    public String agir() {
        return grito + "\n " + nome + " parte para cima de você!";
    }    
}
