public class Quadrato extends FormaGeometrica{
    private int lato;

    //costruttore:
    public Quadrato(int lato){
        super("Quadrato");
        this.lato = lato;
    }

    //metodi:
    @Override
    public double calcolaArea(){
        return (lato*lato);
    }

    @Override
    public double calcoloPerimetro() {
        return 4*lato;
    }
}
