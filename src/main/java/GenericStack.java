public class GenericStack<T> {

    private Object[] array;
    private int size;
    private int top;

    public GenericStack(int size) { }

    public T push(T item){ return item; }

    public T pop(){}

    public int size() { return this.size; }

}

