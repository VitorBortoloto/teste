import java.util.ArrayList;
import java.util.Scanner;

public abstract class Conta {

    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int numero;
    protected int agencia;
    protected String titular;
    protected double saldo = 0;
    protected static ArrayList<Conta> listaContas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        System.out.println("Nome do proprietario: ");
        this.titular = scanner.nextLine();
    }

    public String getTitular() {
        return titular;
    }

    public static int getAGENCIA_PADRAO() {
        return AGENCIA_PADRAO;
    }

    public static int getSEQUENCIAL() {
        return SEQUENCIAL;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        this.saldo = saldo - valor;
    }

    public void depositar(double valor) {
        this.saldo = saldo + valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.saldo = saldo - valor;
        contaDestino.depositar(valor);
    }

    public void verConta() {
        System.out.println(titular);
        System.out.println(String.format("Agencia: %d", agencia));
        System.out.println(String.format("Numero: %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }



}
