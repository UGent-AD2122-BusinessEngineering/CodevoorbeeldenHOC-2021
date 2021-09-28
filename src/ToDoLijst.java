import java.util.ArrayList;

/**
 * Klasse voor toevoegen TODO items aan ArrayList
 */

public class ToDoLijst {
    public static void main(String[] args) {
        ArrayList<String> todoLijst = new ArrayList<>();

        todoLijst.add("Auto wassen");
        todoLijst.add("kamer opruimen");
        todoLijst.add("boodschappen");
        todoLijst.remove(0);

        for(String item: todoLijst){
            System.out.println(item);
        }
    }
}
