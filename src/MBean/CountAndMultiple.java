package MBean;

import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;
import java.util.ArrayList;

public class CountAndMultiple extends NotificationBroadcasterSupport implements CountAndMultipleMBean {
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

        if (countAll%15 == 0) ThrowNotification();
    }

    @Override
    public boolean ThrowNotification() {
        Notification notification = new Notification(
                "DoubleMiss", this, notificationCounter++, System.currentTimeMillis(),"The number of installed points has become a multiple of 15"
        );
        this.sendNotification(notification);
        return false;
    }
}
