package br.inatel.c06.pcmania.computador;

public class SistemaOperacional {

    private String nome;
    private int tipo;

    public SistemaOperacional(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void mostraInfo() {
        System.out.println("Sistema Operacional: " + nome + " (" + tipo + " bits)");
    }
}