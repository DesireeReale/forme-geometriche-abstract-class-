public class Cerchio extends FormaGeometrica{
    private int raggio;

    //costruttore:
    public Cerchio(int raggio){
        super("Cerchio");
        this.raggio = raggio;
    }

    //metodi:
    @Override
    public double calcolaArea() {
        return Math.PI * Math.pow(raggio,2);
    }

    @Override
    public double calcoloPerimetro() {
        return 2*raggio * Math.PI;
    }
}
