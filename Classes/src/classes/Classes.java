package classes;
//classe principal

public class Classes {

    public static void main(String[] args) {
        ClasseCaneta caneta1 = new ClasseCaneta();//caneta1 é o obj e ClasseCaneta e o nome da classe normal que criei dentro da classe principal
        caneta1.cor = "Azul";
        caneta1.carga = 100;
        caneta1.tampada = true;//Esta tampada ent n da para rabiscar e esta antes do status
        caneta1.status();//chamando o metodo caneta1 da classe normal
        caneta1.rabiscar();//chamando o metodo rabiscar da classe normal
    }

}
