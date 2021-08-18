public class Main {
    public static void main(String[] args) {
        Personaje mario = new Personaje("mario", 'm', 0, 10, 80);
        Personaje yoshi = new Personaje("yoshis", 'm', 2, 5, 80);

        System.out.println(yoshi.getVida());

        mario.golpear(yoshi);

        System.out.println(yoshi.getVida());
        System.out.println(mario.getVida());
    }
}