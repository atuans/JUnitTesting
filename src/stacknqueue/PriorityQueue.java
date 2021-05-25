
package stacknqueue;



import heap.Heap;
import java.util.Comparator;
/**
 *
 * @author LTSACH
 */
public class PriorityQueue<T> extends Heap<T> {
    public PriorityQueue(){
        super();
    }
    public PriorityQueue(Comparator<? super T> comparator){
        super(comparator);
    }
}