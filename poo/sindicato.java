import java.util.ArrayList;

public class Sindicato {
    private ArrayList<Professor> professores;

    public Sindicato() {
        professores = new ArrayList<>();
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public double calcularTotalContribuicoes() {
        double total = 0;
        for (Professor professor : professores) {
            total += professor.calcularContribuicao();
        }
        return total;
    }

    public int contarMestres() {
        int contagem = 0;
        for (Professor professor : professores) {
            if (professor.getTitulacao().equalsIgnoreCase("mestre")) {
                contagem++;
            }
        }
        return contagem;
    }
}
