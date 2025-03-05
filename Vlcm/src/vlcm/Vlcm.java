
package vlcm;


public class Vlcm {

    public static void main(String[] args) {
     Veiculo vei1 = new Veiculo();
     Carro c1 = new Carro();
     c1.velocidadeMaxima = "100 km";
     c1.exibir();
     c1.setVelocidade("150 km");
     c1.exibir();
     

    }
    
}
