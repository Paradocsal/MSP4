package MBean;

import java.util.ArrayList;

public interface CountAndDoubleMissMBean {
    int getAllPoints();
    int getUnsuccessfulPoints();
    void update(ArrayList<String> history);
    boolean ThrowNotification();
}
