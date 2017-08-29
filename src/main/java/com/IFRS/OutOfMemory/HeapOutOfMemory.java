package com.IFRS.OutOfMemory;

import java.util.ArrayList;
import java.util.List;

public class HeapOutOfMemory implements IOutOfMemory
{
    private static HeapOutOfMemory heapOutOfMemory = null;
    
    public static IOutOfMemory GetInstance()
    {
        if (null == heapOutOfMemory)
        {
            heapOutOfMemory = new HeapOutOfMemory();
        }
        
        return heapOutOfMemory;
    }
    
    private HeapOutOfMemory()
    {}
    
    public void Run()
    {
        try
        {
            HeapTest();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    private void HeapTest()
    {
        List<Memory> l_MemoryList = new ArrayList<Memory>();
        while (true)
        {
            Memory l_Memory = new Memory();
            l_MemoryList.add(l_Memory);
        }
    }
}
