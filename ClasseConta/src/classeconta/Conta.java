//Crie uma classe ContaBancaria com os atributos numeroConta, nomeTitular, saldo. 
//Implemente um método construtor que inicialize os atributos numeroConta e nomeTitular, e defina o saldo inicial como zero.
//Em seguida, crie métodos acessores para os atributos
//numeroConta, nomeTitular e saldo, além de métodos para depositar e sacar valores da conta.
package classeconta;


public class Conta {
    public int numeroConta;
    public String titular;
    public double saldo;
    
    public Conta(int numeroConta, String titular,double saldo){
    this.numeroConta = numeroConta;
    this.saldo = 0.0;
    this.titular = titular;
    }
    public Conta(){
    
    }
    public String getTitular(){
    return this.titular;
    }
    public int getNumero(){
    return this.numeroConta;
    }
    public double getSaldo(){
    return this.saldo;
    }
    
    public void setTitular(String titular){
    this.titular = titular;
    }
    public void setNumero(int numero){
    this.numeroConta = numero;
    }
    public void setSaldo(double saldo){
    this.saldo = saldo;
    }
       public void depositar (double valorDeposito){
   this.saldo +=  valorDeposito;
   } 
     public void sacar(double valorSaque){
     this.saldo -= valorSaque;
     }
     public void exibir(){
         System.out.println("Saldo: "+ saldo);
         System.out.println("Titular da conta: "+ titular);
         System.out.println("Número da conta: " + numeroConta);
     }
}
