/*
==> Projeto PCMania <==
Nome: Bruna Oppermann
Curso: GEC - Matricula: 2106
*/

package br.inatel.c06.pcmania.main;

import java.util.Scanner;
import br.inatel.c06.pcmania.computador.Computador;
import br.inatel.c06.pcmania.computador.HardwareBasico;
import br.inatel.c06.pcmania.computador.MemoriaUSB;
import br.inatel.c06.pcmania.computador.SistemaOperacional;
import br.inatel.c06.pcmania.cliente.Cliente;
import br.inatel.c06.pcmania.pedido.ProcessarPedido;

public class Main {

    public static void main(String[] args) {

        // --- SETUP DAS PROMOÇÕES ---
        MemoriaUSB memoria1 = new MemoriaUSB("Pen-drive", 16);
        Computador promocao1 = new Computador("Apple", 2106);
        promocao1.setSistemaOperacional(new SistemaOperacional("macOS Sequoia", 64));
        promocao1.addHardware(new HardwareBasico("Pentium Core i3", 2200), 0);
        promocao1.addHardware(new HardwareBasico("Memoria RAM", 8), 1);
        promocao1.addHardware(new HardwareBasico("HD", 500), 2);
        promocao1.addMemoriaUSB(memoria1);

        MemoriaUSB memoria2 = new MemoriaUSB("Pen-drive", 32);
        Computador promocao2 = new Computador("Samsung", 3340);
        promocao2.setSistemaOperacional(new SistemaOperacional("Windows 8", 64));
        promocao2.addHardware(new HardwareBasico("Pentium Core i5", 3370), 0);
        promocao2.addHardware(new HardwareBasico("Memoria RAM", 16), 1);
        promocao2.addHardware(new HardwareBasico("HD", 1024), 2);
        promocao2.addMemoriaUSB(memoria2);

        MemoriaUSB memoria3 = new MemoriaUSB("HD Externo", 1024);
        Computador promocao3 = new Computador("Dell", 7784);
        promocao3.setSistemaOperacional(new SistemaOperacional("Windows 10", 64));
        promocao3.addHardware(new HardwareBasico("Pentium Core i7", 4500), 0);
        promocao3.addHardware(new HardwareBasico("Memoria RAM", 32), 1);
        promocao3.addHardware(new HardwareBasico("HD", 2048), 2);
        promocao3.addMemoriaUSB(memoria3);

        Cliente cliente = new Cliente("Bruna Oppermann", "00011122233");
        Scanner x = new Scanner(System.in);
        int opcao;

        System.out.println("==> PCMania <==");
        System.out.println("Escolha a promoção desejada:");
        System.out.println("1 - Apple");
        System.out.println("2 - Samsung");
        System.out.println("3 - Dell");
        System.out.println("0 - Finalizar compra");

        do {
            opcao = x.nextInt();

            if (opcao == 1) {
                cliente.comprarComputador(promocao1);
                System.out.println("PC Apple adicionado!");
            }
            else if (opcao == 2) {
                cliente.comprarComputador(promocao2);
                System.out.println("PC Samsung adicionado!");
            }
            else if (opcao == 3) {
                cliente.comprarComputador(promocao3);
                System.out.println("PC Dell adicionado!");
            }
            else if (opcao == 0) {
                System.out.println("Compra finalizada!");
            }
            else {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        System.out.println("\n====== RESUMO DA COMPRA ======");
        cliente.mostraInfo();
        System.out.println("\nPCs adquiridos:");

        Computador[] pcsComprados = cliente.getComputadores();
        for (int j = 0; j < cliente.getQtdComputadores(); j++) {
            if (pcsComprados[j] != null) {
                pcsComprados[j].mostraPCConfigs();
            }
        }

        System.out.println("\nVALOR TOTAL: R$ " + cliente.calculaTotalCompra());
        System.out.println("==============================");

        ProcessarPedido.processar(cliente.getComputadores());

        x.close();
    }
}