import java.util.Scanner;

public class Menu {


    public int numero;
    public String agencia = new String();
    public String nomeCliente = new String();
    public double saldo;
    public Scanner scan = new Scanner(System.in);

    public void ativar(){
        System.out.println("Qual o seu nome?");
        nomeCliente = scan.nextLine();
        System.out.println("Qual a sua Agencia?");
        agencia = scan.nextLine();
        System.out.println("Qual o numero da sua conta?");
        numero = scan.nextInt();
        scan.nextLine(); // consome o \n pendente
        System.out.println("\n");
        System.out.println("Qual o seu saldo?");
        saldo = Double.parseDouble(scan.nextLine());
        System.out.println("Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agencia é ").concat(agencia) + ", conta".concat(String.valueOf(numero)).concat(" e seu saldo ").concat(String.valueOf(saldo)).concat(" já está disponível para saque"));


    }
}
