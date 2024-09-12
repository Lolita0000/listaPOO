package br.com.pessoas;

public class Pessoa {
    private String nome;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private double altura;

    public Pessoa(String nome, int diaNascimento, int mesNascimento, int anoNascimento, double altura) {
        this.nome = nome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
    }

    public String getNome() { return nome; }
    public int getDiaNascimento() { return diaNascimento; }
    public int getMesNascimento() { return mesNascimento; }
    public int getAnoNascimento() { return anoNascimento; }
    public double getAltura() { return altura; }

    public void setNome(String nome) { this.nome = nome; }
    public void setDiaNascimento(int diaNascimento) { this.diaNascimento = diaNascimento; }
    public void setMesNascimento(int mesNascimento) { this.mesNascimento = mesNascimento; }
    public void setAnoNascimento(int anoNascimento) { this.anoNascimento = anoNascimento; }
    public void setAltura(double altura) { this.altura = altura; }

    public int calcularIdade() {
        int diaAtual = 11;
        int mesAtual = 9;
        int anoAtual = 2024;

        int idade = anoAtual - anoNascimento;

        if (mesAtual < mesNascimento || (mesAtual == mesNascimento && diaAtual < diaNascimento)) {
            idade--;
        }

        return idade;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Idade: " + calcularIdade() + " anos");
    }
}

