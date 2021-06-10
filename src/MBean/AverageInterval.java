package MBean;

import java.util.ArrayList;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class AverageInterval implements AverageIntervalMBean {
    private double averageInterval = 0;
    private double interval = 0;
    private double prev_x = 0;
    private double prev_y = 0;
    private double prev_R = 0;
    @Override
    public double getAverageInterval() {
        return averageInterval;
    }

    @Override
    public void update(double x, double y, double R, ArrayList<String> history) {
        if (history.size()>1) {
            interval+=sqrt(pow((x*R - prev_x*prev_R),2)+pow((y*R - prev_y*prev_R),2));
            averageInterval = interval/(history.size()-1);
        }
        prev_x = x;
        prev_y = y;
        prev_R = R;
    }
}
