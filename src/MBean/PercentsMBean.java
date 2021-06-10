package MBean;

import java.util.ArrayList;

public interface PercentsMBean {
    double getPercent();
    void update(ArrayList<String> history);
}
