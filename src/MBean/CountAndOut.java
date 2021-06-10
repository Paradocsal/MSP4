package MBean;

import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;
import java.util.ArrayList;

public class CountAndOut extends NotificationBroadcasterSupport implements CountAndOutMBean{

    private int countAll = 0;
    private int countUnsuccessful = 0;
    private int notificationCounter = 0;

    @Override
    public int getAllPoints() {
        return countAll;
    }

    @Override
    public int getUnsuccessfulPoints() {
        return countUnsuccessful;
    }

    @Override
    public void update(ArrayList<String> history) {
        countAll = history.size();

        if (history.get(countAll-1).equals("unsuccessful hit")|history.get(countAll-1).equals("not in area")) countUnsuccessful++;

        if (history.get(countAll-1).equals("not in area")) ThrowNotification();
    }

    @Override
    public boolean ThrowNotification() {
        Notification notification = new Notification(
                "PointsOutOfArea", this, notificationCounter++, System.currentTimeMillis(),"Your numbers are not in the specified area!"
        );
        this.sendNotification(notification);
        return false;
    }
}
