public class Main {
    public static void main(String[] args) {

        // Criando a conta corrente
        Account ca = new CheckingAccount();
        ca.setAgency(1234);
        ca.setNumber(98765);
        ca.setHolder("Francisco Almeida");

        // Criando a conta poupança
        Account sa = new SavingsAccount();
        sa.setAgency(3344);
        sa.setNumber(88995);
        sa.setHolder("Camila Pereira");

        // Realizando operações
        ca.deposit(1000); // Depósito de R$1000 na conta corrente
        ca.withdraw(200); // Saque de R$200 da conta corrente
        ca.transfer(500, sa); // Transferência de R$500 da conta corrente para a conta poupança

        // Imprimindo saldos finais
        System.out.println("Saldo Conta Corrente " + ca.getHolder() + " R$: " + ca.getBalance());
        System.out.println("Saldo Conta Poupança " + sa.getHolder() + " R$: " + sa.getBalance());
    }
}
