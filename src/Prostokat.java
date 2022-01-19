/**
 * @author Michal Marek
 */
public class Prostokat extends Figura{
    private double a,b;

    public Prostokat() {
    }

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double pole() {
        return a*b;
    }

    @Override
    double obwod() {
        return 2*(a+b);
    }
}
