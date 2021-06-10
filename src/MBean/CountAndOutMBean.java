package MBean;

import java.util.ArrayList;

public interface CountAndOutMBean {
    int getAllPoints();
    int getUnsuccessfulPoints();
    void update(ArrayList<String> history);
    boolean ThrowNotification();
}
