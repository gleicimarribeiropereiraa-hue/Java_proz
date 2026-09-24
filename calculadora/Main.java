import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada =  new Scanner(System.in);

        System.out.print("Bem vindo a calculadora!\n\n");

         System.out.print("Digite o primeiro número:\n\n");
         double numero = entrada.nextDouble();

         System.out.print("Digite o primeiro número:");
         double numero2 = entrada.nextDouble();

          System.out.print("Selecione a operação (+, -, /, *):");
          String operacao = entrada.next();

          if(operacao.equals("+")){
            System.out.println(numero + numero2);

          }
         
          if(operacao.equals("-")){
            System.out.println(numero - numero2);

          }
          if(operacao.equals("*")){
            System.out.println(numero * numero2);

          }
          if(operacao.equals("/")){
            System.out.println(numero / numero2);

          }
         

        entrada.close();





    }
}