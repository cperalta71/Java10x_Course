package Nivel.Intermediario.AbstractClasses.Desafio5;

public interface InterfaceConta {

    //Metodo para consulta de saldo
    void consultarSaldo();

    boolean sacar(double valor);

    //metodo para depositar algum valor pelo usuario
    void depositar(double valor);
}
