package Animais;

public class Cachorro extends Animal{
    private static int numeroDeCachorros;
    private int tamanhoDoRabo;

    public Cachorro() {

    }

    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        numeroDeCachorros++;
    }

    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }


    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

   @Override
    public void soar() {
        System.out.println("AU AU");
    }

    public String pegar() {
        return "Bolinha";
    }

    public String interagir(String acao) {

        switch (acao) {
            case "Carinho" -> this.estadoDeEspirito = "Feliz";
            case "Vai Dormir" -> this.estadoDeEspirito = "Bravo";
            case "Pisar na patinha" -> this.estadoDeEspirito = "Triste";
            default -> this.estadoDeEspirito = "Neutro";
        }
        return this.estadoDeEspirito;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
