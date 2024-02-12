public class ContaPoupanca extends Conta {

    public ContaPoupanca() {
        super();
    }

    @Override
    public void verConta() {
        System.out.println("===== Dados da Conta Poupanca =====");
        super.verConta();
    }

    @Override
    public void sacar(double valor) {
        System.out.println("===== Saque em Conta Poupanca =====");
        super.verConta();
    }
    
}
