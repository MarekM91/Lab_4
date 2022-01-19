
public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) napisać interfejs Interfaces.CzlowiekI
        b) zadeklarować 2 metody

        c) napisać interfejs Interfaces.StudentI który dziedziczy po interfejsie Interfaces.CzlowiekI
        d) zadeklarować 3 metody

        e) napisać interfejs Interfaces.PracownikI który dziedziczy po interfejsie Interfaces.CzlowiekI
        f) zadeklarować 3 metody
         */

        /* zad.2
        a) napisać klasę Student która będzie implementować interfejs Interfaces.StudentI
        b) napisać klasę Pracownik która będzie implementować interfejs Interfaces.PracownikI
        c) stworzyć pola, gettery i settery, metodę toString dla obu klas, (constructor z przeciążeniem - jak ktoś chce ),
        (gettery i settery / toString() ..., najlepiej wygenerować: Code/Prawy myszy-->Generate-->getters/setters/toString)
        */

        /* zad.3
        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola
        c) wypisać metody toString() wszystkich objektów

        zad.4 - Dla chętnych
        a) stworzyć klasę Kierownik która będzie implementować interfejs Interfaces.PracownikI,
        b) zaimplementować wszystkie metody, i stworzyć pola
        c) stworzyć 2 objekty typu Kierownik i uzupełnić wszystkie pola,
        d) stworzyć listę typu Interfaces.PracownikI --> List<Interfaces.PracownikI> listaPracownikow = new ArrayList<>();
        e) dodać do niej objekty typu Kierownik i Pracownik
        f) wypisać pętlą metody toString() wszystkich elementów listy
        */

        /* zad5 - Dla chętnych
        Stworzyć klasę która będzie implementować 2 lub 3 interfejsy następnie będzie
        dziedziczona przez inną klasę
        */

        Student student1 = new Student();
        student1.setNazwisko("Marek");
        student1.setKierunek("Informatyka");
        student1.setWydzial("Ekonomiczny");
        student1.setSemestr(3);

        Student student2 = new Student();
        student2.setNazwisko("Burek");
        student2.setKierunek("Matematyka");
        student2.setWydzial("Ekonomiczny");
        student2.setSemestr(4);

        Pracownik pracownik1 = new Pracownik();
        pracownik1.setStanowisko("Młodszy inżynier");
        pracownik1.setNazwisko("Wajda");
        pracownik1.setZarobki(8000);
        pracownik1.setStazPracy(5);

        Pracownik pracownik2 = new Pracownik();
        pracownik2.setStanowisko("Starszy inżynier");
        pracownik2.setNazwisko("Gierda");
        pracownik2.setZarobki(12000);
        pracownik2.setStazPracy(7);

        student1.toString();
        student2.toString();
        pracownik1.toString();
        pracownik2.toString();
    }
}
