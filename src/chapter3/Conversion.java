package chapter3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Conversion {

    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nfrom double to int. ");
        b = (byte) i;

        System.out.println("i and b " + i + " " + b);

        System.out.println("\nfrom double to int ");
        i = (int) d;
        System.out.println("d and i " + d + " " + i);

        System.out.println("\nfrom double to byte");
        b = (byte) d;
        System.out.println("d and b " + d + " " + b);




    }


}
