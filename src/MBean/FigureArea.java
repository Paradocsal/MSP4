package MBean;
import static java.lang.Math.pow;

public class FigureArea implements FigureAreaMBean {
    private double area = 0;
    private double pi = 3.1415926535;

    @Override
    public double getFigureArea() {
        return area;
    }

    @Override
    public void update(double R) {
        area = 0;
        area+=pow(R/2,2)/2;
        area+=R*(R/2);
        area+=pi*pow(R,2)/4;
    }
}
