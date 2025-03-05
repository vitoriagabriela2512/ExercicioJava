package vlcm;
//Crie uma classe Veiculo com um atributo protected chamado velocidadeMaxima.
//Depois, crie uma classe Carro que herde de Veiculo e adicione um método para exibir a velocidade máxima.

public class Veiculo {
  protected String velocidadeMaxima;

    public Veiculo(String velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Veiculo() {

    }

    public String getVelocidade(String velocidadeMaxima) {
        return this.velocidadeMaxima;
    }

    public void setVelocidade(String velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
       
    }
   
  
}
