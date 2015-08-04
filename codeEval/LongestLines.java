/**
 * @author Kevin Bohinski <bohinsk1@tcnj.edu>
 * @version 1.0
 * @since 2015-8-4
 *  
 * Problem-Solving-Practice/codeEval
 * LongestLines.java
 * Copyright (c) 2015 Kevin Bohinski. All rights reserved.
 */

/* Setting Imports */
import java.io.*;
import java.util.*;

public class LongestLines {
    
    public static void main (String[] args) throws IOException {
        
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        int n = 0;
        ArrayList<String> data = new ArrayList<String>();
        
        while ((line = buffer.readLine()) != null) {
            data.add(line);
        }
        
        n = Integer.parseInt(data.get(0));
        data.remove(0);
        
        Collections.sort(data, new Comparator<String>() {
            public int compare(String a, String b) {
                return -1 * (a.length() - b.length());
            }
        });
        
        for (int i = 0; i < n; i++) {
            System.out.println(data.get(i));
        }
    }
    
}
