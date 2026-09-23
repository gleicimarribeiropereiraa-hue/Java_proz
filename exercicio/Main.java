
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

     Scanner entrada =  new Scanner(System.in);

     System.out.print("Informe o Aluno:");

     String nome = entrada.nextLine();
     System.out.println("Aluno:" + nome);

     System.out.print("Informe a nota:");

     double nota = entrada.nextDouble();
     System.out.println("Nota :" + nota);

     System.out.print("Informe a nota 2:");
     double nota2 = entrada.nextDouble();
     System.out.println("Nota 2:" + nota2);

     System.out.print("Informe a nota 3:");

     double nota3 = entrada.nextDouble();
     System.out.println("Nota 3:" + nota3);

     double media = (nota + nota2 + nota3) / 3;
     System.out.println("Media:" + media);
     if(media >= 7){
         System.out.println("Aluno Aprovado");
      }else{
         System.out.println("Aluno Reprovado");
      }
    }
}
