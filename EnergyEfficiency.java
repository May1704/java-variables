import java.sql.SQLOutput;

public class EnergyEfficiency {
    public static void main(String[] args) {
        //inicializar variables (del tipo que veas conveniente) para las calificaciones
        // A, B, C, D, E, F y G que correspondan a eficiencia energética
        String A = "Bad efficiency";
        String B = "Very good efficiency";
        String C = "Very bad efficiency";
        String D = "Neutral efficiency";
        String E = "Low efficiency";
        String F = "Fair efficiency";
        String G = "Good efficiency";
        // e imprime en terminal concatenando cada string con cada variable creada.
        System.out.println("Rating A" + " " + A);
        System.out.println("Rating B" + " " + B);
        System.out.println("Rating C" + " " + C);
        System.out.println("Rating D" + " " + D);
        System.out.println("Rating E" + " " + E);
        System.out.println("Rating F" + " " + F);
        System.out.println("Rating G" + " " + G);
        //Reemplaza <very_good> concatenando el String con la variable creada. 
        System.out.println("Una calificación" + " " + B + " " + "es muy buena.");
        //Reemplaza <good> concatenando el String con la variable creada. 
        System.out.println("Una calificación" + " " + G + " " + "es buena.");
        //Reemplaza <fairly_good> concatenando el String con la variable creada. 
        System.out.println("Una calificación" + " " + F + " " + "es medianamente buena.");
        //Reemplaza <neutral> concatenando el String con la variable creada. 
        System.out.println("Una calificación" + " " + D + " " + "es neutral.");
        //Reemplaza <fairly_bad> concatenando el String con la variable creada. 
        System.out.println("Una calificación" + " " + E + " " + "es medianamente mala.");
        //Reemplaza <bad> concatenando el String con la variable creada. 
        System.out.println("Una calificación" + " " + A + " " + "es mala.");
        //Reemplaza <very_bad> concatenando el String con la variable creada.
        System.out.println("Una calificación" + " " + B + " " + "es muy mala.");
    }
}
