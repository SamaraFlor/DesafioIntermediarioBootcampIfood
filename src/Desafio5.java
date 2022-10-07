import java.util.Scanner;
/*
 * Desafio
O fatorial de um n�mero inteiro positivo N � o produto de todos os inteiros positivos menores ou iguais a n.
Fazemos um fatorial desajeitado usando os inteiros em ordem decrescente, 
trocando as opera��es de multiplica��o por uma rota��o fixa de opera��es 
cuja ordem �: multiplicar '*', dividir '/', adicionar '+' e subtrair '-'.
 Por exemplo, desajeitado(10) = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1. 
 Lembre-se que no fatorial desajeitado as opera��es ainda s�o aplicadas usando a ordem usual de opera��es aritm�ticas. 
 Al�m disso, a divis�o neste caso sempre resulta em um n�mero inteiro, 
por exemplo, 90 / 8 = 11. Dado um inteiro N, retorne o fatorial desajeitado de n.
 */

public class Desafio5 {
	
	 public static void main(String[] args) {
		 System.out.println("Digite o numero");
	        int n = Integer.parseInt(new Scanner(System.in).nextLine());
	        int res = 0;
	        int cnt = 1;
	        int tmp = n;
	        n--;
	        while (n > 0) {

	            tmp *= n;
	            n--;

	            if(n != 0){
	                tmp /= n;
	                n--;
	            }

	            tmp += n;
	            n--;

	            res += tmp;

	            tmp = -n;

	            if (n == 1 ){
	                res += tmp;
	            }   

	            n--;
	  
	        }
	        System.out.println(res);
	 }
}
