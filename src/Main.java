public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */

        Prostokat prostokat = new Prostokat(2,3);
        System.out.println(prostokat.obwod());
        System.out.println(prostokat.pole());

        Kwadrat kwadrat = new Kwadrat(4);
        System.out.println(kwadrat.obwod());
        System.out.println(kwadrat.pole());

    }
}
