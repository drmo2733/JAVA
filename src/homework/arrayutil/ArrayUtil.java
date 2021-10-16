package homework.arrayutil;


public class ArrayUtil {
    public static void main(String[] args) {
//        1
        int[] array = {7, 18, 22, 28, 33, 38, 55, 65, 73, 99};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
//        2
        int maximum;
        maximum = array[0];

        for (int i = 1; i < array.length; i++) {

            if (array[i] > maximum) {
                maximum = array[i];
            }
        }
        System.out.println("maximum = " + maximum);

//        3
        int minimum;
        minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }

        }
        System.out.println("minimum = " + minimum);

//        4


        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {

                System.out.println(array[i]);
            }
        }

//          5

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }



        }


    }


