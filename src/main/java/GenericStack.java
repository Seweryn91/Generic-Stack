public class GenericStack<T> {

    private Object[] array;
    private int size;
    private int top;

    public GenericStack(int size) {
        if (size < 1) {
            throw new IllegalArgumentException("Stack must be size of 1 or higher!");
        }

        this.size = size;
        this.top = -1;
        this.array = new Object[size];
    }

    public T push(T item){ return item; }

    public T pop(){}

    public int size() { return this.size; }

}

