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

    public void deleteItem(int index){
        //index-1 to account for the display starting at 1, better than 0.
        groceryList.remove(index-1);
    }
}
