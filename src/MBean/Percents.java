package MBean;

import java.util.ArrayList;

public class Percents implements PercentsMBean{
    private double cent = 0;

    @Override
    public void update(ArrayList<String> history) {
        int hit = 0;
        int all = history.size();
        for (String result : history) {
            if (result.equals("successful hit")) hit++;
        }
        if (all>0) {
            cent = (100.0 * hit) / all;
        }
    }

    @Override
    public double getPercent() {
        return cent;
    }

}

