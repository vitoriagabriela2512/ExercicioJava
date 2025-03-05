
package classeanimal;


public class Cachorro extends Animal {
     public Cachorro (){
    this.especie = "canino";
    }
 public String getEspecie1(){
       return this.especie;
       }
       public void setEspecie1(String especie){
       this.especie = especie;
       }
    public void latir (){
    emitirSom();
        System.out.println("O cachorro està latindo!");
    }
    
    public void exibir(){
        System.out.println("Especie: " + especie);
    }
}
