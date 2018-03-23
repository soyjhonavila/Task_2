package fundamentos_E;
import java.io.*;

/**
 * <p>
 * This class deals with how to solve problems with the help of recursions
 *  
 * </p>
 * <p>
 * The class contains the methods and functions necessary to:
 * <ul>
 * <li> Show each of the attributes of a particular instance of recursions
 * </li> 
 * <li>greatest common divisor
 * <li>strin pascal
 * <li>string inverse
 * <li>triangle of pascal
 * <li>multiplication 
 * <li>factorial
 * <li>fibonacci
 * </ul>
 * </p>
 *  
 * @author Jhon Avila
 * @since 22/march/2018
 *
 */
public class recursiones {

	    /**
	     * this function consists search the greatest common divisor of two numbers
	     * 
	     * @param a
	     * @param b
	     * @return   larger number that are divided two
	     */
	    public static  int mcd (int a,int b)
        {
    	   if (b == 0)
    	return a ;	
    	else
    	  return mcd (b,a % b); 	
        }
	    
	    /**
	     * this function consists in print the triangle of pascal
	     * 
	     * @return  
	     */
	    public static String print_pascal()
		{
			String pascal_matrix = "";
			
			for (int i = 0; i < 10; i++) 
			{
				for (int j = 0; j <= i; j++) 
					pascal_matrix += pascal(i, j) + "\t";
				pascal_matrix += "\n";
			}
			return pascal_matrix;
		}
		
	    /**
	     * this function consists in enter a cadela and then reverse it
	     * 
	     * @param cadena
	     * @return    string inverse
	     */
	    public static String inversa_cadena(String cadena)
		{
			if (cadena.length() == 1) 
			{
				return cadena;
			}
			else
			{
				return inversa_cadena(cadena.substring(1)) + cadena.charAt(0);
			}
		}
	    
	    /**
	     * this function consists in the multiplication of two numbers
	     * 
	     * @param n
	     * @param x
	     * @return
	     */
		public static int multiplicacion(int n, int x) 
		{
			if (x == 1) 
				return n;
			else 
				return n + multiplicacion(n, x - 1); 
		}
		
	    
		/**
		 * this function consists in the multiplication numbers that descend counting to 1
		 * 
		 * @param x
		 * @return
		 */
		public static int factorial(int x) 
		{
			if (x == 1) 
				return 1;
			else
				return x * factorial(x - 1);
		}
		
		/**
		 * this function consists in the sum of the previous two starting with 0 and 1
		 * 
		 * @param x
		 * @return
		 */
		public static int fibonacci(int x) 
		{
			if (x == 0) 
				return 0;
			else
				if(x == 1)
					return 1;
				else
					return fibonacci(x - 1) + fibonacci(x - 2);
		}
		
		/**
		 * this function is for triangle pascal
		 * 
		 * @param n
		 * @param k
		 * @return
		 */
		public static int pascal(int n, int k) 
		{
			if (k == 0 || k == n)
				return 1;
			else 
				return pascal(n - 1, k - 1) + pascal(n - 1, k);
		}
		
		public static void main(String[] args) 
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
			
			try 
	    {
				
				
	    
				bw.write(recursiones.mcd(369,1218) + "\n");
				bw.flush();
				
				bw.write(recursiones.print_pascal() + "\n");
				bw.flush();
				
				bw.write(recursiones.inversa_cadena("asdfghjkl") + "\n");
				bw.flush();
				
				bw.write(recursiones.multiplicacion(654, 97)+ "\n");
				bw.flush();
				
				bw.write(recursiones.factorial(15) + "\n");
				bw.flush();
				 
				bw.write(recursiones.fibonacci(25) + "\n");
				bw.flush();
				
				
				
			}
			catch(Exception ex)
			{
				ex.printStackTrace(); 
			}
		}

	}

