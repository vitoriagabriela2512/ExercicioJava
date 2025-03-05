package classeconta;

public class ClasseConta {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.numeroConta = 23400;
               c1.saldo = 380;
               c1.titular = "Vitótia Gabriela Fernandes da Luz";
               c1.exibir();
               c1.depositar(300);
               c1.sacar(600);
               c1.exibir();
    }

}
