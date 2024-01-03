public abstract class FormaGeometrica implements Comparable<FormaGeometrica>{
    protected String nome;

    public FormaGeometrica(String nome){
        this.nome = nome;
    }


    //metodi:
    public abstract double calcolaArea();
    public abstract double calcoloPerimetro();

    //@Override
    public int compareTo(FormaGeometrica forma) {
       double area = this.calcolaArea();
       double formaArea = forma.calcolaArea();

       if(area < formaArea){
           return -1;
       }else if (area > formaArea){
           return 1;
       }else {
           return 0;
       }
    }

}

