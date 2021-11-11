public abstract class PhanTu<T> {
    public T t; // element type T

    /**
     * method to compare two elements.
     * @param a T a
     * @return boolean if t is greater than a
     */
    abstract public boolean isGreaterThan(T a);
}
