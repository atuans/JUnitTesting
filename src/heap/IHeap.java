package heap;

public interface IHeap<T> {
    public void push(T item);
    public T pop();
    public T peek();
    public void remove(T item);
    public boolean contains(T item);
    public int size();
    public void heapify(T[] array);
    public void clear();
    public boolean empty();
}

