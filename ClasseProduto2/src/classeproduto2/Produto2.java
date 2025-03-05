//Crie uma classe Produto com os seguintes atributos: nome, preco, quantidade.
//Implemente um método construtor que inicialize os atributos nome e preco, e defina a quantidade como zero.
//Em seguida, crie métodos acessores
//para os atributos nome, preco e quantidade, e métodos para aumentar e diminuir a quantidade do produto.
package classeproduto2;

public class Produto2 {

    public String nome;
    public int quantidade;
    public double preco;

    public Produto2(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto2() {
    }


    public String getNome() {
        return this.nome;
    }

    public int getQuanti() {
        return this.quantidade;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setNome(String nome){
    this.nome = nome;
    }
    public void setPreco(double preco){
    this.preco = preco;
    }
    public void setQuanti(int quantidade){
    this.quantidade = quantidade;
    }
    
    
       public void aumentar (double valoraumentar){
   this.quantidade +=  valoraumentar;
   } 
     public void diminuir(double valordiminuir){
     this.quantidade-= valordiminuir;
     }
    
        
        public void exibir(){
            System.out.println( "Nome:" + nome );
            System.out.println("Preço: " + preco );
            System.out.println("Quantidade: " + quantidade );
        }
    
    
}
