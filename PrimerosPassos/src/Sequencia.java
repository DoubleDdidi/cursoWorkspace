
public class Sequencia {
	public static void main(String[] args) {
		   int x = 13; 
		   int aux = 0; 
		   while( x !=1 ){ 
	            if( x % 2 == 0){  
	            	aux = x/2;  
	             }else{  
	            	 aux = 3*x+1;  
	             }  
	            System.out.print(aux + (aux==1?"":">"));  
	            x = aux;    
	        }     
	  } 
}
