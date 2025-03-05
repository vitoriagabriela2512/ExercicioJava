package classecb;
//crie uma classe ContaBancaria com os atributos titular (público) e saldo (privado). 
//Implemente métodos para depositar e sacar, garantindo 
//que um saque não ocorra se o saldo for insuficiente. O método getSaldo() deve permitir acessar o saldo.

public class ClasseCB {
    
    public static void main(String[] args) {
        ContaBancaria cb1 = new ContaBancaria("Vitória", 200.9);
      cb1.exibir();
      cb1.depositar(400);
      cb1.exibir();
      cb1.sacar(100);
      cb1.exibir();
    }
    
}
