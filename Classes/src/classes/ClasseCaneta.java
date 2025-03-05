package classes;
//classe "normal"
public class ClasseCaneta {

    //atributos
    String marca, cor;
    boolean tampada;
    double ponta;
    int carga;

    void tampar() {
//tampada = true;
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Erro! Não é possível rabiscar");
        } else {
            System.out.println("Estou rabiscando!");//ela esta tampada ent da para rabiscar mas como colocamos false ou seja n esta tampada da para rabiscar
        }
    }

    void status() {
        System.out.println("Marca: " + marca);

        System.out.println("Cor: " + cor);

        System.out.println("Está caneta esta tampada? " + tampada);

        System.out.println("Ponta:" + ponta);

        System.out.println("Carga:" + carga);
    }

}
