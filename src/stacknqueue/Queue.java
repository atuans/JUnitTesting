package stacknqueue;

import list.DLinkedList;
import java.util.List;

/**
 *
 * @author LTSACH
 */
public class Queue<T>{
    private List<T> list; 
    public Queue(){
        /*
        Your are required to use: DLinkedList, SLinkedList or MyArrayList
        At begning, you can use java.util.LinkedList for test, but have to change to the above classes
        */
        this.list = new DLinkedList<>();
    }
    public void push(T item){
        /*YOUR CODE HERE*/
    }
    public T pop(){
        /*YOUR CODE HERE*/
        return null; //should remove this line
    }
    public T peek(){
        /*YOUR CODE HERE*/
        return null; //should remove this line
    }
    public boolean contains(T item){
        /*YOUR CODE HERE*/
        return false; //should remove this line
    }
    public boolean empty(){
        return this.list.isEmpty();
    }
    public int size(){
        return this.list.size();
    }
}