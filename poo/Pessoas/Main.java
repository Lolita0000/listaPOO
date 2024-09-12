package br.com.pessoas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o dia de nascimento (dd): ");
            int diaNascimento = scanner.nextInt();

            System.out.print("Digite o mês de nascimento (mm): ");
            int mesNascimento = scanner.nextInt();

            System.out.print("Digite o ano de nascimento (aaaa): ");
            int anoNascimento = scanner.nextInt();

            System.out.print("Digite a altura (em metros, ex: 1.75 ou 1,75): ");
            String alturaStr = scanner.next(); 
            alturaStr = alturaStr.replace(',', '.'); 
            double altura = Double.parseDouble(alturaStr);

            Pessoa pessoa = new Pessoa(nome, diaNascimento, mesNascimento, anoNascimento, altura);

            pessoa.imprimirDados();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro na entrada de dados: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
