package br.inatel.c06.pcmania.cliente;

import br.inatel.c06.pcmania.computador.Computador;

public class Cliente {

    private String nome;
    private String cpf;
    private Computador[] computadores = new Computador[10];
    private int qtdComputadores = 0;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void comprarComputador(Computador pc) {
        computadores[qtdComputadores] = pc;
        qtdComputadores++;
    }

    public float calculaTotalCompra() {
        float total = 0;
        for(int j = 0; j < qtdComputadores; j++) {

            if(computadores[j] != null) {
                total += computadores[j].getPreco();
            }
        }
        return total;
    }

    public Computador[] getComputadores() {
        return computadores;
    }

    public int getQtdComputadores() {
        return qtdComputadores;
    }

    public void mostraInfo() {
        System.out.println("\nCliente: " + nome);
        System.out.println("CPF: " + cpf);
    }
}