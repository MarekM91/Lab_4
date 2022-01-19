import Interfaces.StudentI;

/**
 * @author Michal Marek
 */
public class Student implements StudentI {

    private String nazwisko;
    private String kierunek;
    private int semestr;
    private String wydzial;

    @Override
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    @Override
    public void setSemestr(int semestr) {
        this.semestr = semestr;
    }

    @Override
    public void setWydzial(String wydzial) {
        this.wydzial = wydzial;
    }

    @Override
    public String toString() {
        System.out.println("Student " + nazwisko +
                ", wydział " + wydzial +
                ", kierunek " + kierunek +
                ", semestr " + semestr);
        return null;
    }
}
