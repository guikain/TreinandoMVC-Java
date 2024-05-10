package model;

import util.Util;

public abstract class Mob {
    
    protected int id;
    protected String nome;
    protected Comportamento comportamento;

    public Mob(String nome, Comportamento comportamento) {
        setId(Util.gerarMobID());
        setNome(nome);
        setComportamento(comportamento);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Comportamento getComportamento() {
        return comportamento;
    }

    public void setId(int id) {
        this.id = Util.verificaNum(id)? id : this.id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public abstract String agir();

    @Override
    public String toString() {
        return "Mob [id=" + id + ", nome=" + nome + ", comportamento=" + comportamento + "]";
    }
}
