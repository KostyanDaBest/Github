import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 4, 0, 5, 6, 3};
        int arr2[] = {9, 9, 9};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

        int newarr2[] = new int[arr2.length * 2];
        for (int i = 0; i < arr2.length; i++) {
            newarr2[i * 2] = arr2[i];
            newarr2[i * 2 + 1] = (arr2[i] + 1) % 10;
        }

        for (int i = 0; i < newarr2.length; i++) {
            System.out.print(newarr2[i] + " ");
        }
    }
}