/**
 * @author Kevin Bohinski <bohinsk1@tcnj.edu>
 * @version 1.0
 * @since 2015-7-30
 *  
 * Problem-Solving-Practice/codeEval
 * FizzBuzz.java
 * Copyright (c) 2015 Kevin Bohinski. All rights reserved.
 */

/* Setting Imports */
import java.io.*;

public class FizzBuzz {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        
        while ((line = buffer.readLine()) != null) {
            String[] in = line.split(" ");
            int fizz = Integer.parseInt(in[0]);
            int buzz = Integer.parseInt(in[1]);
            int n = Integer.parseInt(in[2]);
            
            for (int i = 1; i <= n; i++) {
                if (i % fizz == 0 && i % buzz == 0) {
                    System.out.print("FB");
                } else if (i % fizz == 0) {
                    System.out.print("F");
                } else if (i % buzz == 0) {
                    System.out.print("B");
                } else {
                    System.out.print(i);
                }
                System.out.print(" ");
            }
            
            System.out.println("");
        }
    }
}
