public class Personaje {
    // Inserte acá los atributos

    private String nombre;
    private char sexo;
    private double posicionX;
    private double posicionY;
    private double damage;
    private double vida;

    // Inserte acá el método constructor

    public Personaje(String nombre, char sexo, double posicionX, double posicionY, double damage) {

        this.setNombre(nombre);
        this.setSexo(sexo);
        this.setPosicionX(posicionX);
        this.setPosicionY(posicionY);
        this.setDamage(damage);
        this.setVida(100);

    }

    // Inserte acá los métodos (no getters y setters)

    public void golpear(Personaje p) {

    }

    // Inserte acpa los setters y getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }
}
