package EI;

import TDAs.DoublyLinkedList;

public class MainBubbleSort {
    public static void main(String[] args) {
        DoublyLinkedList <Integer> DouInt = new DoublyLinkedList<>();
        DoublyLinkedList<String> DouString = new DoublyLinkedList<>();
        DoublyLinkedList<Float> DouFloat = new DoublyLinkedList<>();

        // Enteros
        DouInt.addFirst(8);
        DouInt.addFirst(1);
        DouInt.addFirst(6);
        DouInt.addFirst(4);

        // String
        DouString.addFirst("Hola");
        DouString.addFirst("adios");
        DouString.addFirst("Allah");

        //Float
        DouFloat.addFirst(7.51f);
        DouFloat.addFirst(5.89f);
        DouFloat.addFirst(1.15f);
        DouFloat.addFirst(7.81f);

        //Ordenamiento Enteros
        for (Integer i : DouInt){
            System.out.print(i + ", ");
        }
        System.out.println(" ");
        DouInt.bubbleSort();

        for (Integer i : DouInt){
            System.out.print(i + ", ");
        }
        System.out.println("\n");

        //Ordenamiento Strings
        for (String s : DouString){
            System.out.print(s + ", ");
        }
        System.out.println(" ");
        DouString.bubbleSort();

        for (String s : DouString){
            System.out.print(s + ", ");
        }
        System.out.println("\n");

        //Ordenamiento Float
        for (Float f : DouFloat){
            System.out.print(f + ", ");
        }
        System.out.println(" ");
        DouFloat.bubbleSort();

        for (Float f : DouFloat){
            System.out.print(f + ", ");
        }


    }
}
