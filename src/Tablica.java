import java.util.Scanner;

//1.12 Napisz program, w którym zadeklarujesz i utworzysz pięcioelementową tablicę odpowiedniego typu.
// W pętli pobierzesz od użytkownika 5 imion i je w niej zapiszesz. Następnie wyświetl na ekranie powiadomienia
// "Witaj imie_z_tablicy" dla każdego z podanych parametrów.
public class Tablica {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int dlugosc = 5;
        String tablica[] = new String[dlugosc];

        for (int i = 0; i < dlugosc; i++){
            System.out.println("Podaj imie gnojó: ");
            tablica[i]=inp.nextLine();
            }//petla
        
    }//main

    public static void drukuj(String inna_nazwa_bo_moge){
        System.out.println(inna_nazwa_bo_moge);

    }
}