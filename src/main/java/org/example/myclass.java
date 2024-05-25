//package org.example;
//
//import java.util.*;
//
//public class myclass {
//    public static void qwe(int[] y) {
//        int l = 0;
//        int r = y.length - 1;
//        int max = 0;
//        int currentMax = 0;
//
//        while (l < r) {
//            currentMax = (r - l) * Math.min(y[l], y[r]);
//            if (currentMax > max) {
//                max = currentMax;
//            }
//
//            if (y[l] <= y[r]) {
//                l++;
//            } else {
//                r--;
//            }
//        }
//
//        System.out.println(max);
//    }
//
//    public static void main(String[] args) {
//        int[] y = {1, 8, 6, 2, 5, 4, 8, 3, 7};
//
//        LinkedList<myclass> list = new LinkedList<>();
//
//        MyLinkedList<Integer> intgs = new MyLinkedList<>();
//
//        intgs.add(2);
//        intgs.add(1);
//        intgs.add(10);
//        Solution sol = new Solution();
//
//        ListNode listNode5 = new ListNode(5);
//        ListNode listNode4 = new ListNode(4, listNode5);
//        ListNode listNode3 = new ListNode(3, listNode4);
//        ListNode listNode2 = new ListNode(2, listNode3);
//        ListNode listNode1 = new ListNode(1, listNode2);
//
//        ListNode qwe = new ListNode(2);
//        ListNode asd = new ListNode(1, qwe);
//
//        ListNode q1 = new ListNode(3);
//        ListNode q2 = new ListNode(2, q1);
//        ListNode q3 = new ListNode(1, q2);
//
//
//        ListNode q = sol.removeNthFromEnd(asd, 2);
//        ListNode qw = sol.removeNthFromEnd(listNode1, 2);
//        ListNode asdczx = sol.removeNthFromEnd(q3, 3);
//
////        sol.read(qw);
////        System.out.println();
////        sol.read(q);
////        System.out.println();
////        sol.read(asdczx);
//
//        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
//
//        myLinkedList.add(3);
//        myLinkedList.add(3);
//        myLinkedList.add(3);
//        myLinkedList.add(3);
//
//        ListNode listNode = new ListNode();
//
//        listNode.addEl(3);
//        listNode.addEl(8);
//        listNode.addEl(5);
//        listNode.addEl(7);
//        listNode.addEl(7);
//
//        ListNode listNode22 = new ListNode();
//
//        listNode22.addEl(3);
//        listNode22.addEl(8);
//        listNode22.addEl(5);
//        listNode22.addEl(7);
//        listNode22.addEl(7);
//
////        listNode.read();
//
//        ListNode asdads = listNode.middleNode(listNode);
//
//        ListNode[] lol = {listNode, listNode22};
//        // [-21, 10, 17, 8, 4, 26, 5, 35, 33, -7, -16, 27, -12, 6, 29, -12, 5, 9, 20, 14, 14, 2, 13, -24, 21, 23, -21, 5]
//
//        ListNode muMode =
//                new ListNode(10,
//                        new ListNode(17,
//                                new ListNode(8,
//                                        new ListNode(4,
//                                                new ListNode(26,
//                                                        new ListNode(5,
//                                                                new ListNode(35,
//                                                                        new ListNode(33,
//                                                                                new ListNode(-7,
//                                                                                        new ListNode(-16,
//                                                                                                new ListNode(27,
//                                                                                                        new ListNode(-12,
//                                                                                                                new ListNode(6,
//                                                                                                                        new ListNode(29,
//                                                                                                                                new ListNode(-12,
//                                                                                                                                        new ListNode(5,
//                                                                                                                                                new ListNode(9,
//                                                                                                                                                        new ListNode(20,
//                                                                                                                                                                new ListNode(14,
//                                                                                                                                                                        new ListNode(14,
//                                                                                                                                                                                new ListNode(2,
//                                                                                                                                                                                        new ListNode(13,
//                                                                                                                                                                                                new ListNode(-24,
//                                                                                                                                                                                                        new ListNode(21,
//                                                                                                                                                                                                                new ListNode(23,
//                                                                                                                                                                                                                        new ListNode(-21,
//                                                                                                                                                                                                                                new ListNode(5)))))))))))))))))))))))))));
//
//
//        ListNode qweasdzxc = sol.mergeKLists(new ListNode[]{new ListNode(-21, muMode)});
////        ListNode qweasdzxc = sol.mergeKLists(new ListNode[] {new ListNode(2), new ListNode(), new ListNode(-1)});
////        ListNode qweasdzxc = sol.mergeKLists(new ListNode[]{new ListNode(3), new ListNode(2)});
//        HashMap<Integer, Integer> hashMap = new HashMap<>(2, 2);
////        sol.read(qweasdzxc)
//
//
//        ListNode temp = new ListNode(3);
//
//        ListNode saekwg = new ListNode(3, new ListNode(2, new ListNode(0, new ListNode(-4))));
//
//
//        //3,2,0,-4
//
//        String digits = "234";
//        List<String> res = Solution.letterCombinations(digits);
//
//        boolean sadzxccxz = sol.hasCycle(muMode);
//
//        System.out.println(sadzxccxz);
////        res.forEach(System.out::println);
//
//    }
//}
//
//class Solution {
//
//    public static List<String> letterCombinations(String digits) {
//        Map<Integer, String> map = new HashMap<>(Map.of(
//                2, "abc",
//                3, "def",
//                4, "ghi",
//                5, "jkl",
//                6, "mno",
//                7, "pqrs",
//                8, "tuv",
//                9, "wxyz"
//
//        ));
//
//        List<String> result = new ArrayList<>();
//
//        for (int i = digits.length() - 1; i >= 0; i--) {
//            StringBuilder stringBuilder = new StringBuilder();
//            int temp = Character.getNumericValue(digits.charAt(i)); // 4
//
//            // 234
//        }
//
//        return result;
//    }
//
////    public ListNode reverseKGroup(ListNode head, int k) {
////        ListNode cur = head;
////        int temp = 0;
////
////        ListNode prev = null;
////
////        while(temp < k) {
////            if(cur.next == null) return head;
////
////            ListNode x = null;
////
////            while (cur != null) {
////                ListNode next = cur.next;
////
////                cur.next = prev;
////
////                prev = cur;
////
////                cur = next;
////            }
////
////            ++temp;
////            cur = cur.next;
////        }
////
////        // [1,2,3,4,5]
////    }
//
//    public boolean hasCycle(ListNode head) {
//        Set<ListNode> set = new HashSet<>();
//
//        while (head != null) {
//            if(set.contains(head)) {
//                return true;
//            }
//
//            set.add(head);
//
//            head = head.next;
//        }
//
//        return false;
//    }
//
////    public boolean hasCycle(ListNode head) {
////        if (head == null) {
////            return false;
////        }
////
////        ListNode curNode = head;
////
////        while (curNode.next != null) {
////            ListNode temp = curNode;
////            ListNode temp2 = curNode;
////
////            while (temp2.next != null) {
////                if (temp2.next == temp) {
////                    return true;
////                }
////
////                temp2 = temp2.next;
////            }
////
////            curNode = curNode.next;
////        }
////
////        // 4 5 6 5
////
////        return false;
////    }
//
//    public ListNode reverseList(ListNode head) {
//        if (head == null) return null;
//
//        ListNode prev = null;
//        ListNode cur = head;
//
//        while (cur != null) {
//            ListNode next = cur.next;
//
//            cur.next = prev;
//
//            prev = cur;
//
//            cur = next;
//        }
//
//        return prev;
//
//    }
//
//    /*   while (i < integerList.size()) {
//            ListNode newNode = new ListNode(integerList.get(i));
//            ListNode x = head;
//
//            while (x.next != null) {
//                x = x.next;
//            }
//            x.next = newNode;
//            ++i;
//        } */
//
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        if (head == null || head.next == null) {
//            return null;
//        }
//
//        ListNode currentNode = head;
//        ListNode currentNode2 = head;
//
//        int size = 0;
//
//        while (currentNode.next != null) {
//            ++size;
//            currentNode = currentNode.next;
//        }
//
//        int i = 0;
//
//        while (head.next != null) {
//            if (size + 1 == n) {
//                head = head.next;
//                currentNode2 = head;
//                break;
//            }
//
//            if (i == size - n) {
//                head.next = head.next.next;
//            } else {
//                head = head.next;
//            }
//            ++i;
//        }
//
//        return currentNode2;
//    }
//
//
//    public void read(ListNode head) {
//        ListNode listNode = head;
//        while (listNode.next != null) {
//            System.out.println(listNode.val);
//            listNode = listNode.next;
//        }
//        System.out.println(listNode.val);
//    }
//
//    public ListNode mergeKLists(ListNode[] lists) {
//        List<ListNode> myList = new ArrayList<>(Arrays.stream(lists).toList());
//
//        if (myList.isEmpty()) {
//            return null;
//        }
//
//        if (myList.size() == 1 && myList.get(0) != null) {
//            return myList.get(0);
//        }
//
//        if (myList.size() < 1) {
//            return myList.get(lists.length - 1);
//        }
//
//        List<Integer> integerList = new ArrayList<>();
//
//        for (int i = 0; i < lists.length; i++) {
//            if (isEmpty(lists[i])) {
//                continue;
//            }
//            ListNode temp = lists[i];
//            while (temp.next != null) {
//                integerList.add(temp.val);
//                temp = temp.next;
//            }
//            integerList.add(temp.val);
//        }
//
//        if (integerList.isEmpty()) {
//            return null;
//        }
//
//        if (integerList.size() == 1 && integerList.get(0) != null) {
//            return myList.get(integerList.size());
//        }
//        Collections.sort(integerList);
//
//        ListNode head = new ListNode(integerList.get(0), new ListNode(integerList.get(1)));
//        int i = 2;
//
//        while (i < integerList.size()) {
//            ListNode newNode = new ListNode(integerList.get(i));
//            ListNode x = head;
//
//            while (x.next != null) {
//                x = x.next;
//            }
//            x.next = newNode;
//            ++i;
//        }
//
//        return head;
//    }
//
//    public static boolean isEmpty(ListNode head) {
//        if (head == null) return true;
//        return false;
//    }
//}
//
//
//class ListNode {
//    ListNode head;
//    public int val;
//    ListNode next;
//
//    ListNode() {
//    }
//
//    ListNode(int val) {
//        this.val = val;
//    }
//
//    ListNode(int val, ListNode next) {
//        this.val = val;
//        this.next = next;
//    }
//
//    public void addEl(int el) {
//        ListNode newNode = new ListNode(el);
//        ListNode x = head;
//
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//
//        while (x.next != null) {
//            x = x.next;
//        }
//        x.next = newNode;
//    }
//
//    public void remove(int val) {
//        ListNode currentNode = head;
//
//        if (head.val == val) {
//            head = head.next;
//            return;
//        }
//
//        while (currentNode.next != null) {
//            if (currentNode.next.val == val) {
//                currentNode.next = currentNode.next.next;
//                return;
//            } else {
//                currentNode = currentNode.next;
//            }
//        }
//
//        // 1, 2, 3, 4
//    }
//
//    public ListNode middleNode(ListNode head) {
//        ListNode currentNode = head;
//        int size = 0;
//
//        while (currentNode.next != null) {
//            ++size;
//            currentNode = currentNode.next;
//        }
//        ++size;
//        int i = 0;
//
//        while (i < size / 2) {
//            head.next = head.next.next;
//            ++i;
//        }
//
//        return head;
//    }
//
//    public void read() {
//        ListNode listNode = head;
//        while (listNode.next != null) {
//            System.out.println(listNode.val);
//            listNode = listNode.next;
//        }
//        System.out.println(listNode.val);
//    }
//
//}
//
//
//class MyLinkedList<E> {
//
//    Node<E> head;
//    int size = 0;
//    E value;
//    Node<E> next;
//
////    public void add(E value) {
////        if (size == 0) {
////            this.head = new Node<>(value, this.next);
////        }
////        this.value = value;
////        this.next = null;
////        ++size;
////    }
//
//    public void add(E e) {
//        Node<E> newNode = new Node<>(e);
//        Node<E> x = head;
//
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//
//        while (x.next != null) {
//            x = x.next;
//        }
//        x.next = newNode;
//
//    }
//
//    public void remove() {
//
//    }
//
//    static class Node<E> {
//        E value;
//        Node<E> next;
//
//        Node(E element) {
//            this.value = element;
//            this.next = null;
//        }
//    }
//
//    public void read() {
//        Node<E> listNode = head;
//        while (listNode.next != null) {
//            System.out.println(listNode.value);
//            listNode = listNode.next;
//        }
//    }
//
//}
