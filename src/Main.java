import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć tablicę 6-cio elementową, uzupełnić przykładowymi wartościami (dowolny typ tablicy),
        b) wprowadzić z klawiatury numer indexu tablicy który chcemy wyświetlić, użyć metody next() --> scan.next();
        c) zabezpieczyć kod przed wprowadzeniem:
           - za dużej liczby (index > tab.length),
           - wprowadzeniem innego znaku niż liczba,
        d) użyć metody finally aby wyświetlić komunikat zakończenia programu
        e) wprowadzanie indeksu niech będzie zapętlone do momentu wprowadzenia poprawnego indeksu

           PODPOWIEDZI:
           scan.next() - można wprowadzać dowolny znak z klawiatury,
           index = Integer.parseInt(scan.next()); - parsowanie zmiennej do typu int (liczbowego calkowitego)

           warto stworzyć flagę np. isIndexCorrect = false, i niech pętla sie wykonuje, dopuki flaga jest false,
           boolean isIndexCorrect
           white(!isIndexCorrect) {}
        */


        int tab[] = {1, 2, 3, 4, 5, 6};
        Scanner scanner = new Scanner(System.in);
        boolean isIndexCorrect;
        do {
            isIndexCorrect = false;
            int index = Integer.parseInt(scanner.next());
            if (index >= 0 && index <= tab.length) {
                try {
                    isIndexCorrect = true;
                    System.out.println(tab[index]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Zły numer index");
                } finally {
                    System.out.println("Koniec programu");
                }
            }
        } while (!isIndexCorrect);

        /* zad.2
        a) stworzyć dowolny przykład z NullPonterException,
        b) stworzyć dowolny przykład z ArithmeticException ,
        c) stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally,
         */
        try {
            String word = null;
            word.toString();
        } catch (NullPointerException e) {
            System.out.println("Nie da się wykonywać tej operacji na wartości null");
            throw e;
        }

        int x = 10;
        int y = 0;
        try {
            int result = x / y;
        } catch (ArithmeticException e) {
            System.out.println("Nie można dzielić przez 0");
        }

        try{
            int a[]=new int[7];
            a[4]=30/0;
        }
        catch(ArithmeticException e){
            System.out.println("Błąd arytmetyczny");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Zły numer indeksu");
        }
        catch(Exception e){
            System.out.println("Błąd");
        } finally {
            System.out.println("Koniec programu");
        }
    }


    }


