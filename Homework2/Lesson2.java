/*
Файл с урока. Это не дз, а конспект занятия
*/
package Homework2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson2 {

    private static String foo() {
        int[] arr = {5,4,6,7,1,2,3};
        int[] arDivider = {2,0,3,4,0,5,6,7,0,9,10};

        doMath(arr,arDivider);
        return Arrays.toString(arr);
    }

    public static void doMath(int[] arr,int[] arDivider) {
        for (int i = 0; i < arDivider.length; i++) {
            try {
                arr[i] /= arDivider[i];
            } catch (ArithmeticException e) {
                System.out.println("Division by zero on index: " + i);
                //arr[i] = 0;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Out of index. Stop on: " + ( i - 1 ));
                break;
            } finally {
                //pass
            }
        }
    }

    private static void readFile(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);
    }

    private static void readFile2(String path) {
        Scanner scanner = null;
        try {
            File file = new File(path);
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("File not found:" + path);
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    private static int returnInt(int a,int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            return a;
            //e.printStackTrace();
        } finally {
            //return -1;
        }
    }


    public static void main(String[] args) {
        //System.out.println(foo());
        readFile2("e:/test.txt");
        System.out.println(returnInt(10,0));
    }
}
