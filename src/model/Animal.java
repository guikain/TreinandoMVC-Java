package model;

public class Animal extends Mob{

    public Animal(String nome, Comportamento comportamento) {
        super(nome, comportamento);
    }

    @Override
    public String agir() {
        if(comportamento == Comportamento.AGRESSIVO){
            return nome + " está enfurecido e vindo te atacar.";
        }else{
            return nome + " está de boa.";
        }
    }

    @Override
    public String toString() {
        return "Animal []";
    }      
}
