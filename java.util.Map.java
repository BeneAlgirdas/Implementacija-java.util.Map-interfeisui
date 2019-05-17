import java.util.*;

public class MapInterfaceImplementation<K, V> implements java.util.Map<K, V> {

    private ArrayList<K> keys;
    private ArrayList<V> values;
    private V v;

    public MapInterfaceImplementation() {
        keys = new ArrayList();
        values = new ArrayList();

    }
	
    public V put(K k, V v) {
        keys.add(k);
        values.add(v);
        int i = keys.indexOf(k);
        V newElement = values.get(i);
        return newElement;
    }
	
	public V get(Object k) {
        int i = keys.indexOf(k);
        if (i == -1)
            return null;
        return values.get(i);
    }
	
	public V remove(Object k) {
        int i = keys.indexOf(k);
        if (i == -1)
            return null;
        V old = values.get(i);
        keys.remove(i);
        values.remove(i);
        return old;
    }

	public void clear() {
        keys.clear();
        values.clear();
    }

	public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return keys.size();
    }

    public boolean containsKey(Object k) {
        return keys.contains(k);
    }

    public boolean containsValue(Object v) {
        return values.contains(v);
    }

	public Set<K> keySet() {
        return new TreeSet<K>(keys);
    }

    public Collection<V> values() {
        return values;
    }

    public void putAll(Map m) {
        throw new UnsupportedOperationException();
    }

    public Set<Map.Entry<K,V>> entrySet(){
        throw new UnsupportedOperationException();
    }
}