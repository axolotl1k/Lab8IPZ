import listiterator.*;

/**
 * Demonstrates the usage of LinearList and Iterator with DynamicArrayList and NodeLinkedList implementations.
 */
public class Main {
    public static void main(String[] args) {
        // Using DynamicArrayList
        LinearList dynamicArrayList = new DynamicArrayList();
        dynamicArrayList.add(1);
        dynamicArrayList.add(2);
        dynamicArrayList.add(3);

        Iterator arrayIterator = dynamicArrayList.createIterator();
        System.out.println("DynamicArrayList elements:");
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }

        // Using NodeLinkedList
        LinearList nodeLinkedList = new NodeLinkedList();
        nodeLinkedList.add(10);
        nodeLinkedList.add(20);
        nodeLinkedList.add(30);

        Iterator linkedIterator = nodeLinkedList.createIterator();
        System.out.println("NodeLinkedList elements:");
        while (linkedIterator.hasNext()) {
            System.out.println(linkedIterator.next());
        }
    }
}
