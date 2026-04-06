package br.inatel.c06.pcmania.computador;

public class Computador {

    private String marca;
    private float preco;
    private SistemaOperacional sistema;
    private HardwareBasico[] hardwares = new HardwareBasico[3];
    private MemoriaUSB usb;

    public Computador(String marca, float preco) {
        this.marca = marca;
        this.preco = preco;
    }

    public void addHardware(HardwareBasico hw, int pos) {
        hardwares[pos] = hw;
    }

    public void setSistemaOperacional(SistemaOperacional sistema) {
        this.sistema = sistema;
    }

    public void addMemoriaUSB(MemoriaUSB usb) {
        this.usb = usb;
    }

    public float getPreco() {
        return preco;
    }

    public void mostraPCConfigs() {

        System.out.println("\nMarca: " + marca);
        System.out.println("Preço: R$" + preco);

        for(int j = 0; j < hardwares.length; j++) {

            if(hardwares[j] != null) {
                hardwares[j].mostraInfo();
            }
        }

        sistema.mostraInfo();

        if(usb != null) {
            usb.mostraInfo();
        }
    }
}