package com.IFRS.OutOfMemory;

import java.io.IOException;
import java.util.Scanner;

public class Host
{
    public Host()
    {}
    
    private void PrintUsage()
    {
        String usage = "Memory Type: Heap - 1, Stack - 2";
        System.out.println(usage);
    }
    
    public void Run() throws IOException
    {
        Scanner in = new Scanner(System.in);
        int type = 0;
        IOutOfMemory outOfMemory = null;
        MemoryType memoryType = MemoryType.NONE;
        while (true)
        {
            if (MemoryType.NONE == memoryType)
            {
                PrintUsage();
            }
            type = in.nextInt();
            memoryType = MemoryType.GetEnum(type);
            if (MemoryType.NONE != memoryType)
            {
                outOfMemory = OutOfMemoryFactory.GetInstance(memoryType);
                if (null != outOfMemory)
                {
                    outOfMemory.Run();
                }
            }
        }
    }
}
