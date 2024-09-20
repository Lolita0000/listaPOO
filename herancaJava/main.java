public class main {
    public static void main(String[] args) {
        carro carro = new carro("Toyota", "Corolla", 2020, 4);
        carro.acelerar();
        carro.exibirInformacao();
        carro.abrirPortaMala();

        moto moto = new moto("Honda", "CBR", 2021, true);
        moto.acelerar();
        moto.exibirInformacao();
        moto.empinar();
    }
}
