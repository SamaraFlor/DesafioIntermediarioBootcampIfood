import java.util.Scanner;

/*
Desafio
Dada uma string com apenas os seguintes caracteres '(', ')', '{', '}', '[', ']' 
determine se uma determinada string é válida. 
 */
public class Desafio2 {
	  public static void main(String[] args) {
	        Scanner scanner= new Scanner(System.in);

	        System.out.println("Digite a palavra desejada");
	        boolean caracter = ehValido(scanner.nextLine());

	        System.out.println(caracter);
	    }

	    public static boolean ehValido(String s) {
	    	String[] strings = s.split("");
	        String[] sinais = {"(",")","{","}","[","]"};
	        boolean f = false;

	        for(int i = 0; i < sinais.length; i++){
	            if (strings[0].equals(sinais[i]) && strings[strings.length-1].equals(sinais[i + 1])){
	                f = true ;
	            } 
	        }
	        return f;
	        
	    }


}
