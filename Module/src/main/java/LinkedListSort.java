/**
 * Merge sort on a mutable singly linked list of Nodes, plus removing
 * duplicates from a sorted list.
 *
 * Every method works by changing next references only:
 *   - never change a node's data
 *   - never create a new Node, except the one sentinel node in merge
 *   - do not use arrays, ArrayList, or any library sort
 *
 * Do not rename the class, the public methods, or change their
 * parameters/return types. You may add private helper methods.
 */
public class LinkedListSort {

    /**
     * Returns the last node of the first half of the list: for a list of n
     * nodes, the node at position (n - 1) / 2, counting from 0. Uses a slow
     * pointer (one step at a time) and a fast pointer (two steps at a time),
     * starting with slow = head and fast = head.next.
     * Returns head if the list has one node, and null if head is null.
     * Example: for 38 -> 27 -> 43 -> 3 -> 9 -> 82 -> 3 -> 10 it returns the
     * 4th node (the first 3).
     */
    public static Node middle(Node head) {
        // TODO
        return head;
    }

    /**
     * Merges two sorted lists into one sorted list by relinking their nodes,
     * and returns its first node. On a tie, the node from a comes first.
     * Uses one sentinel node in front of the result. Either list may be
     * null (empty).
     */
    public static Node merge(Node a, Node b) {
        // TODO: use a sentinel node in front of the result
        return null;
    }

    /**
     * Sorts the list into ascending order with merge sort and returns its new
     * first node: find the middle, cut the list in two after it, sort each
     * half recursively, and merge them. The sort is stable: equal values keep
     * their original order. A list of 0 or 1 nodes is returned unchanged.
     */
    public static Node mergeSort(Node head) {
        // TODO: middle, cut, two recursive calls, merge
        return head;
    }

    /**
     * Removes every node whose value equals the value of the node before it,
     * by relinking, and returns the first node of the list. On a sorted list
     * this leaves one node per value - the FIRST node of each run of equal
     * values. (On an unsorted list, only neighbors that are equal are
     * removed.) Returns null if head is null.
     * Example: 3 -> 3 -> 9 -> 10 -> 10 -> 10 becomes 3 -> 9 -> 10.
     */
    public static Node removeDuplicates(Node head) {
        // TODO
        return head;
    }
}
