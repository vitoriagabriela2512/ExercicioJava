//Crie uma classe Livro com os seguintes atributos: titulo, autor, anoPublicacao e genero.
//Implemente métodos construtores para inicializar os atributos. Em seguida, crie métodos acessores 
//para os atributos titulo, autor e anoPublicacao, e um método para verificar se o livro pertence a um determinado gênero.
package classelivro;


public class Livro {
    public String titulo;
    public String autor;
    public String genero;
    public int ano;
    

    public Livro(String titulo, String autor, String genero, int ano){
    this.ano = ano;
    this.autor = autor;
    this.genero = genero;
    this.titulo = titulo;
    }
    public Livro(){
    
    }
    
    public String getAutor(){
    return this.autor;
    }
    public String getGenero(){
    return this.genero;
    }
    public String getTitulo(){
    return this.titulo;
    }
    public int getAno(){
    return this.ano;
    }
    
    public void setAutor(String autor){
    this.autor = autor;
    }
    
    public void setGenero(String genero){
    this.genero = genero;
    }
    
    public void setTitulo(String titulo){
    this.titulo = titulo;
    }
    
    public void set(int ano){
    this.ano = ano;
    }
    
   public boolean Genero(String GeneroConsultado){
     if (this.genero.equals(GeneroConsultado)) {
            return true;
        } else {
            return false;
        }
   }
    
}
