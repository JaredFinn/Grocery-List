import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;


class Grocery{
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
                break;
            case 4:
                if(list.getLength() == 0){
                    System.out.println("Your List is Empty");
                    System.out.println("~Press e to exit~");
                    String exit = s.nextLine();
                    if(exit.equals("e")){
                        menu(list);
                    }
                }
                else{
                    displayList(list);
                    System.out.println("~Press e to exit~");
                    String exit = s.nextLine();
                    if(exit.equals("e")){
                        menu(list);
                    }
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

    //Gives option to display list
    public static void displayList(List list){
            for(int i = 0; i < list.getLength(); i++){
                System.out.println(list.getItem(i));
            }
        }

}