import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe Idade:");
        int idade = entrada.nextInt();
        if(idade>=18 && idade < 65){
            System.out.println("Voto obrigatório");
        }else if( idade <=16 || idade  >= 65){
            System.out.println("Voto opcional");
        }else{
            System.out.println("Não pode votar");
        }
        entrada.close();
    }
}
