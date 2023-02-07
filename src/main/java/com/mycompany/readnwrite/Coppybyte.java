
package com.mycompany.readnwrite;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Coppybyte {
    
    public static void main(String[] arg)throws Throwable{
        try(InputStream in = new FileInputStream("./test.txt");
//        InputStreamReader streamReader = new InputStreamReader (in,"UTF-8");
        OutputStream out = new FileOutputStream("./test3.txt")){
            while(true){
            int b = in.read();
            if(b==-1){
            break;
            }
            
            System.out.print(b);
            out.write(b);
        }
        }
        
    }
    
}
