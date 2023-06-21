package PackQueue;

import java.util.LinkedList;
import java.util.Scanner;

//2. Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

public class MethodsLinList {

    /**
     * @param size size of queue
     * @return queue obtained through LinkedList
     */
    public static LinkedList Queue(int size) {
        LinkedList myQueue = new LinkedList<>();// создаем линк лист
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.println("Enter elements: ");// вводим элементы очереди с клавиатуры
            String element = sc.nextLine();
            myQueue.add(element);// заполняем по порядку
        }
        return myQueue;

    }

    /**
     * @param listName LinkedList for addication elements
     */
    public static void EnqueueForLinkedList(LinkedList listName ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements: ");//вводим элемент с клавиатуры
        String element = sc.nextLine();
        listName.add(element);//помещаем в конец очереди

    }

    /**
     * @param listName
     * @return
     */
    public static Object Dequeu(LinkedList listName) {
        Object firsElement=listName.get(0);
        System.out.println("First element"+" = "+listName.get(0));//находим первый элемент
        listName.remove(0);//удаляем его

        return firsElement;
        
    }

    /**
     * @param listName
     * @return
     */
    public static Object Firs(LinkedList listName) {
        Object firsElement=listName.get(0);
        System.out.println("First element"+" = "+listName.get(0));//находим первый элемент
        return firsElement;
        
    }





}
