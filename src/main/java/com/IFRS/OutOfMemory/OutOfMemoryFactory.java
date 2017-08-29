package com.IFRS.OutOfMemory;

public class OutOfMemoryFactory
{
    public static IOutOfMemory GetInstance(MemoryType a_Type)
    {
        IOutOfMemory outOfMemory = null;
        
        switch(a_Type)
        {
        case HEAP:
            outOfMemory = HeapOutOfMemory.GetInstance();
            break;
        case STACK:
            outOfMemory = StackOutOfMemory.GetInstance();
            break;
        default:
            break;           
        }
        
        return outOfMemory;
    }
}
