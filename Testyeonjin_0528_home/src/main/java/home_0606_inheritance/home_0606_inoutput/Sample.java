package home_0606_inheritance.home_0606_inoutput;

import java.io.IOException;
import java.io.InputStream;

public class Sample {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;

        int a;
        int b;
        int c;

        a= in.read();
        b= in.read();
        c= in.read();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

}
