package ru.geekbrains.java2.lessons.HomeWork.DZ.DZ2;



public class DZ {

    public static void main(String[] args) {
        String[][] arrMY = new String[][]{{"1", "1", "1", "1","1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};
        try {
            try {
                int result = recalculation(arrMY);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Array size exceeded");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Incorrect array value");
        }
    }
    public static int recalculation(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }
}
