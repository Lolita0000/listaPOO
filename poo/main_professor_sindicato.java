import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sindicato sindicato = new Sindicato();
        String continuar;

        do {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("CPF: ");
            String cpf = scanner.nextLine();
            System.out.print("Titulação (Doutor, Mestre, Especialista): ");
            String titulacao = scanner.nextLine();
            System.out.print("Salário: ");
            double salario = scanner.nextDouble();
            scanner.nextLine();

            Professor professor = new Professor(nome, cpf, titulacao, salario);
            sindicato.adicionarProfessor(professor);

            System.out.print("Deseja adicionar outro professor? (s/n): ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

        double totalArrecadado = sindicato.calcularTotalContribuicoes();
        int quantidadeMestres = sindicato.contarMestres();


        System.out.printf("Total arrecadado pelo sindicato: R$ %.2f%n", totalArrecadado);
        System.out.println("Quantidade de professores que são Mestres: " + quantidadeMestres);

        scanner.close();
    }
}
