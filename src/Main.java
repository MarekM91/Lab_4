public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) Stwożyć interfejs Budynek,
        b) interfejs powinien mieć metody:
            - double powierzchnia(double pow);
            - String adresBudynku(String adres);
            - int liczbaOkien(int value);
            - void liczbaMieszkancow(int value);
            - void kolorDomu(KolorEnum kolor);
        c) stworzyć enum KolorEnum z przykładowymi kolorami,
        d) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
        */

        /* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie
        */

        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól
        c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom
        */

        Dom dom1 = new Dom();
        dom1.setRokBudowy(2000);
        dom1.adresBudynku("Magellana");
        dom1.kolorDomu(KolorEnum.CZARNY);
        dom1.liczbaMieszkancow(2);
        dom1.liczbaOkien(3);
        dom1.numeryKlatkiIMieszkania(1,12);
        dom1.powierzchnia(30);

        Budynek dom2 = new Dom();
        dom2.adresBudynku("Magellana");
        dom2.kolorDomu(KolorEnum.CZARNY);
        dom2.liczbaMieszkancow(2);
        dom2.liczbaOkien(3);
        dom2.numeryKlatkiIMieszkania(1,12);
        dom2.powierzchnia(30);

        System.out.println(dom1.toString());
        System.out.println(dom2.toString());
    }
}
