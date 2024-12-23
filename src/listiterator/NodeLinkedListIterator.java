package listiterator;

/**
 * Provides sequential traversal for a NodeLinkedList instance.
 */
public class NodeLinkedListIterator implements Iterator {
    private final NodeLinkedList list;
    private int currentIndex = 0;

    /**
     * Initializes the iterator with the given NodeLinkedList.
     *
     * @param list the NodeLinkedList to traverse
     */
    public NodeLinkedListIterator(NodeLinkedList list) {
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
