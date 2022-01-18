/**
 * @author Michal Marek
 */
public class Dom implements Budynek{

    private int rokBudowy;

    @Override
    public double powierzchnia(double pow) {
        return pow;
    }

    @Override
    public String adresBudynku(String adres) {
        return adres;
    }

    @Override
    public int liczbaOkien(int value) {
        return value;
    }

    @Override
    public void liczbaMieszkancow(int value) {
        System.out.println("Liczba mieszkańców wynosi " + value);;
    }

    @Override
    public void kolorDomu(KolorEnum kolor) {
        System.out.println("Kolor budynku to " + kolor);
    }

    @Override
    public void numeryKlatkiIMieszkania(int klatka, int mieszkanie) {
        System.out.println("Mieszkanie nr " + mieszkanie + ", klatka nr " + klatka);
    }

    public int getRokBudowy() {
        return rokBudowy;
    }

    public void setRokBudowy(int rokBudowy) {
        this.rokBudowy = rokBudowy;
    }

    @Override
    public String toString() {
        return "Dom wybudowany w " + rokBudowy + " roku.";
    }
}
