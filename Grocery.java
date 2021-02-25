import java.util.Scanner;


class Grocery{
    public static void main(String[] args){
        
        List myList = new List();
        createList(myList);
    }

    public static void createList(List list){

        Scanner s = new Scanner(System.in);

        System.out.println("Enter grocery list item by item(enter done to stop):");

        boolean end = false;
        String input;
        while(!end){
            input = s.nextLine();
            if(input.equals("done")){
                end = true;
            }
            else{
                list.addItem(input);
            }
        }
        displayList(list);
    }

    public static void displayList(List list){
        Scanner s = new Scanner(System.in);
        System.out.println("Display List Y/N");
        if(s.nextLine().equals("y")){
            for(int i = 0; i < list.getLength(); i++){
                System.out.println(list.getItem(i));
            }
        }
    }
}