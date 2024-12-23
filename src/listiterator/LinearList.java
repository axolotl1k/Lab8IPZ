package listiterator;

/**
 * Represents a linear list of integers.
 * Allows adding elements, retrieving elements by index, and creating an iterator for traversal.
 */
public interface LinearList {

    /**
     * Creates an iterator for sequential traversal of the list.
     */
    Iterator createIterator();

    /**
     * Adds an integer to the list.
     *
     * @param value the integer to add to the list
     */
    void add(int value);

    /**
     * Retrieves the integer at the specified index.
     *
     * @param index the position of the element to retrieve
     */
    int get(int index);

    /**
     * Counts the total number of elements in the list.
     */
    int size();
}
