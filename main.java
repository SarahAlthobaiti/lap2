//Student Name: Sarah Mohamed Althobiti , Student ID: 444004881
import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        SinglyLinkedList<Integer> myList = new SinglyLinkedList();
        myList.addFirst(2);
        myList.addLast(4);
        myList.addFirst(6);
        boolean flag = true;
        while(flag){
            System.out.println();
            System.out.println("1.Add a node in the middle");
            System.out.println("2.delete a node from the end");
            System.out.println("3.delete a node from the beginning");
            System.out.println("4.delete a node from the middle");
            System.out.println("5.print all data");
            System.out.println("6.Exit");
            System.out.println();
            int num = scnr.nextInt();
            if(num == 1){
                System.out.println("please enter the number you want to add");
                int e = scnr.nextInt();
                System.out.println("please enter the key number to add the number after");
                int key = scnr.nextInt();
                myList.addMiddle(e,key);

            }else if(num == 2){
               myList.removeLast();

            }else if(num == 3){
               myList.removeFirst();

            }else if(num == 4){
                System.out.println("please enter the number you want to remove");
                int key = scnr.nextInt();
                myList.removeMiddle(key);
            }else if( num == 5){
                myList.display();
            }else{
                flag = false;
            }
        }
        System.out.println("the size of the list: "+myList.getSize());
        System.out.println("the first element: "+myList.getFirst().getData());
        System.out.println("the last element: "+myList.getLast().getData());

    
        
    }
}