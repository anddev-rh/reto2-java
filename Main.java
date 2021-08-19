public class Main {
    public static void main(String[] args) {
        Jugador mario = new Jugador("mario", 'm', 0, 10, 80);
        Personaje yoshi = new Personaje("yoshis", 'm', 2, 5, 80);

        mario.recogerBotiquin();
        mario.recogerBotiquin();
        mario.usarBotiquin();

        System.out.println(mario.getNumeroBotiquines());
        System.out.println(mario.getVida());

        // mario.golpear(yoshi);

        // System.out.println(yoshi.getVida());
        // System.out.println(mario.getVida());
    }
}