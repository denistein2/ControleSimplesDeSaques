import java.util.Scanner;
import java.text.DecimalFormat;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.0");

        double limiteDiario = scanner.nextDouble();

        // Loop for para iterar sobre os saques
        for (int i = 1; ; i++) {

            double valorSaque = scanner.nextDouble();
           

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            } else {
              limiteDiario -=valorSaque;
              System.out.println("Saque realizado. Limite restante: " + decimalFormat.format(limiteDiario));
              
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}