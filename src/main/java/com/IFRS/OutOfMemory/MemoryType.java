package com.IFRS.OutOfMemory;

public enum MemoryType
{
    NONE(0),HEAP(1),STACK(2);
    
    private int type;
    private MemoryType(int type)
    {
        this.type = type;
    }
    
    public static MemoryType GetEnum(int type)
    {
        MemoryType memoryType = null;
        switch(type)
        {
        case 1:
            memoryType = HEAP;
            break;
        case 2:
            memoryType = STACK;
            break;
        default:
            memoryType = NONE;
            break;
        }
        return memoryType;
    }
}
