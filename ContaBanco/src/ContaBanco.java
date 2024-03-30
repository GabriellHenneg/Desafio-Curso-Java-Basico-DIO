import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Informe o numero da conta: ");
        numeroConta = leitor.nextInt();

        System.out.println("Informe o numero da agencia bancária: ");
        agencia = leitor.next();

        System.out.println("Informe o nome do cliente: ");
        nomeCliente = leitor.next();

        System.out.println("Informe o saldo disponivel para o cliente: ");
        saldo = leitor.nextDouble();

        System.out.println("Olá, " +nomeCliente +"! Obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque");

    }
}