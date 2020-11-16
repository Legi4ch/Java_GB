package Homework2;

public class MyArray {

    private final int SIZE = 4;
    protected String[][] arr;

    public MyArray(String[][] arr) throws MyArrayDimensionException {
        if (arr.length > SIZE || arr[0].length > SIZE) {
            throw new MyArrayDimensionException("Array Dimension Error. Max size is [" + SIZE + "][" + SIZE + "]");
        } else {
            this.arr = arr;
        }
    }

    public int MyArraySum() throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(this.arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Can't convert value in cell [" + i + "][" + j + "] = '" + this.arr[i][j] + "' to int type");
                }
            }
        }
        return sum;
    }
}
