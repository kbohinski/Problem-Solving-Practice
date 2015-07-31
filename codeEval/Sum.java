/**
 * @author Kevin Bohinski <bohinsk1@tcnj.edu>
 * @version 1.0
 * @since 2015-7-30
 *  
 * Problem-Solving-Practice/codeEval
 * Sum.java
 * Copyright (c) 2015 Kevin Bohinski. All rights reserved.
 */

/* Setting Imports */
import java.io.*;

public class Sum {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            char[] tmp = line.toCharArray();
            int total = 0;
            for (int i = 0; i < tmp.length; i++) {
                total += (Integer.parseInt(String.valueOf(tmp[i])));
            }
            System.out.println(total);
        }
    }
}
