public class Enemigo extends Personaje {
  // Inserte acá los atributos

  private int evolucionesAplicadas;
  private int resistencia;
  // Inserte acá el método constructor

  public Enemigo(String nombre, char sexo, double posicionX, double posicionY, double damage) {
    super(nombre, sexo, posicionX, posicionY, damage);

    evolucionesAplicadas = 0;
    resistencia = 1;
  }

  // Inserte acá los métodos (NO LOS GETTER Y SETTERS)

  public void evolucionar() {
    if (getVida() <= 30 && evolucionesAplicadas == 0) {
      setDamage(getDamage() + 20);
      evolucionesAplicadas += 1;
    } else if (getVida() <= 10 && evolucionesAplicadas == 1) {
      setResistencia(getResistencia() + 1);
      evolucionesAplicadas += 1;
    }
  }

  @Override
  public void recibirImpacto(double d) {
    setVida(getVida() - (d / getResistencia()));
  }

  // Inserte acá los SETTERS Y GETTERS

  public int getResistencia() {
    return resistencia;
  }

  public void setResistencia(int resistencia) {
    this.resistencia = resistencia;
  }

  public int getEvolucionesAplicadas() {
    return evolucionesAplicadas;
  }

  public void setEvolucionesAplicadas(int evolucionesAplicadas) {
    this.evolucionesAplicadas = evolucionesAplicadas;
  }
}
