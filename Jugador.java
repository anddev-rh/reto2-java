public class Jugador extends Personaje {

  // Inserte acá los atributos

  private int numeroBotiquines;

  // Inserte acá el método constructor

  public Jugador(String nombre, char sexo, double posicionX, double posicionY, double damage) {
    super(nombre, sexo, damage, damage, damage);
    this.setNumeroBotiquines(0);
  }

  // Inserte acá los métodos (NO LOS GETTER Y SETTERS)

  public void usarBotiquin() {
    if (numeroBotiquines > 0) {
      numeroBotiquines -= 1;

      if (getVida() < 95) {
        setVida(getVida() + 5);
      }

    }
  }

  public void recogerBotiquin() {
    numeroBotiquines += 1;
  }

  public void moverDerecha(double d) {
    setPosicionX(getPosicionX() + d);
  }

  public void moverIzquierda(double d) {
    setPosicionX(getPosicionX() - d);
  }

  public void moverArriba(double d) {
    setPosicionY(getPosicionY() + d);
  }

  public void moverAbajo(double d) {
    setPosicionY(getPosicionY() - d);
  }

  @Override
  public void golpear(Enemigo p) {
    p.evolucionar();
  }

  // Inserte acá los SETTERS Y GETTERS

  public int getNumeroBotiquines() {
    return numeroBotiquines;
  }

  public void setNumeroBotiquines(int numeroBotiquines) {
    this.numeroBotiquines = numeroBotiquines;
  }

}
