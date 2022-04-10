package Chapter2_LinkedList;
import java.util.*;
public class Main{
       public static void main(String[] args) {
        //create a LinkedList object and initialize it with Array elements converted to list
            LinkedList<Integer> intList = new LinkedList<>(Arrays.asList(10,20,30,40,50));
            //print the LinkedList just created
            System.out.println("Contents of first LinkedList: " + intList);
            System.out.println("Size of Linked List : " + intList.size());
         
            //create an empty list
            LinkedList<String> colorsList = new LinkedList<>();
            //add elements to the linkedList using add method.
            colorsList.add("Red");
            colorsList.add("Green");
            colorsList.add("Blue");
            colorsList.add("Cyan");
            colorsList.add("Magenta");
            // print the LinkedList
            System.out.println("\nContents of second LinkedList: " + colorsList);
    }
}