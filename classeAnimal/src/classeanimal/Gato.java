
package classeanimal;


public class Gato extends Animal {
       public Gato (){
    this.especie = "felina";
    }
       public String getEspecie(){
       return this.especie;
       }
       public void setEspecie(String especie){
       this.especie = especie;
       }

    public void miar (){
    emitirSom();
        System.out.println("O gato está miando!");
    }
    
    public void exibir(){
        System.out.println("Especie: " + especie);
    }
}
