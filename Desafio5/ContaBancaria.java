package Nivel.Intermediario.AbstractClasses.Desafio5;

public abstract class ContaBancaria  implements  InterfaceConta{
    private double saldo;

    private TipoConta tipo;


    public ContaBancaria(double saldo, TipoConta tipo) {
        this.saldo = 0.0;
        this.tipo = tipo;
    }

    public ContaBancaria() {
    }

    public TipoConta getTipo() {
        return tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void consultarSaldo() {
        if (getSaldo() > 0){
            System.out.println("Seu saldo é de R$ " + getSaldo());
        } else {
            System.out.println("Seu saldo é R$ 0. Recarregue quando possivel");
        }
    }

    @Override
    public abstract boolean sacar(double valor);

    @Override
    public abstract void depositar(double valor);

    public abstract boolean transferir(double valor, ContaBancaria destino);


}
