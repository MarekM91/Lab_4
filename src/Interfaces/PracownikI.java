package Interfaces;

/**
 * @author Michal Marek
 */
public interface PracownikI extends CzlowiekI{

    void setZarobki(int zarobki);

    void setStanowisko(String stanowisko);

    void setStazPracy(int stazPracy);
}
