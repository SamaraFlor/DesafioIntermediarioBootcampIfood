import java.util.Scanner;

/*
Desafio  
Dado um inteiro n, retorne o menor número de números quadrados perfeitos cuja soma seja n. 
Um quadrado perfeito é um inteiro que é o quadrado de um inteiro; em outras palavras, 
é o produto de algum inteiro consigo mesmo. Por exemplo, 1, 4, 9 e 16 são quadrados perfeitos,
enquanto 3 e 11 não são. 
 */
public class Desafio3 {
	

    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        
        
        int resposta, contador, contadorTotal;

        int[] d = new int[n + 1];
        
    
        for (int i = 1; i < d.length; i++) {
            if (i * i <= n) {
                d[i] = i * i;
            } else {
                i = d.length - 1;
            }
        }
        contadorTotal = 1000;
       
       
        for (int i = d.length - 1; i> 0 && i <= n; i--) {

            if (i >0 && d[i] > 0) {

                resposta = n;
                contador = 0;
                
              
                for (int r = i; r > 0; r--) {

                    while (resposta > 0) {
                        if (resposta >= d[r]) {
                            resposta = resposta - d[r];
                            contador++;
                        } else {
                            r--;
                        }
                         System.out.println( i +"° " + d[i]);
                    }
                }                

                if (contadorTotal > contador) {
                	contadorTotal = contador;
                }

            }            
            
        }

        System.out.println(contadorTotal);
        
    }
	
}
