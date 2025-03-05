package cadastro;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public Pessoa() {

    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);

    }

    //levar um valor ate altura(pegar valor)
    public void setAltura(double altura) {
        this.altura = altura;
    }

//metodo sem parametro com retorno,  para retornar o VALOR de um atributo de uma classe (ex peso,altura etc)
    //buscar valor
    public double getAltura() {
        return altura;
    }
    
    public String getNome(){
    return nome;
    }

    public void setNome(String nome){
    this.nome = nome;
    }
    
}
