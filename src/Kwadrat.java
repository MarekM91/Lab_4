/**
 * @author Michal Marek
 */
public class Kwadrat extends Figura{

    private double a;

    public Kwadrat() {
    }

    public Kwadrat(double a) {
        this.a = a;
    }

    @Override
    double pole() {
        return a * a;
    }

    @Override
    double obwod() {
        return 4*a;
    }
}
