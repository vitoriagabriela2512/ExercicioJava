//Crie uma classe Porta com um atributo private boolean aberta. Adicione métodos public abrir()
//e fechar() para modificar o estado da porta, garantindo que nenhum código externo possa alterar diretamente esse estado.
package classeporta;


public class Porta {
    private boolean aberta;
    
    public Porta(boolean aberta){
    this.aberta = aberta;
    }
    public Porta(){
    
    }
    
    public boolean getPorta(){
    return this.aberta;
    }
    public void setPorta(boolean aberta){
    this.aberta = aberta;
    }
    
      public void abrir() {
        if (!aberta) {  
            aberta = true;
            System.out.println("A porta foi aberta.");
        } else {
            System.out.println("A porta já está aberta.");
        }
    }
       public void fechar() {
        if (this.aberta) { 
            aberta = false;
            System.out.println("A porta foi fechada.");
        } else {
            System.out.println("A porta já está fechada.");
        }
       
    }

}
