import java.util.Scanner;

public class Main {

    public static void main(String[] args){ 
        String senha_correta = "1234";
        String senha;
    Scanner entrada =  new Scanner(System.in);
        System.out.println("Informe senha:");
        senha =  entrada.nextLine();
    while(!senha.equals(senha_correta)){
        System.out.print("Senha digitada está incorreta,tente novamente");
        System.out.print("Informe a senha");
        senha =  entrada.nextLine();
    }
    System.out.println("Senha correta,Parabéns por acertar");

    }
entrada.close();
}
