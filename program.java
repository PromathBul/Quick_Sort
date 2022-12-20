
public class program {

    public static void main(String args[]) {
        int size = methods.inputNum("Введите размер массива: ");

        System.out.println("\nСгенерирован изначальный массив: ");
        int[] originalArray = methods.fillArray(size);
        methods.showArray(originalArray);

        methods.quickSort(originalArray, 0, originalArray.length - 1);

        System.out.println("\nОтсортированный массив с помощью быстрой сортировки: ");
        methods.showArray(originalArray);
    }

}