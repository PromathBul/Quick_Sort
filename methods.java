import java.util.Random;
import java.util.Scanner;

public class methods {
    static int[] fillArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            Random rnd = new Random();
            array[i] = rnd.nextInt(100);
        }

        return array;
    }

    static int inputNum(String msg) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print(msg);
        int num = iScanner.nextInt();
        iScanner.close();
        return num;
    }

    static void showArray(int[] array){
        for (int i : array) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

    static void quickSort(int[] sortArray, int low, int high) {
        if (sortArray.length == 0 || low >= high)
            return;

        int middle = low + (high - low) / 2;
        int border = sortArray[middle];

        int i = low, j = high;
        while (i <= j) {
            while (sortArray[i] < border)
                i++;
            while (sortArray[j] > border)
                j--;
            if (i <= j) {
                int swap = sortArray[i];
                sortArray[i] = sortArray[j];
                sortArray[j] = swap;
                i++;
                j--;
            }
        }

        // рекурсия для сортировки левой и правой части
        if (low < j)
            quickSort(sortArray, low, j);
        if (high > i)
            quickSort(sortArray, i, high);
    }
}
