package PackReturn;

import java.util.LinkedList;
import java.util.Random;
//1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

public class ReversList {

    /**
     * @param listName LinkedList for reverse
     * @return revers LinkedList
     */
    public static LinkedList ReverseList(LinkedList listName) {
        LinkedList reversListName = new LinkedList<>();// создаем новый линк.лист
        int len = listName.size();
        for (int i = 0; i < len; i++) {
            reversListName.add(listName.get((len - 1) - i));// добавляем в конец (а он пустой, то есть сначала и до
                                                            // конца)
            // значения, полученей с конца исходного линк.листа и возвращаем НОВЫЙ лист
        }
        return reversListName;
    }

    /**
     * @param size     size of LinkedList
     * @param maxValue max value of random for LinkedLists element
     * @return a new LinkedList filled with random integers in the range
     */
    public static LinkedList GetRandomLinkedList(int size, int maxValue) {
        LinkedList mylist = new LinkedList<>();
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            mylist.add(r.nextInt(maxValue));// заполняем линклист случайными значениями в диапазоне,
            // но вообще можно заполнить любым типом, мне инты нравятся больше всего
        }

        return mylist;

    }

}
