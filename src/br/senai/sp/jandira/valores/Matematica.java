package br.senai.sp.jandira.valores;

import br.senai.sp.jandira.status.TabelaStatus;

public class Matematica {
	
	public int peso;
	public double altura;
	public double imc;
	public String status;

	public void calcular() {

		imc = peso / (altura * altura);
		System.out.println(imc);
		
		TabelaStatus Estado = new TabelaStatus();
		
		Estado.verificarStatus();
		
	}
	
	
//	public String estado = status;

}
