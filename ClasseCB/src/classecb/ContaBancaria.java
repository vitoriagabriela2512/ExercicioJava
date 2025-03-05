
package classecb;


public class ContaBancaria {
      public String titular;
       private double saldo;
       
       
    public ContaBancaria(String titular) {
        this.titular = titular;
    }

    public ContaBancaria() {

    }

    public ContaBancaria(String titular, double saldo ) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void exibir() {
        System.out.println("titular: " + titular);
        System.out.println("saldo: " + saldo);
    }

    public String getTitular() {
        return this.titular;
    }

    public Double getSaldo() {
        return this.saldo;
   }
    public void setSaldo(double saldo) {       
        this.saldo = saldo;
    }
        
    public void setTitular(String titular) {       
        this.titular = titular;
        
  } 
     public void depositar (double valorDeposito){
   this.saldo +=  valorDeposito;
   } 
     public void sacar(double valorSaque){
     this.saldo -= valorSaque;
     }
     
}
