package br.inatel.cdg;

public class Pokemon {
    public String nome;
    public Double vida;
    public String arma;

    public Pokemon(String nome, Double vida, String arma) {
        this.nome = nome;
        this.vida = vida;
        this.arma = arma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getVida() {
        return vida;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }
}