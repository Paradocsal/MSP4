import MBean.*;

import javax.management.*;
import java.lang.management.ManagementFactory;

public class Main {
    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException {
        ObjectName PercentsObj = new ObjectName("MBean:type=Percents");
        ObjectName CountAndOutObj = new ObjectName("MBean:type=CountAndOut");
        ObjectName CountAndDoubleMissObj = new ObjectName("MBean:type=CountAndDoubleMiss");
        ObjectName AverageIntervalObj = new ObjectName("MBean:type=AverageInterval");
        ObjectName CountAndMultipleObj = new ObjectName("MBean:type=CountAndMultiple");
        ObjectName FigureAreaObj = new ObjectName("MBean:type=FigureArea");

        Percents percents = new Percents();
        CountAndOut counterAndOuter = new CountAndOut();
        CountAndDoubleMiss counterAndDoubleMiss = new CountAndDoubleMiss();
        AverageInterval averageInterval = new AverageInterval();
        CountAndMultiple counterAndMultiple = new CountAndMultiple();
        FigureArea figureArea = new FigureArea();

        MBeanServer server = ManagementFactory.getPlatformMBeanServer();

        server.registerMBean(percents, PercentsObj);
        server.registerMBean(counterAndOuter, CountAndOutObj);
        server.registerMBean(counterAndDoubleMiss, CountAndDoubleMissObj);
        server.registerMBean(averageInterval, AverageIntervalObj);
        server.registerMBean(counterAndMultiple, CountAndMultipleObj);
        server.registerMBean(figureArea, FigureAreaObj);

        Client.Start(percents,counterAndOuter,counterAndDoubleMiss, averageInterval, counterAndMultiple, figureArea);
    }
}
