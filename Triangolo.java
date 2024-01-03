public class Triangolo extends FormaGeometrica{
    private int base;
    private int altezza;
    private int lato1;
    private int lato2;
    private int lato3;

    //costruttore:
    public Triangolo(int base, int altezza,int lato1, int lato2, int lato3){
        super("Triangolo");
        this.base = base;
        this.altezza = altezza;
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }

    //metodi:
    @Override
    public double calcolaArea(){
        return (base * altezza)/2;
    }

    @Override
    public double calcoloPerimetro(){
        return lato1+lato2+lato3;
    }
}
