
package classelivro;


public class ClasseLivro {

    public static void main(String[] args) {
     Livro l1 = new Livro("1984", "GEORGE ORWELL","Ficção Científica", 1949);  
     
         if (l1.Genero("Ficção Científica")) {
            System.out.println("O livro pertence ao gênero especificado.");
        } else {
            System.out.println("O livro não pertence ao gênero especificado.");
        }
    }
    
    
}
