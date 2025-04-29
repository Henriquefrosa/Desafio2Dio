import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
     Menu menu = new Menu();
     String resposta = new String();
     Scanner scan = new Scanner(System.in);
     resposta = "";
     while (resposta == ""){
         menu.ativar();
         System.out.println("Digite algo e de enter para fechar a aplicacao");
         resposta = scan.nextLine();
     }

    }
}
