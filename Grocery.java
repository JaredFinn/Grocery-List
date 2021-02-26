import java.util.Scanner;
class Grocery{

    //cannot do for some reason, causes bugs >:/
    //private static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        List myList = new List();
        menu(myList);
    }

    public static void menu(List list) {
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to your grocery List!");
        System.out.println("Choose between (1)Create List, (2)Add to List, (3)Delete list item, (4)Display List");
        int option = s.nextInt();

        switch(option){
            case 1:
                createList(list);
                break;
            case 2:
                if(list.getLength() == 0){
                    System.out.println("Error: No list was created or your list is empty, you will be re-routed to Create List");
                    createList(list);
                }
                else{
                    createList(list);
                }
                break;
            case 3:
                if(list.getLength() == 0){
                    System.out.println("Error: No list was created or your list is empty, you will be re-routed to Create List");
                    createList(list);
                }
                else{
                    deleteItem(list);
                }
                break;
            case 4:
                if(list.getLength() == 0){
                    System.out.println("Your List is Empty");
                    exitMessage(list);
                }
                else{
                    displayList(list);
                    exitMessage(list);
                }
                break;
            default:
                System.out.println("Error: Not a correct option");
                menu(list);
        }
    }

    //adds items to list, also carries function of adding items 
    //to list by deciding if it is a new list or existing. Didnt need redundant code
    public static void createList(List list){
        Scanner s = new Scanner(System.in);

        if(list.getLength() == 0){
            System.out.println("Create Your List Here");
            System.out.println("Enter an item and press enter:");
        }
        else{
            System.out.println("Add Your Items Here");
            System.out.println("Enter an item and press enter:");
        }

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
        menu(list);
    }

    //deletes an item of user choice 
    public static void deleteItem(List list){
        Scanner s = new Scanner(System.in);    

        int input;
        System.out.println("Choose the option you would like to delete:");
        for(int i = 0; i < list.getLength(); i++){
            System.out.println("(" + (i + 1) + ")" + list.getItem(i));
        }
        input = s.nextInt();
        list.deleteItem(input);
        System.out.println("Item has been deleted.");
        exitMessage(list);   
    }

    //Gives option to display list
    public static void displayList(List list){
        for(int i = 0; i < list.getLength(); i++){
            System.out.println(list.getItem(i));
        }
    }
    
    //auto-exit message with "e" key functionality
    public static void exitMessage(List list){
        Scanner s = new Scanner(System.in);
        String exit = "e";
        System.out.println("~Press e to exit~");
        if(s.nextLine().equals(exit)){
            menu(list);
        }
    }
}