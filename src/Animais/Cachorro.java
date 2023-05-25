package Animais;

public class Cachorro {
    public String nome;
    public String cor;
    public int altura;
    public double peso;
    public int tamanhoDoRabo;
    public String estadoDeEspirito;

    public void comer() {
    }

    public void latir() {
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
        return estadoDeEspirito;
    }
}
