package com.IFRS.OutOfMemory;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<Memory> l_MemoryList = new ArrayList<Memory>();
        while (true)
        {
        	Memory l_Memory = new Memory();
        	l_MemoryList.add(l_Memory);
        }
    }
}
