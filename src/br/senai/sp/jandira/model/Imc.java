package br.senai.sp.jandira.model;

public class Imc {
	
	public double peso;
	public double altura;
	public double imc;
	public String status;

	public void calcular() {

		imc = peso / (altura * altura);
	}
	
	public double getImc() {
		return imc;
	}

	public void setVerificarStatus() {

		if (imc < 18.5) {
			status = "Abaixo do peso!!";
		} else if (imc >= 18.5 && imc < 25) {
			status = "Peso ideal!!";
		} else if (imc >= 25 && imc < 30) {
			status = "Sobrepeso!!";
		} else if (imc >= 30 && imc < 35) {
			status = "Obesidade Grau I !!";
		} else if (imc >= 35 && imc < 40) {
			status = "Obesidade Grau II !!";
		} else {
			status = "Obesidade Grau III (Mórbida)!!";
		}

	}
	
	public String getStatus() {
		return status;
	}

	

}
