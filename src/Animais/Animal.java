package Animais;

public class Animal {
    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoDeEspirito;

    public Animal(String nome, String cor, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
    }

    public Animal() {

    }

    public void comer(){

    }
    public void dormir(){

    }
    public void soar(){
        System.out.println("  ");
    }

}
