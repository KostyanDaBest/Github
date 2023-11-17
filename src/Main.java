import java.util.Arrays;
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
        int x = 1;

        int newarr2[] = new int[arr2.length * 2];
        for (int i = arr2.length - 1; i >= 0; i--) {
            int y = arr2[i] + x;
            if (y == 10) {
                arr2[i] = 0;
            } else {
                arr2[i] = y;
                x = 0;
                break;
            }
        }
        if (x == 1) {
            newarr2[0] = 1;
        }
        for (int i = 0; i < newarr2.length; i++) {
            System.out.print(newarr2[i] + " ");
        }
    }
}


