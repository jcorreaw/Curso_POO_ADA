package Animais;

public class Gato extends Animal {
    private static int numeroDeGatos;
    private int tamanhoDoRabo;


    public Gato(String nome, String cor, int altura, double peso, int tamanhoDoRabo) {
        super(nome, cor, peso);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;

        numeroDeGatos++;
    }

    @Override
    public void soar(){
        System.out.println("MIAU MIAU");
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
