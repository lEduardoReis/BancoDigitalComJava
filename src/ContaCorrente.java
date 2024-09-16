public class ContaCorrente extends Conta {
    @Override
    public void imprimirestrato() {
        System.out.println("===Extrato Conta Corrente===");
        super.imprimirInfosComuns();
    }
}
