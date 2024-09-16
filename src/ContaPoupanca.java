public class ContaPoupanca  extends Conta{
    @Override
    public void imprimirestrato() {
        System.out.println("===Extrato Conta Poupança===");
        super.imprimirInfosComuns();
    }
}
