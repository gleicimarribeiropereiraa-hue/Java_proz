package Compra;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner valor_compra = new Scanner(System.in);
        System.out.println("Informe o Valor da compra:");
      double valor = valor_compra.nextDouble();
      

      System.out.println("Informe o valor de Desconto:");

      if(valor>= 500){
        double valor_desconto = valor - (valor * 0.20);
        System.out.println("Desconto:" + valor_desconto);
        
      }else if(valor>= 200){
         double valor_desconto = valor - (valor - 0.10);
         System.out.println("Desconto:" + valor_desconto);
      }else{
        System.out.println("Não tem desconto");
      }

    }  
}
