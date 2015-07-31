/**
 * @author Kevin Bohinski <bohinsk1@tcnj.edu>
 * @version 1.0
 * @since 2015-7-30
 *  
 * Problem-Solving-Practice/codeEval
 * Stack.java
 * Copyright (c) 2015 Kevin Bohinski. All rights reserved.
 */

/* Setting Imports */
import java.io.*;

public class Stack {
    
    static int[] stk = new int[100];
    static int head = -1;
    
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] tmp = line.split(" ");
            for (String in : tmp) {
                push(Integer.parseInt(in));
            }
            
            boolean print = true;
            while (!isEmpty()) {
                if (print) {
                    System.out.print(pop() + " ");
                } else {
                    pop();
                }
                print = !print;
            }
         
            System.out.println("");   
        }
    }
    
    public static void push(int element) {
        head++;
        stk[head] = element;
    }
    
    public static int pop() {
        int tmp = stk[head];
        head--;
        return tmp;
    }
    
    public static boolean isEmpty() {
        if (head == -1) {
            return true;
        } else {
            return false;
        }
    }
}
