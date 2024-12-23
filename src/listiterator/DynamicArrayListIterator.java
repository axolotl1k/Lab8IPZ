package listiterator;

/**
 * Provides sequential traversal for a DynamicArrayList instance.
 */
public class DynamicArrayListIterator implements Iterator {
    private final DynamicArrayList list;
    private int currentIndex = 0;

    /**
     * Initializes the iterator with the given DynamicArrayList.
     *
     * @param list the DynamicArrayList to traverse
     */
    public DynamicArrayListIterator(DynamicArrayList list) {
        this.list = list;
    }

    /**
     * Checks if there are more elements to traverse in the list.
     */
    @Override
    public boolean hasNext() {
        return currentIndex < list.size();
    }

    /**
     * Moves the iterator to the next element and retrieves its value.
     */
    @Override
    public int next() {
        return list.get(currentIndex++);
    }
}
