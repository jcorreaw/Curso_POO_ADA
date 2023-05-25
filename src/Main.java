import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.setNome("Puppy");
        cachorro1.setCor("Marrom");
        cachorro1.setAltura(25);
        cachorro1.setPeso(5.5);
        cachorro1.setTamanhoDoRabo(5);

        cachorro1.latir();
        System.out.println("O cachorro pegou uma " + cachorro1.pegar());
        System.out.println("O cachoro está " + cachorro1.interagir("Carinho"));
        System.out.println("O cachoro está " + cachorro1.interagir("Nada"));
        System.out.println("O cachoro está " + cachorro1.interagir("Vai Dormir"));
        System.out.println("O cachoro está " + cachorro1.interagir("Pisar na patinha"));
        System.out.println();

        Cachorro cachorro2 = new Cachorro("Luly", "Branco", 30, 10.4, 5);
        cachorro2.latir();
        System.out.println(cachorro2.getNome());
        System.out.println(cachorro2.getCor());
        System.out.println(cachorro2.getAltura());
        System.out.println(cachorro2.getPeso());
        System.out.println(cachorro2.getTamanhoDoRabo());


    }
}