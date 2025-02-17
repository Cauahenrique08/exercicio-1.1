package ex1;

public class Nnaturais 
{
  public Nnaturais()
  { super();
	  
  }
  
  static public int somatoria (int N) 
  { 
	 //condição de parada
	  if (N == 0)
	  {return 0;}
	  else 
	  {  return N = N + somatoria(N-1);
		  
	  }
	      
  }
  
  
  
  
  
  
}
