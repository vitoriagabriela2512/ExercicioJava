package classeproduto;

public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome) {
        this.nome = nome;
    }

    public Produto() {

    }

    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public void exibir() {
        System.out.println("nome: " + nome);
        System.out.println("preço: " + preco);
    }

    public double getPreço() {
        return this.preco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setPreço(double preco) {
        if (preco < 0) {
            System.out.println("Erro! este número é invalido");
        } else {
              this.preco = preco;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    //  public void setValores(double obterValores){
    //this.preco = obterValores;
    //}
    //public void getValores(double obterValores){
    //this.preco = obterValores;
    //}
    //public void Status (){
    //  System.out.println("Nome: " + nome);
    // System.out.println("Preço: " + preco);
    //}
}
