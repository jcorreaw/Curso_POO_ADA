package Animais;

public class Cachorro {
    public String nome;
    public String cor;
   public int altura;
   public double peso;
   public int tamanhoDoRabo;
   public String estadoDeEspirito;

   public void comer(){}

   public void latir(){
       System.out.println("AU AU");
   }
   public String pegar(){
       return "Bolinha";
   }

   public String interagir(String acao){
       if (acao.equalsIgnoreCase("Carinho")){
           this.estadoDeEspirito = "Feliz";
       }else if (acao.equalsIgnoreCase("Vai Dormir")){
           this.estadoDeEspirito = "Bravo";
       }
       else {
           this.estadoDeEspirito = "Neutro";
       }
       return estadoDeEspirito;
   }

}
