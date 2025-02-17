package view;

import javax.swing.JOptionPane; 

import ex1.Nnaturais; // importando a biblioteca com a operação da recursividade 

public class principal {

	public static void main(String[] args) 
	{
		Nnaturais nnaturais =new Nnaturais();
		
   int numero = -1;
     while(numero < 0) // garantindo que o número seja maior que zero
     {
    	 
     
		 numero = Integer.parseInt(JOptionPane.showInputDialog
             ("Insira um número inteiro maior que zero: "));
	 }
     
     int resultado = Nnaturais.somatoria(numero);
     System.out.println(resultado);
	}

}
