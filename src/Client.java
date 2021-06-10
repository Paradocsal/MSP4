import Commands.*;
import MBean.*;

import java.util.Scanner;

class Client {
    static void Start(Percents percents, CountAndOut counterAndOuter, CountAndDoubleMiss counterAndDoubleMiss,
                      AverageInterval averageInterval, CountAndMultiple counterAndMultiple, FigureArea figureArea){

        System.out.println("Enter you action, use >help to get the list of all commands");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        String[] inputParts = input.split(" ", 2);

        while (!Exit.exit(inputParts[0])) {
            switch (inputParts[0]) {
                case "":
                    break;
                case "help":
                    Help.help();
                    break;
                case "shot":
                    Shooting.Shoot(percents, counterAndOuter, counterAndDoubleMiss, averageInterval, counterAndMultiple, figureArea);
                    break;
                case "history":
                    History.showHistory();
                    break;
                default:
                    System.out.println('"' + input + "\" is not an available command. Use >help to get a list of available commands");
                    break;

            }
            System.out.println("Enter you action, use >help to get the list of all commands");

            input = sc.nextLine().toLowerCase();
            inputParts = input.split(" ", 4);

        }

    }


}
