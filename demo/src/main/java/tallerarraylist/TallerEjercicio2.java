package tallerarraylist;

   
    public class TallerEjercicio2<T> {
    private Object[] elements;
    private int size;
    
    public TallerEjercicio2(int capacity) {
        elements = new Object[capacity];
        size = 0;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public void add(T element) {
        if (size < elements.length) {
            elements[size] = element;
            size++;
        }
    }
    
    public int size() {
        return size;
    }
    
    public static void main(String[] args) {
        TallerEjercicio2<String> customList = new TallerEjercicio2<>(10);

        System.out.println("Is the list empty? " + customList.isEmpty());

        customList.add("Item 1");
        customList.add("Item 2");

        System.out.println("Is the list empty? " + customList.isEmpty());
        System.out.println("List size: " + customList.size());
    }
}