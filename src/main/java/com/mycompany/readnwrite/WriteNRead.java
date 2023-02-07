
package com.mycompany.readnwrite;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class WriteNRead {

    public static void main(String[] args) throws Throwable{
        try(OutputStream out = new FileOutputStream("./test.txt");
        OutputStreamWriter streamWriter = new OutputStreamWriter (out,"UTF-8"))
        { streamWriter.write("Hello");
        }
        
        try(InputStream in = new FileInputStream("./test.txt");
        InputStreamReader streamReader = new InputStreamReader (in,"UTF-8"))
        {
            while(true){
            int b = streamReader.read();
            if(b==-1){
            break;
            }
            System.out.print((char)b);
        } 
        }
        }
        
    }

