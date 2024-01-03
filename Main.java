public class Main {
    public static void main(String[] args){
        //creo le istanze per ciascuna forma geometrica
        Cerchio cerchio = new Cerchio(9);
        Triangolo triangolo = new Triangolo(3,4,5,4,3);
        Quadrato quadrato = new Quadrato(2);
        Rettangolo rettangolo = new Rettangolo(7,7);

        System.out.println("area Cerchio: "+cerchio.calcolaArea() + " || perimetro: " +cerchio.calcoloPerimetro());
        System.out.println("area triangolo: "+triangolo.calcolaArea() + " || perimetro: "+ triangolo.calcoloPerimetro());
        System.out.println("area quadrato: "+quadrato.calcolaArea() + " || perimetro: "+ quadrato.calcoloPerimetro());
        System.out.println("area rettangolo: "+rettangolo.calcolaArea() + " || perimetro: "+ rettangolo.calcoloPerimetro());

        int risultato = cerchio.compareTo(triangolo);
        if(risultato < 0){
            System.out.println("area cerchio < area triangolo");
        } else if (risultato > 0) {
            System.out.println("area cerchio > area triangolo");
        } else {
            System.out.println("l'area cerchio = area triangolo");
        }
    }
}
