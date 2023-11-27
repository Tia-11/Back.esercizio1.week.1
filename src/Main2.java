import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Inserisci la prima stringa:");
        String str1 = scanner.nextLine();

        System.out.println("Inserisci la seconda stringa:");
        String str2 = scanner.nextLine();

        System.out.println("Inserisci la terza stringa:");
        String str3 = scanner.nextLine();


        String concatenationInOrder = str1 + str2 + str3;
        System.out.println("Concatenazione in ordine di inserimento: " + concatenationInOrder);


        String concatenationReverseOrder = str3+str2+str1;
        System.out.println("Concatenazione al contrario: " + concatenationReverseOrder);

        scanner.close();
    }
}