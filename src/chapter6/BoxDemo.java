package chapter6;

public class BoxDemo {

    public static void main(String[] args) {
        Box myBox = new Box();
        Box myBox1 = new Box();

        myBox.setDim(10,20,15);

        double volume = myBox.volume();
        System.out.println(volume);


        myBox1.setDim(3,6,9);


        double volume2 = myBox1.volume();
        System.out.println(volume2);

    }
}
