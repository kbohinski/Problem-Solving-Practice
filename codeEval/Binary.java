/**
 * @author Kevin Bohinski <bohinsk1@tcnj.edu>
 * @version 1.0
 * @since 2015-7-30
 *  
 * Problem-Solving-Practice/codeEval
 * Binary.java
 * Copyright (c) 2015 Kevin Bohinski. All rights reserved.
 */

/* Setting Imports */
import java.io.*;

public class Binary {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            System.out.println(changeBase(2, Integer.parseInt(line)));
        }
    }
    
    public static String changeBase(int base, int inputNum){
		    int quotient = (inputNum/base);
		    int remainder = (inputNum%base);

		    if ((inputNum/base) == 0) {
			    return "" + remainder;
		    } else {
			    return ("" + changeBase(base,quotient) + remainder);
		    }
	}
}
