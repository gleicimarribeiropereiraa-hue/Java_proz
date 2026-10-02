package dowhiledo;

public class Main {
    public static void main(String[] args){
        funcaoWhile();
        funcaoDowhile();

    }
    
     public static void funcaoWhile(){
            int numero =10;

            while(numero < 5){
                System.out.println("Olá eu sou while");
            }
            
        }
     public static void funcaoDowhile(){
            int numero =10;
               do { 
                   System.out.println("Olá eu sou Do while");
               } while (numero < 5); 
            }
    }


