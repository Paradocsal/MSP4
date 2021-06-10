package Commands;

import MBean.*;

import java.util.Scanner;

public class Shooting {

    public static void Shoot(Percents percent, CountAndOut counterAndOuter, CountAndDoubleMiss counterAndDoubleMiss,
                             AverageInterval averageInterval, CountAndMultiple counterAndMultiple, FigureArea figureArea) {

        System.out.println("Enter x y R");
        System.out.println("Enter the numbers in the following area: X[-5..3], Y[-3..3], R[1..3]");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        String[] inputParts = input.split(" ", 3);

        try {
            double x = Double.parseDouble(inputParts[0]);
            double y = Double.parseDouble(inputParts[1]);
            double R = Double.parseDouble(inputParts[2]);
            if (R >= 0) {
                Store.addResult(Calculator.Calculate(x, y, R));
                percent.update(Store.Storage);
                counterAndOuter.update(Store.Storage);
                counterAndDoubleMiss.update(Store.Storage);
                averageInterval.update(x, y, R, Store.Storage);
                counterAndMultiple.update(Store.Storage);
                figureArea.update(R);
                System.out.println(Store.getLastResult());
            } else System.out.println("Your radius is less than zero. Counting is not possible");
        } catch (Exception e) {
            System.out.println("Oops, you have mistake. Try again");
        }

    }


}
