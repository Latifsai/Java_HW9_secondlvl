import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.util.Arrays.*;

public class ArraysUndIntegers {
    public static void main(String[] args) {
     consistencyOfNumbers();
    }


    //    Дан массив чисел произвольного размера, заполненный целыми числами.
//    Определить и вывести на экран решение - являются ли значения элементов массива возрастающей последовательностью.


    static void consistencyOfNumbers (){
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array lenght:");
        int scannerThing = scanner.nextInt();
        int[] arrays = new int[scannerThing];

        for (int i = 0; i < scannerThing; i++) {
            int integers = random.nextInt(0,10);
            System.out.println("arrays[" + i + "]=" + integers);
            arrays[i] = integers;

        }

        System.out.println(Arrays.toString(arrays));

        boolean isConsistency = true;
        for (int i = 1; i < arrays.length; i++) {
            if (arrays[i] <= arrays[i- 1]){
                isConsistency = false;
                break;
            }
        }

        if (isConsistency){
            System.out.println("Массив 'arrays' является возрастающей последовательностью");
        }else {
            System.out.println("Массив 'arrays' не является возрастающей последовательностью");

        }

    }

}
