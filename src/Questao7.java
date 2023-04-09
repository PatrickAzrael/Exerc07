import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe a medida do quadrado: ");
        float am;
        am = leia.nextFloat();
        leia.close();
        float aq;

        aq = am * am;

        float daq;
        daq = aq * 2;

        System.out.printf("%.2f", daq);
    }

}
