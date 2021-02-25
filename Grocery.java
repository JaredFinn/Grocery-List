import java.util.Scanner;


class Grocery{
    public static void main(String[] args){
        createList();
    }

    public static void createList(){

        Scanner s = new Scanner(System.in);

        System.out.println("Enter grocery list item by item(enter done to stop):");

        boolean end = false;
        String input;
        List myList = new List();
        while(!end){
            input = s.nextLine();
            if(input.equals("done")){
                end = true;
            }
            else{
                myList.addItem(input);
            }
        }
    }
}