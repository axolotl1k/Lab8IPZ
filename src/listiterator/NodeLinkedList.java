package listiterator;

import java.util.LinkedList;

/**
 * Implements the LinearList interface using a linked list as the underlying data structure.
 */
public class NodeLinkedList implements LinearList {
    private final LinkedList<Integer> elements = new LinkedList<>();

    /**
     * Adds an integer to the linked list.
     *
     * @param value the integer to add to the list
     */
    @Override
    public void add(int value) {
        elements.add(value);
    }

    /**
     * Retrieves the integer at the specified index.
     *
     * @param index the position of the element to retrieve
     */
    @Override
    public int get(int index) {
        return elements.get(index);
    }

    /**
     * Counts the total number of elements in the linked list.
     */
    @Override
    public int size() {
        return elements.size();
    }

    /**
     * Creates an iterator for sequential traversal of the linked list.
     */
    @Override
    public Iterator createIterator() {
        return new NodeLinkedListIterator(this);
    }
}
