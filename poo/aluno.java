package br.com.notas;	
		public class Aluno {
		
	    private String matricula;
	    private double nota;
	    private String conceito;
	
	    public Aluno(String matricula, double nota) {
	    	this.matricula = matricula;
	        this.nota = nota;
	        this.conceito = atribuirConceito(nota);
	    }
	
	    private String atribuirConceito(double nota) {
	        if (nota >= 0 && nota < 5.0) {
	            return "D";
	        } else if (nota >= 6.0 && nota < 7.0) {
	            return "C";
	        } else if (nota >= 7.0 && nota < 9.0) {
	            return "B";
	        } else if (nota >= 9.0 && nota <= 10.0) {
	            return "A";
	        } else {
	            return "Nota inválida";
	        }
	    }
	
	    public String getMatricula() {
	        return matricula;
	    }
	
	    public double getNota() {
	        return nota;
	    }
	
	    public String getConceito() {
	        return conceito;
	    }
	}
