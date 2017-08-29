package com.IFRS.OutOfMemory;

public class StackOutOfMemory implements IOutOfMemory
{
    private static StackOutOfMemory stackOutOfMemory = null;
    
    public static IOutOfMemory GetInstance()
    {
        if (null == stackOutOfMemory)
        {
            stackOutOfMemory = new StackOutOfMemory();
        }
        
        return stackOutOfMemory;
    }
    
    private StackOutOfMemory()
    {
    }
    
    public void Run()
    {
        try
        {
            StackTest();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    private void StackTest()
    {
       StackTest();   
    }
}
