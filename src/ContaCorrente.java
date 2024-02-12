public class ContaCorrente extends Conta {

    public ContaCorrente() {
        super();
    }

    @Override
    public void verConta() {
        System.out.println("===== Dados da Conta Corrente =====");
        super.verConta();
    }

    @Override
    public void sacar(double valor) {
        System.out.println("===== Saque em Conta Corrente =====");
        super.verConta();
    }
    
}
