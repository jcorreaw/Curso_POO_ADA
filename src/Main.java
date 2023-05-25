import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;

public class Main {
    public static void main(String[] args) {



        Cachorro cachorro1 = new Cachorro("Puppy", "Marrom", 25, 5.5, 5);
        Gato gato1 = new Gato("Felix", "Preto", 6, 6.6, 3);
        Passaro passaro1= new Passaro("Frajola", "Azul", 5.8);

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();

    }
}