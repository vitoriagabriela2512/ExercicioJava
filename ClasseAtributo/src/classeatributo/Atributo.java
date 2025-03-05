
package classeatributo;
//Crie uma classe Pessoa com um atributo protected chamado idade. 
//Depois, crie uma classe Aluno que herde de Pessoa e crie um método que permita definir e exibir a idade do aluno.
public class Atributo {
    protected String idade;
    
        public Atributo(String idade) {
        this.idade = idade;
        }

    public Atributo() {

    }

    public String getIdade(String idade) {
        return this.idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
       
    }
   
  
}
