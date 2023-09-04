import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ange ditt födelsedatum");
        Scanner tangenbord = new Scanner(System.in);

        int födelse_datum = tangenbord.nextInt();

        System.out.println("Ange 4 sista");
        int fyra_sista = tangenbord.nextInt();
        
        System.out.println("Ditt persnummer är: "+födelse_datum+":"+fyra_sista);
    }
}
