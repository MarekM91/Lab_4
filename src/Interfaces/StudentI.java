package Interfaces;

/**
 * @author Michal Marek
 */
public interface StudentI extends CzlowiekI{

    void setKierunek(String kierunek);

    void setSemestr(int semestr);

    void setWydzial(String wydzial);
}
