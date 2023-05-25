package Animais;

public class Passaro extends Animal{
    private static int numeroDePassaros;

    public Passaro(String nome, String cor, double peso) {
        super(nome, cor, peso);
        numeroDePassaros++;
    }

    @Override
    public void soar(){
        System.out.println("PIAU PIAU");
    }

}
