public class moto extends veiculo {
    private boolean temCarenagem;

    public moto(String marca, String modelo, int ano, boolean temCarenagem) {
        super(marca, modelo, ano);
        this.temCarenagem = temCarenagem;
    }

    public void empinar() {
        System.out.println("A moto está empinando.");
    }
}
