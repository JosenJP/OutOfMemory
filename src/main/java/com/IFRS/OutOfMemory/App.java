package com.IFRS.OutOfMemory;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{   
    public static void main( String[] args )
    {
        Host host = new Host();
        try
        {
            host.Run();
        } 
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
