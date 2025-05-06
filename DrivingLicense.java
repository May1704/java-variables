import javax.sound.sampled.SourceDataLine;
import java.net.SocketAddress;

public class DrivingLicense {

    public static void main(String[] args) {
        //inicializar una variable (del tipo que veas conveniente) que contenga los
        // puntos del carnet de conducir que empiece con 0 puntos.
        int cardPoints = 0;
        int approvedPointsCard = cardPoints + 12;
        System.out.println("Has sacado tu carnet de conducir, felicidades tienes" + " " + approvedPointsCard + " " + "puntos");
        int lostPointsCard = approvedPointsCard - 6;
        System.out.println("Te has negado a realizar pruebas de alcohol o drogas" + "," + " " + "pierdes" + " " + lostPointsCard + " " + "puntos");
        int pointsCardViolation = lostPointsCard - 3;
        System.out.println("Has conducido con cascos o auriculares, pierdes" + " " + pointsCardViolation + " " + "puntos");
        int withdrawnCardPoints = pointsCardViolation - 3;
        System.out.println("Tu coche detecta radares, pierdes" + " " + pointsCardViolation + " "+ "puntos");
        System.out.println("Tu coche tiene" + " " + withdrawnCardPoints);
        int recovereCardPoints = withdrawnCardPoints + 8;
        System.out.println("Te han retirado el carnet y ahora lo has recuperado, ganas 8 puntos");
        int addedCardPoints = 4;
        System.out.println("Has conducido sin haber cometido ninguna infracción en el transcurso de 2 años, ganas" + " " + addedCardPoints + " " + "puntos");
        int added2CardPoints = 2;
        System.out.println("Han pasado 3 años y sigues sin cometer infracciones, ganas" + " " + added2CardPoints + " " + "puntos");
        int totalPoints = addedCardPoints + added2CardPoints + recovereCardPoints;
        System.out.println("¿Cuántos puntos tienes?");
        System.out.println("Tiene" + " " + totalPoints + " " + "puntos");

    }
    
}