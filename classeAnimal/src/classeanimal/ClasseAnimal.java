package classeanimal;

public class ClasseAnimal {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Cachorro c1 = new Cachorro();
        Gato g1 = new Gato();
        c1.exibir();
        g1.exibir();
        c1.emitirSom();
        c1.latir();
        g1.miar();

    }
}
