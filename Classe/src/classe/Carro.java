//Crie uma classe Carro com os atributos marca, modelo (privados) e ano (público). Implemente 
//métodos getters e setters para os atributos privados e garanta que o ano
//do carro não possa ser menor que 1886 (ano do primeiro automóvel).
package classe;

public class Carro {

    String marca;
    String modelo;
    public int ano;

    public Carro(String marca) {
        this.marca = marca;
    }

    public Carro() {

    }

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
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

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
       this.ano = ano;
    }
    
    public boolean Carro(){
   if(ano < 1886) {
    System.out.println("Este ano é invalido");
}else{
    System.out.println("Este ano é valido");
}
        return false;
    }
public void Exibir(){
    System.out.println("Ano:" + ano );
    System.out.println("Modelo: " + modelo );
    System.out.println("Marca: " + marca);
}
}
