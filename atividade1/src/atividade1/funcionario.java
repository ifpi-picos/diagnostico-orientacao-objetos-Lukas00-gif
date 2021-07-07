package atividade1;

import java.util.ArrayList;

public class funcionario {
	private String nome;
	private float salario;
	
	public static void main (String[] Args) {
	String beneficio1 = "plano de saude";
	String beneficio2 = "salario liquido e 5%";
	String beneficio3 = "Vale Refeiçao";
	String beneficio4 = "Ferias";
	String beneficio5 = "salario liquido de 10%";
	
	ArrayList<String> beneficio = new ArrayList<>();
	beneficio.add(beneficio1);
	beneficio.add(beneficio2);
	beneficio.add(beneficio3);
	beneficio.add(beneficio4);
	beneficio.add(beneficio5);
	}
	public void nome () {
		this.nome = "Lucas";
	}
	
	public void salario() {
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Float getSalario() {
		return salario;
	}
	
	public void setSalario (Float salario) {
		this.salario = salario;
	}
	
}








