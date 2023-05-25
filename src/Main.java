import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

public class Main {
    public static void main(String[] args) {



        Cachorro cachorro1 = new Cachorro("Puppy", "Marrom", 25, 5.5, 5);
        Gato gato1 = new Gato("Felix", "Preto", 6, 6.6, 3);
        Passaro passaro1= new Passaro("Frajola", "Azul", 5.8);

        Petshop petshop = new Petshop();

        petshop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());

        petshop.darBanho(gato1);
        System.out.println(gato1.getEstadoDeEspirito());

        petshop.tosar(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());

    }
}