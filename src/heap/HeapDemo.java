package heap;
import java.util.Comparator;

/**
 *
 * @author LTSACH
 */
class IntComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
    
}
public class HeapDemo {
    public static void main(String[] args){
        Heap<Integer> heap = new Heap<>(new IntComparator());
        Integer[] array = {1, 2, 5, 4, 8, 9};
        heap.heapify(array);
        System.out.printf("Find %d, result: %s\n", 4, (heap.contains(4) == true? "found": "not found") );
        System.out.printf("Find %d, result: %s\n", 12, (heap.contains(12) == true? "found": "not found") );
        heap.println();

    }
}