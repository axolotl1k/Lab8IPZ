package listiterator;

/**
 * Defines a contract for traversing a collection sequentially.
 */
public interface Iterator {

    /**
     * Checks if there are more elements available in the collection.
     */
    boolean hasNext();

    /**
     * Moves to the next element in the collection and retrieves its value.
     */
    int next();
}
