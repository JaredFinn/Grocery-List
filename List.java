import java.util.ArrayList;

public class List {
   
    private ArrayList<String> groceryList = new ArrayList<String>();

    public List(){
        //empty
    }

    public void addItem(String input){
        groceryList.add(input);
    }

    public String getItem(int index){
        return groceryList.get(index);
    }
    public int getLength(){
        return groceryList.size();
    }
}
