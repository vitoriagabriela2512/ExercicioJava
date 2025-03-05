
package classefuncionario;
//Crie uma classe Funcionario com atributos privados nome e salario.
//Adicione métodos public para definir e obter esses valores. No programa principal, crie um objeto e exiba os dados.

public class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario(){
        
    }
    public Funcionario(String nome){
        this.nome = nome;
    }
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    
    public String getNome(){
    return this.nome;
    }
    public Double getSalario(){
    return this.salario;
    }
    
    public void setNome(String nome){
    this.nome = nome;
    }
    public void setSalario(double salario){
    this.salario = salario;
    }
    
    public void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
    }
}
