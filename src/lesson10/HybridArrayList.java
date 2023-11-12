package lesson10;
import java.util.*;
public class HybridArrayList implements Iterable, HybridIterable {
    private final List<Object> hList = new ArrayList<>();
    public final static int DEFAULT_CAPACITY = 10;
    private int size;
    private int dynamicCapacity;
    public HybridArrayList() {
        this.dynamicCapacity = DEFAULT_CAPACITY;
    }
    public HybridArrayList(int dynamicCapacity) {
        this.dynamicCapacity = dynamicCapacity;
    }
    @Override
    public Iterator iterator() {
        return hList.iterator();
    }
    @Override
    public void remove() {
    }
    @Override
    public int size() {
        return size;
    }
    @Override
    public boolean isEmpty() {
        if (size == 0){
            return true;
        }
        else{
            return false;
        }

    }
    @Override
    public boolean contains(Object o) {
        return false;
    }
    @Override
    public boolean add(Object b) {
        size++;
        hList.add(b);
        return true;
    }
    @Override
    public boolean remove(Object b) {
        size--;
        hList.remove(b);
        return true;
    }
    @Override
    public void clear() {
        size = 0;
        hList.clear();
    }
    @Override
    public Object get(int index) {
        return hList.get(index);
    }
    @Override
    public String toString() {
        return "HybridArrayList{" +
                "hList=" + hList +
                ", size=" + size +
                ", dynamicCapacity=" + dynamicCapacity +
                '}';
    }
}
