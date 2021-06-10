package Commands;

public class Exit {
    public static boolean exit(String inputParts0){
        if (inputParts0.equals("exit")){
            System.out.println("Bye!");
            return true;
        } else return false;
    }
}
