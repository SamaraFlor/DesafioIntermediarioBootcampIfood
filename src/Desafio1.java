/*
Desafio
Neste desafio voc� dever� construir uma fun��o que recebe uma String e 
identifique se a mesma � um pal�ndromo, ou seja, se a String � igual a ela mesma invertida. 

Dado que temos a String "digital" uma vez invertida temos "latigid" que s�o diferentes. 

Logo, N�O � um Pal�ndromo. 

J� se recebemos a string "radar" uma vez invertida temos "radar" que s�o iguais.
 */

import java.util.Scanner;


public class Desafio1 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
    System.out.println("Digite a palavra");
        String palavra = sc.nextLine();

        
        
        String palavras1 = "";
        //separa o texto em linhas de acordo com uma regra, por exemplo, 
        //quero que meu texto seja separado cada vez que aparecer um ";":
        String[] letras = palavra.split("");
        for (int i = letras.length-1; i >= 0; i--){
        	palavras1 = palavras1 + letras[i];
        }
        // se palavras1 for igual palavra digitada "?" 
        System.out.println(palavras1.equals(palavra)?"TRUE":"FALSE");
    }
	

}
