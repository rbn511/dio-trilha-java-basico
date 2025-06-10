import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        var scanner = new Scanner(System.in); 
        System.out.println("Por favor, digite o número da Conta !");
        int numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite o número da Agência !");
        String numeroAgencia = scanner.next();
        System.out.println("Por favor, digite o nome do Cliente !");
        scanner.nextLine();
        var nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o saldo da Conta !");
        Double saldoConta = scanner.nextDouble();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo é R$ " + saldoConta + "."+ "já está disponível para saque."); 
    }  
}