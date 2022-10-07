
/*
Desafio
Dado um array inteiro nums, 
1- mova todos os inteiros pares no início do array seguido por todos os inteiros ímpares.
Retorne qualquer array que satisfaça essa condição.
 */
import java.util.*;
import java.util.Scanner;

public class Desafio4 {
    public static void main(String args[]) {
          
     Scanner input = new Scanner(System.in);
      int i, mover;
      
      
	  System.out.println("Digite o tamanho que deseja  do Array: ");
      int N = input.nextInt();
      
    	int [] nums = new int[N];

    	for (i = 0; i < N; i++)
    	{
			System.out.println("Digite o " + (i+1) +"°" + " número: ");
    		nums[i] = input.nextInt();
    	}     	
		
		for (i = 0; i < N; i++)
    	{
			if (nums[i] % 2 != 0){

				for (int j = (i+1); j < N; j++)
				{
					if (nums[j] % 2 == 0) {
						mover = nums[i];
						nums[i] = nums[j];
						nums[j] = mover;
						j = N;
					}					
				}
			}
    	}
		
		for (i = 0; i < N; i++)
    	{
			System.out.println(nums[i]);
    	}  		
  	}
}   
