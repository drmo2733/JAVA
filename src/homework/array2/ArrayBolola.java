package homework.array2;

public class ArrayBolola {
    public static void main(String[] args) {
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};

        int count = 0;
        for (int i = 0; i < bolola.length; i++) {
            char c = bolola[i];
            if (c == 'o') {
                count++;
            }
        }
        System.out.println("count of o = " + count);


        char[] bololaa = {'b', 'o', 'l', 'o', 'l', 'a'};
        System.out.print(bololaa[bololaa.length / 2 - 1]);
        System.out.println(bololaa[bololaa.length / 2]);


        char[] bollola = {'b', 'o', 'l', 'o', 'l', 'a'};
        if (bollola.length - 2 == 'l' && bollola.length - 1 == 'y') {
            System.out.println("true");
        } else {
            System.out.println("false");
        }



    }

}
