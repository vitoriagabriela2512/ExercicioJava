//Classe Carro:
//Crie uma classe Carro com os seguintes atributos:
//marca, modelo, ano e preco. Implemente um método construtor que inicialize todos os atributos. Em seguida,
//crie métodos acessores para os atributos marca, modelo e ano, e um método para exibir todas as informações do carro.
package classecarro;

public class Carro {

    public String marca, modelo;
    public int ano;
    public double preco;

    public Carro(String marca, String modelo, int ano, double preco) {
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    public Carro() {
    }

    public String getMarca() {

        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public double getPreco() {
        return this.preco;
    }
    public void setMarca (String marca){
    this.marca = marca;
    }
    public void setModelo (String modelo){
    this.modelo = modelo;
    }
    public void setAno (int ano){
    this.ano = ano;
    }
    public void setPreco (double preco){
    this.preco = preco;
    }
    
    public void exibir(){
        System.out.println("Ano do carro: " + ano);
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);
    }
}
