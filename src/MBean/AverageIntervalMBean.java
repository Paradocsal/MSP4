package MBean;

import java.util.ArrayList;

public interface AverageIntervalMBean {
    double getAverageInterval();
    void update(double x, double y, double R, ArrayList<String> history);
}
