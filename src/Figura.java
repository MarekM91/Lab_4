/**
 * @author Michal Marek
 */
public abstract class Figura {
    abstract double pole();
    abstract double obwod();

    public void nazwaFigury(String figura) {
        System.out.println("To jest figura: " + figura);
    }
}
