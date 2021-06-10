package Commands;

import java.util.ArrayList;

class Store {

    static ArrayList<String> Storage = new ArrayList<>();

    static void addResult(String result){
        Storage.add(result);
    }

    static String getLastResult(){
        return Storage.get(Storage.size()-1);
    }

}
