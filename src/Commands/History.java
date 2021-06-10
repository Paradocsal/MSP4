package Commands;

public class History extends Store {
    public static void showHistory(){

        for (String result : Storage) {
            System.out.println(result);
        }
    }
}
