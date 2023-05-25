import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {



        Cachorro cachorro1 = new Cachorro("Puppy", "Marrom", 25, 5.5, 5);
        System.out.println(Cachorro.getNumeroDeCachorros());
        Cachorro cachorro2 = new Cachorro("Luly", "Branco", 30, 10.4, 5);

        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());

        System.out.println("------------------");
        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());

    }
}