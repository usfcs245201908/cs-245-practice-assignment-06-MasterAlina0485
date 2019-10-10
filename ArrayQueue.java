import java.util.*;
/**
 * Write a description of class ArrayQueue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayQueue<T> implements Queue<T>
{
    // instance variables - replace the example below with your own
    private int start= 0;
    private int end= 0; 
    private int length = 0;
    T[] arr = (T[]) new Object[10];

    public ArrayQueue(){}
    
    public boolean empty()
    {
        if (length == 0)     return true;
        return false;
    }
    
    private boolean isFull()
    {
        if (length == arr.length)   return true;
        return false;
    }
    
    private void expandArray()
    {
        T[] dupe = (T[]) new Object[arr.length*2];
        for (int i = 0; i<length; i++)
        {
            dupe[i] = arr[start]; 
            start++;
            if (start == arr.length)    start = 0;
        }
        start = 0;
        end = length;
        arr = dupe; 
    }
    
    public void enqueue (T item)
    {
        if (isFull())
            expandArray();
        if (end == arr.length)
            end = 0; 
        length ++;
        arr[end++] = item;
    }
    
    public T dequeue () throws Exception
    {
        if(empty())
            throw new Exception("Queue Empty");
        length --; 
        return arr[start++];
    }
}
