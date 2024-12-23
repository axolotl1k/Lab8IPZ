package listiterator;

import java.util.ArrayList;

/**
 * Implements the LinearList interface using a dynamic array as the underlying data structure.
 */
public class DynamicArrayList implements LinearList {
    private final ArrayList<Integer> elements = new ArrayList<>();

    /**
     * Adds an integer to the list.
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
     * Counts the total number of elements in the list.
     */
    @Override
    public int size() {
        return elements.size();
    }

    /**
     * Creates an iterator for sequential traversal of the dynamic array.
     */
    @Override
    public Iterator createIterator() {
        return new DynamicArrayListIterator(this);
    }
}
