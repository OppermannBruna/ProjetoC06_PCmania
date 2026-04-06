package br.inatel.c06.pcmania.computador;

public class MemoriaUSB {

    private String nome;
    private int capacidade;

    public MemoriaUSB(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public void mostraInfo() {
        System.out.println("Acompanha: " + nome + " - " + capacidade + "Gb");
    }
}