public abstract class Conta implements IConta {

    private static final int agencia_padrao = 1;
    private static int sequencial = 0;
    public Conta(){
        this.agencia = agencia_padrao;
        this.numero = sequencial++;
    }
    protected int agencia;
    protected int numero = 0;
    protected double saldo = 0;

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns(){
        System.out.println(String.format("Agencia: %d", this.getAgencia()));
        System.out.println(String.format("Numero: %d", this.getNumero()));
        System.out.println(String.format("Saldo: %.2f", this.getSaldo()));
    }
}
