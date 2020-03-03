package lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7};
        String arr2[] = {"A", "B", "C"} ;
        swap(arr1,1,4);
        swap(arr2,0,2);

        String[] arrayOfStrings = {"A", "B", "C", "D"};
        asList(arrayOfStrings);
    }
    public static void swap(Object[] arr, int n1, int n2){
        System.out.println("Задание 1: "+Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=sw;
        System.out.println("Меняем два элемента массива местами: "+Arrays.toString(arr));
    }
    public static <T> void asList(T[]arr){
        ArrayList<T> alt = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Задание 2. Преобразуем массив в ArrayLis: "+alt);
    }
}