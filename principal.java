package view;

import javax.swing.JOptionPane;

import ex1.Nnaturais;

public class principal {

	public static void main(String[] args) 
	{
		Nnaturais nnaturais =new Nnaturais();
		
   int numero = -1;
     while(numero < 0)
     {
    	 
     
		 numero = Integer.parseInt(JOptionPane.showInputDialog
             ("Insira um número inteiro maior que zero: "));
	 }
     
     int resultado = Nnaturais.somatoria(numero);
     System.out.println(resultado);
	}

}
