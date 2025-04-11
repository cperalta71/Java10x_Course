package Nivel.Intermediario.AbstractClasses.Desafio5;

public class ContaPoupanca extends ContaBancaria{


    public ContaPoupanca(double saldo, TipoConta tipo) {
        super(saldo, TipoConta.POUPANCA);
    }

    public ContaPoupanca() {
    }

    @Override
    public void consultarSaldo() {
        super.consultarSaldo();
    }

    @Override
    public double getSaldo() {
        return super.getSaldo();
    }

    @Override
    public void setSaldo(double saldo) {
        super.setSaldo(saldo);
    }

    @Override
    public void depositar(double valor) {
        //Cobrar taxa de 1% do valor depositado e depositar valor
        setSaldo(getSaldo() + (valor - (valor * 0.01)));
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > getSaldo()){
            System.out.println("Saldo insuficiente para realizar transação.");
            return false;
        }
        setSaldo(getSaldo() - valor);
        return true;
    }

    @Override
    public boolean transferir(double valor, ContaBancaria destino) {
        if (this == destino){
            System.out.println("Não é possivel transferir à propria conta.");
            return false;
        }
        if (valor <= 0){
            System.out.println("Digite um valor válido (positivo)");
            return false;
        }else if (this.sacar(valor)){
            destino.depositar(valor);
            System.out.println("Valor transferido com sucesso.");
            return true;
        }
        return false;
    }
}
