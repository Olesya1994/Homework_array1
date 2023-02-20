import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1_3();
        task4();
    }
    public static void task1_3() {
        // Задача 1
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        double[] arr2 = {1.57, 7.654, 9.986};
        String[] arr3 = {"aaa", "bbb", "ccc" };

        System.out.println("Задача 2");
        //Вывод певого массива
        for (int i = 0; i < arr1.length - 1; i++) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println(arr1[arr1.length - 1]);

        //Вывод втогого массива
        for (int i = 0; i < arr2.length - 1; i++) {
            System.out.print(arr2[i] + ", ");
        }
        System.out.println(arr2[arr2.length - 1]);
        //Вывод третьего массива
        for (int i = 0; i < arr3.length - 1; i++) {
            System.out.print(arr3[i] + ", ");
        }
        System.out.println(arr3[arr3.length - 1]);

        System.out.println("Задача 3");
        //Вывод втогого массива
        for (int i = arr2.length - 1; i > 0; i--) {
            System.out.print(arr2[i] + ", ");
        }
        System.out.println(arr2[0]);
        //Вывод третьего массива
        for (int i = arr3.length - 1; i > 0; i--) {
            System.out.print(arr3[i] + ", ");
        }
        System.out.println(arr3[0]);
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                arr1[i]++;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}