public class Main {
    public static void main(String[] args) {
        Jugador j = new Jugador("Explorador", 'm', 0, 5, 100);
        Enemigo e = new Enemigo("Bitter", 'f', 0, 0, 80);

        j.golpear(e);
        j.golpear(e);
        j.moverDerecha(10);
        j.moverAbajo(5);

        e.golpear(j);
        e.golpear(j);
        j.recogerBotiquin();

        j.usarBotiquin();
        j.usarBotiquin();
        j.golpear(e);
        j.golpear(e);
        j.golpear(e);

        e.golpear(j);
        e.golpear(j);

        j.golpear(e);
        j.golpear(e);

        j.golpear(e);
        j.golpear(e);
        j.golpear(e);

        // System.out.println(mario.getVida());

        // mario.golpear(yoshi);

        // System.out.println(yoshi.getVida());
        // System.out.println(mario.getVida());
    }
}