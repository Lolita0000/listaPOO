public class carro extends veiculo {
    private int portas;

    public carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }

    public void abrirPortaMala() {
        System.out.println("Abrindo o porta-malas.");
    }
}
