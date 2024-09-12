package br.com.notas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String continuar = "S";

        while (continuar.equalsIgnoreCase("S")) {
            System.out.print("Digite o número de matrícula do aluno: ");
            String matricula = scanner.nextLine();
            System.out.print("Digite a nota do aluno: ");
            double nota = scanner.nextDouble();
            scanner.nextLine();

            Aluno aluno = new Aluno(matricula, nota);
            System.out.println("Matrícula: " + aluno.getMatricula() + " | Nota: " + aluno.getNota() + " | Conceito: " + aluno.getConceito());

            System.out.print("Deseja adicionar outro aluno? (S/N): ");
            continuar = scanner.nextLine();
        }

        scanner.close();

	}

}
