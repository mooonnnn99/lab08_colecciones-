public class Guerrero extends Personaje{
    private int fuerza;
    private String armadura;

    public Guerrero(String nombre, int nivel, int puntosVida, int fuerza, String armadura) {
        super(nombre, nivel, puntosVida);
        this.fuerza = fuerza;
        this.armadura = armadura;
    }
    public int getFuerza() {
        return fuerza;
    }
    public String getArmadura() {
        return armadura;
    }
    @Override 
     public int calcularDanio(){
        return getNivel()*fuerza; //daño base según nivel
    }
    @Override
    public void atacar() throws RpgException {
        throw new RpgException("El guerrero no puede atacar con magia.");
    }
    @Override
    public String toString(){
        return super.toString() + " (Fuerza: " + fuerza + ", Armadura: " + armadura + ")";
    }
}
