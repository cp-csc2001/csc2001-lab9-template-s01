/**
 * A node in a mutable singly linked list of ints, as used in lecture.
 *
 * This file is complete - do not change it. (The autograder uses its own
 * copy of Node.java.)
 */
public class Node {

    public int data;
    public Node next;

    /** Creates a node holding data, linked to next. */
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    /** Creates a node holding data, with no next node. */
    public Node(int data) {
        this(data, null);
    }

    /**
     * Builds a new list holding values in the given order, and returns its
     * first node (null if there are no values).
     * Example: Node.fromArray(3, 1, 2) is the list 3 -> 1 -> 2.
     */
    public static Node fromArray(int... values) {
        Node head = null;
        for (int i = values.length - 1; i >= 0; i--) {
            head = new Node(values[i], head);
        }
        return head;
    }

    /**
     * Returns the values in the list starting at head, in order, as a new
     * array. Example: Node.toArray(Node.fromArray(3, 1, 2)) is {3, 1, 2}.
     */
    public static int[] toArray(Node head) {
        int n = 0;
        for (Node cur = head; cur != null; cur = cur.next) {
            n++;
        }
        int[] values = new int[n];
        int i = 0;
        for (Node cur = head; cur != null; cur = cur.next) {
            values[i] = cur.data;
            i++;
        }
        return values;
    }
}
