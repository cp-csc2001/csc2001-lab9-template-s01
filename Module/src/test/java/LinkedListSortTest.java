import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for LinkedListSort.
 *
 * Many tests use the example from lecture as a list:
 *     38 -> 27 -> 43 -> 3 -> 9 -> 82 -> 3 -> 10
 * The two 3s are different Node objects, so the tests can check which
 * one ends up first (stability) and that the sorts only relink nodes.
 *
 * The helpers nodesOf and assertSameNodes are there for your own tests.
 *
 * These starter tests (with these exact names) should all pass by the
 * time you're done. They are NOT enough on their own - add your own
 * tests (see the TODO list at the bottom and the lab handout).
 */
public class LinkedListSortTest {

    /** The nodes of the list starting at head, in order. */
    private static Node[] nodesOf(Node head) {
        Node[] nodes = new Node[Node.toArray(head).length];
        int i = 0;
        for (Node cur = head; cur != null; cur = cur.next) {
            nodes[i] = cur;
            i++;
        }
        return nodes;
    }

    /** Checks that the list starting at head holds exactly the given Node objects (in any order). */
    private static void assertSameNodes(Node[] expected, Node head) {
        IdentityHashMap<Node, Integer> count = new IdentityHashMap<>();
        for (Node n : expected) {
            count.merge(n, 1, Integer::sum);
        }
        for (Node cur = head; cur != null; cur = cur.next) {
            Integer c = count.get(cur);
            assertNotNull(c, "the result has a node that was not in the original list");
            if (c == 1) {
                count.remove(cur);
            } else {
                count.put(cur, c - 1);
            }
        }
        assertTrue(count.isEmpty(), "some original nodes are missing from the result");
    }

    // ---- starter tests ----

    @Test
    void middleLectureExample() {
        Node head = Node.fromArray(38, 27, 43, 3, 9, 82, 3, 10);
        assertSame(nodesOf(head)[3], LinkedListSort.middle(head));
    }

    @Test
    void mergeLectureExample() {
        Node a = Node.fromArray(3, 27, 38, 43);
        Node b = Node.fromArray(3, 9, 10, 82);
        Node aThree = a;
        Node bThree = b;
        Node[] all = concat(nodesOf(a), nodesOf(b));
        Node result = LinkedListSort.merge(a, b);
        assertArrayEquals(new int[]{3, 3, 9, 10, 27, 38, 43, 82}, Node.toArray(result));
        assertSame(aThree, result);              // on a tie, a's node comes first
        assertSame(bThree, result.next);
        assertSameNodes(all, result);            // relinked, not copied
    }

    @Test
    void mergeSortLectureExample() {
        Node head = Node.fromArray(38, 27, 43, 3, 9, 82, 3, 10);
        Node[] before = nodesOf(head);
        Node result = LinkedListSort.mergeSort(head);
        assertArrayEquals(new int[]{3, 3, 9, 10, 27, 38, 43, 82}, Node.toArray(result));
        assertSameNodes(before, result);
    }

    @Test
    void removeDuplicatesExample() {
        Node head = Node.fromArray(3, 3, 9, 10, 10, 10);
        assertArrayEquals(new int[]{3, 9, 10}, Node.toArray(LinkedListSort.removeDuplicates(head)));
    }

    /** a followed by b, as one array. */
    private static Node[] concat(Node[] a, Node[] b) {
        Node[] all = Arrays.copyOf(a, a.length + b.length);
        System.arraycopy(b, 0, all, a.length, b.length);
        return all;
    }

    // TODO: add your own tests. At a minimum, cover:
    //   - middle: null, 1 node, 2 nodes, an odd length, and that it doesn't change the list
    //   - merge: empty lists, one list entirely before the other, and ties
    //     coming from the first list (check Node objects with assertSame)
    //   - mergeSort: empty, one node, two nodes, sorted, reverse-sorted, duplicates
    //   - mergeSort is stable: the first 3 node of the lecture example ends up first
    //   - mergeSort only relinks: same Node objects (assertSameNodes), data unchanged
    //   - many random lists compared with Arrays.sort, and a large list (200,000 values)
    //   - removeDuplicates keeps the FIRST node of each run (assertSame),
    //     null, one node, all equal, no duplicates, a run at the end, and an unsorted list
}
