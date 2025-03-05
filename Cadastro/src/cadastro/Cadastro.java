
package cadastro;

public class Cadastro {

    
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Eder", 16, 1.57, 65);
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa = new Pessoa("Aloprado");
        //pessoa1.exibir();
        //pessoa2.exibir();
        //pessoa.exibir();
        //double teste = pessoa1.getAltura();
        System.out.println("Altura: " + pessoa1.getAltura());
        System.out.println("Nome: " + pessoa1.getNome());
       // pessoa1.setAltura(190.5);
        //System.out.println("Altura:" + pessoa1.getAltura());
        pessoa1.setNome("aloprado");
        System.out.println("Nome: " + pessoa1.getNome());
    }
}
