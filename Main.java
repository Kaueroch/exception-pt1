import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Cadastro();
    }
    public static void Cadastro(){
       Scanner scan = new Scanner(System.in);
        System.out.println("Cadastro!");
       System.out.println("Digite seu nome");
       String nome= scan.nextLine();
       System.out.println("Digite sua senha");
       int Senha = scan.nextInt();

       if (nome != "" &&  Senha != 0000){
           System.out.println("Cadastro realizado!! Seja Bem-vindo " + nome );
       }else {
           System.out.println("Acho que esqueceu de alguma informação, favor corrigir");
       }
       try {
           System.out.println("Digite sua senha");
           nome = scan.nextLine();

       }
    }
}