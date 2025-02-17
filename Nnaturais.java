package ex1;

public class Nnaturais 
{
  public Nnaturais()
  { super();
	  
  }
  
  static public int somatoria (int N) 
  { 
	 //condição de parada caso o número seja 0 não adicionará nenhum conteudo a somatória, com isso retornando o valor
	  if (N == 0)
	  {return 0;}
	  else 
	  {  return N = N + somatoria(N-1);  // retornando todos os valores da recursivdade
		  
	  }
	      
  }
  
  
  
  
  
  
}
