
package com.mycompany.readnwrite;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Coppy {
    public static void main(String[] arg) throws Throwable{
        try(InputStream in = new FileInputStream("./test.txt");
        InputStreamReader streamReader = new InputStreamReader (in,"UTF-8");
        OutputStream out = new FileOutputStream("./test2.txt");
        OutputStreamWriter streamWriter = new OutputStreamWriter (out,"UTF-8"))
        {
            while(true){
            int b = streamReader.read();
            if(b==-1){
            break;
            }
            
            System.out.print((char)b);
            streamWriter.write((char)b);
        } 
        }
        
    }
    
}
