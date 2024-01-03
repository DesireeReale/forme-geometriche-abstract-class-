public class Rettangolo extends FormaGeometrica{
    private int base;
    private int altezza;

    //costruttore:
    public Rettangolo(int base, int altezza){
        super("Rettangolo");
        this.base = base;
        this.altezza = altezza;
    }

    //metodi:
    @Override
    public double calcolaArea(){
        return (base * altezza);
    }

    @Override
    public double calcoloPerimetro() {
        return 2*(base+altezza);
    }
}
