package Homework2;

public class Main {

    public static void main(String[] args) throws MyArrayDimensionException, MyArrayDataException {
        //String[][] sArr = {{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"}};
        String[][] sArr = {{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"}};

        try {
            MyArray arr = new MyArray(sArr);
            System.out.println("Сумма элементов массива = " + arr.MyArraySum() );

        } catch (MyArrayDimensionException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

    }


}

