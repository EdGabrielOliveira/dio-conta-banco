 import java.util.Scanner;
 public class ContaBanco {

        public static void main(String[] args) {
            // Comando para inserir o Scanner
            Scanner scanner = new Scanner(System.in);
            
            // Saldo da conta (FIXO)
            double saldo = 237.48;

            // Painel que exibe mensagem de boas-vindas ao rodar o código
            System.out.println("-------------------------------------------------------");   
            System.out.println("BEM-VINDOS AO BANCO DIO!");
            System.out.println("POR FAVOR, PREENCHA OS DADOS PARA REALIZAR A CONSULTA.");
            System.out.println("-------------------------------------------------------");   

            // Nome do Titular
            String titular;
            System.out.println("Nome do Titular: ");
                titular = scanner.next();

            // Agência e conta do  Titular
            String agencia;
            String conta;
            System.out.println("Agência: ");
                agencia = scanner.next();
            System.out.println("Conta Corrente: ");
                conta = scanner.next();
            
            // Painel que exibe os dados preenchidos acima
            System.out.println("");
            System.out.println("Olá " + titular +" obrigado por criar uma conta em nosso banco, sua agência "+ agencia +", conta "+ conta + " e seu saldo " + saldo +" já está disponível para saque");
            System.out.println("");
            System.out.println("------------------------------");  
            System.out.println("Acesso realizado com SUCESSO!");
            System.out.println("------------------------------"); 
            System.out.println("Titular: " + titular);
            System.out.println("Agência: " + agencia);
            System.out.println("Conta: " + conta);
            System.out.println("------------------------------");
            System.out.println("Saldo disponível: " + saldo); 
            System.out.println("------------------------------");
            System.out.println("");
            
            // Comando para finalizar o Scanner
            scanner.close();
        }
    }