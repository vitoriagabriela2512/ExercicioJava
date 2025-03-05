
package classeproduto;

//ex 1 e 2
public class ClasseProduto {

    
    public static void main(String[] args) {
        Produto produto1 = new Produto(3.56, "bolacha");
        Produto produto2 = new Produto("cerveja");
        Produto produto3 = new Produto();
        
        produto1.exibir();
        produto1.setNome("bolacha maria");
        produto1.setPreço(-20);
        produto1.exibir();
        
        System.out.println("Produto: " + produto1.getNome());
        
        //System.out.println("Produto: " );
        //TDS ex usar o get e o set e construtor
    }
    
}
