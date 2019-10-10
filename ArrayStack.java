
import java.util.*;
/**
 * Write a description of class ArrayStack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayStack<T> implements Stack<T>
{
    // instance variables - replace the example below with your own
    private int top = 0;
    T[] arr = (T[]) new Object[10];

    public ArrayStack()
    {}

    public boolean isFull()
    {
        if (top == arr.length)return true;
        return false;
    }
    
    public boolean empty()
    {
        if (top == 0)
            return true;
        return false;
    }
    
    public void push(T item)
    {
        if (isFull())
            arr=Arrays.copyOf(arr, arr.length*2);
        arr[top++] = item;
    }
    
    public T pop() throws Exception
    {
        if(empty())
            throw new Exception("Stack Empty");
        return arr[--top];
    }
    
    public T peek() throws Exception
    {
        if(empty())
            throw new Exception("Stack Empty");
        return arr[top-1];
    }
}
