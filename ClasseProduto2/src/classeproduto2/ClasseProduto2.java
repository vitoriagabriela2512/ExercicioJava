package classeproduto2;

public class ClasseProduto2 {

    public static void main(String[] args) {
        Produto2 p1 = new Produto2("bolacha", 200, 2.99);
        p1.exibir();
        p1.aumentar(40);
        p1.diminuir(30);
        p1.exibir();
    }

}
