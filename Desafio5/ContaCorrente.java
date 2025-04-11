package Nivel.Intermediario.AbstractClasses.Desafio5;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(double saldo, TipoConta tipo) {
        super(saldo,TipoConta.CORRENTE);
    }

    public ContaCorrente() {
    }

    @Override
    public void depositar(double valor) {
        //Adicionamos o valor introduzido pelo usuario ao saldo em conta
        setSaldo(getSaldo() + valor);
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
