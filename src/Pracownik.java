import Interfaces.PracownikI;

/**
 * @author Michal Marek
 */
public class Pracownik implements PracownikI {


    private String nazwisko;
    private int zarobki;
    private String stanowisko;
    private int stazPracy;

    @Override
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public void setZarobki(int zarobki) {
        this.zarobki = zarobki;
    }

    @Override
    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    @Override
    public void setStazPracy(int stazPracy) {
        this.stazPracy = stazPracy;
    }

    @Override
    public String toString() {
        System.out.println("Pracownik " + nazwisko +
                ", na stanowisku " + stanowisko +
                ", zarobia " + zarobki +
                ", pracuje " + stazPracy + " lat");
        return null;
    }
}
