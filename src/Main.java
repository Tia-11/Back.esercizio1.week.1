import java.nio.file.FileSystemNotFoundException;

public class Main {
    public static int x(int num1, int num2){
        return num1 * num2;
    }

    public static void molt(){
        System.out.println(x(2, 5));
    }

    public static String y(String str, int num3){
        String diventaNumero = String.valueOf(num3);
        String unisci = str + diventaNumero;
        return unisci;
    }

    public static void risul(){
        System.out.println(y("ciao",4));
    }

    public static void main(String[] args) {
        molt();
        risul();
    }
}