//Crie uma classe Retangulo com os atributos largura e altura.
//Implemente um método construtor que inicialize esses atributos.
//Em seguida, crie métodos acessores para os atributos largura e altura, e um método para calcular a área do retângulo.
package classeretangulo;

public class Retangulo {

    public double largura, altura;

    public Retangulo(double largura, double altura) {
        this.altura = altura;
        this.largura = largura;
    }

    public Retangulo() {
    }

    public double getAltura() {
        return this.altura;
    }

    public double getLargura() {
        return this.largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    public double calcular(){
   return largura * altura;
      
    }
    
   public void exibir(){
       System.out.println("Largura: " + largura );
       System.out.println("Altura: " + altura );
       
   } 

}
