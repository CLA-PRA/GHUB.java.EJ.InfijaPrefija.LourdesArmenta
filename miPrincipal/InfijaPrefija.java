package miPrincipal;

import java.util.Scanner;

public class InfijaPrefija {
	// Precedencia de operadores
	private static final int ES_TRES = 3;
	private static final int ES_DOS = 2;
    private static final int ES_UNO = 1;
    private static final int ES_CERO = 0;
    private static final int ES_MENOR_CERO = -1;
    
    static Scanner entrada = new Scanner(System.in);


    private static int precedencia(char operador) {
        switch (operador) {
            case '^':
            	return ES_TRES;
            case '*':
            case '/':
                return ES_DOS;
            case '+':
            case '-':
                return ES_UNO;
            case '(':
            	return ES_CERO;
            default:
                return ES_MENOR_CERO;
        }
    }

	
	public static String convertirAPrefijo(String expresionInfija) {
	
        Pila<String> pila = new Pila<>();
        StringBuilder cadenaPostFija = new StringBuilder();
       
        for(int i=0;i<=expresionInfija.length()-1;i++) {
        	
            char simbolo = expresionInfija.charAt(i);
            
            switch(simbolo) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
			   //coloque aquí el codigo para manejar operadores
        
            	
			
            	break;
            case')':
            	  //coloque el código para manejar el paréntesis derecho
            	 
		    	break;
		    			
            case '(':
            	//coloque el código para manejar el paréntesis izquierdo
            	break;
            case ' ':
            	//es un espacio en blanco y solo lo dejamos pasar
            	break;
            default:
			    //se considera que es un operando y se pasa a la cadena postfija
            	
        
            			
            				
           }//fin de switch
            	
        }//fin de for
        
		
		//retiramos los operandos que quedan en la pila
        
		

		//retornamos la cadena postfija
        
	}
	
	//convierte un char a un objeto tipo String
	private static String caracterToString(char ch) {
		  //retornamos el carácter convertido a String
		  
	}
	
	public static double evaluarPrefija(String expresionPrefija) {
		//Arreglo que almacenará operandos
		double valores[]=new double[expresionPrefija.length()];
		
		//creamos una pila de cadenas de nombre pila
		
		
		for (int i=0,j=0;i<=expresionPrefija.length()-1;i++) {
			char simbolo = expresionPrefija.charAt(i);
			if (!esOperador(simbolo)) {
				System.out.print("Dame valor para Operador "+simbolo+" ");
				valores[j]= entrada.nextDouble();
				pila.apilar(valores[j]+"");
				j++;
				
			}
			else{
				//Retiro los dos últimos elementos de la pila
				
				
				//efectuo la operación
				double z = calcularOperacion(x,y,simbolo);
				
				//apilo el resultado
				
				
			}
			
		}
		
		
		double valor = Double.parseDouble(pila.cima());
		pila.retirar();
		return valor;
		
	}
	
	private static boolean esOperador(char operador) {
        switch (operador) {
            case '^':
            case '*':
            case '/':
            case '+':
            case '-':
            
            	return true;
            default:
                return false;
        }
    }
	private static double calcularOperacion(double a, double b, char car) {
		switch(car) {
			case '^':
				//retornamos a elevado a la b
			case '/':
			  	//retornamos a dividido b
			
			case '*':
			 	//retornamos a por b
			   
			case '+':
			   	//retornamos a+b


			case '-':
			   //retornamos a-b
				   
			default:
			   //retornamos 0.0
			
		
		}
		
	}
	

}
