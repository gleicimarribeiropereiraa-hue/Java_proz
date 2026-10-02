import java.util.Scanner;

public class Main{


        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();
        System.out.println("INforme o número inicial"+ numero);
        int numero_final = entrada.nextInt();
        System.out.println("INforme o número inicial"+ numero_final);

        int contador = numero;
        while(contador <=numero_final){
            System.out.println(contador);
        }
        
      entrada.close();
    }