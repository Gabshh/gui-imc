package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Imc;

public class Frame {
	
	public void criarTela() {
		
		JFrame meuFrame = new JFrame();
		meuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		meuFrame.setSize(600, 600);
		meuFrame.setTitle("IMC Cálculo");
		meuFrame.setLayout(null);
		
		// Criar os componentes da tela
		// X, Y, width, height
		
		JLabel lblPeso = new JLabel();
		lblPeso.setText("Seu peso: ");
		lblPeso.setBounds(20, 20, 80, 30);
		
		JTextField txtPeso = new JTextField();
		txtPeso.setText(null);
		txtPeso.setBounds(100, 20, 80, 30);
		
		JLabel lblAltura = new JLabel();
		lblAltura.setText("Sua altura: ");
		lblAltura.setBounds(20, 60, 80, 30);
		
		JTextField txtAltura = new JTextField();
		txtAltura.setText("");
		txtAltura.setBounds(100, 60, 80, 30);
		
		JButton btnCalcular = new JButton();
		btnCalcular.setText("CALCULAR");
		btnCalcular.setBounds(10, 100, 200, 30);
		
		// RESULTADOS
		
		new Font("Sans Serif", Font.BOLD, 24);
		
		JLabel lblResultados = new JLabel();
		lblResultados.setText("Resultados:");
		lblResultados.setBounds(20, 150, 150, 30);
		lblResultados.setForeground(Color.BLACK);
		lblResultados.setFont(new Font("Sans Serif", Font.BOLD, 16));
		
		
		JLabel lblValor = new JLabel();
		lblValor.setText("Valor IMC: ");
		lblValor.setBounds(20, 200, 150, 30);
		lblValor.setFont(new Font("Sans Serif", Font.BOLD, 13));
		
		JLabel lblValorResultado = new JLabel();
		lblValorResultado.setText("");
		lblValorResultado.setBounds(100, 200, 40, 30);
		lblValorResultado.setForeground(Color.GREEN);
		lblValorResultado.setFont(new Font("Sans Serif", Font.BOLD, 13));
		
		JLabel lblEstado = new JLabel();
		lblEstado.setText("Estado IMC: ");
		lblEstado.setBounds(20, 230, 150, 30);
		lblEstado.setFont(new Font("Sans Serif", Font.BOLD, 13));
		
		JLabel lblEstadoResultado = new JLabel();
		lblEstadoResultado.setText("");
		lblEstadoResultado.setBounds(100, 230, 150, 30);
		lblEstadoResultado.setForeground(Color.GREEN);
		lblEstadoResultado.setFont(new Font("Sans Serif", Font.BOLD, 13));
		
		
		meuFrame.getContentPane().add(lblPeso);
		meuFrame.getContentPane().add(txtPeso);
		meuFrame.getContentPane().add(lblAltura);
		meuFrame.getContentPane().add(txtAltura);
		meuFrame.getContentPane().add(btnCalcular);
		meuFrame.getContentPane().add(lblResultados);
		meuFrame.getContentPane().add(lblValor);
		meuFrame.getContentPane().add(lblEstado);
		meuFrame.getContentPane().add(lblValorResultado);
		meuFrame.getContentPane().add(lblEstadoResultado);
		
		
		// POR ÚLTIMO!!
		
		meuFrame.setVisible(true);
		
		
		
		// EVENTOS DO BOTÃO
		
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Transformar strings em int
				
				String pesoString = txtPeso.getText();
				String alturaString = txtAltura.getText();
				
				Imc calculo = new Imc();
				
				calculo.peso = Integer.parseInt(pesoString);
				calculo.altura = Double.parseDouble(alturaString);
				
				calculo.calcular();
				
				lblValorResultado.setText("" + calculo.imc);
				
				// Mostrar Status
				
				calculo.setVerificarStatus();
				
				lblEstadoResultado.setText((calculo.getStatus()));
				
			}
		});
		
		
		
	}

}
