package DSA.day02;

public class MergeTwoSortedList extends LinkedLists{

    public Node merge(Node l1, Node l2){
        Node dummyNode = new Node(-1);
        Node currNode = dummyNode;

        while(l1 != null && l2 != null){

            if (l1.data <= l2.data) {
                currNode.next = l1;
                l1 = l1.next;
            } else {
                currNode.next = l2;
                l2 = l2.next;
            }
            currNode = currNode.next;
        }

        currNode.next = l1 == null ? l2 : l1;

        return dummyNode.next;
    }

    public static void main(String[] args) {
        LinkedLists<Integer> list1 = new LinkedLists<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        LinkedLists<Integer> list2 = new LinkedLists<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        MergeTwoSortedList m = new MergeTwoSortedList();
        Node head = m.merge(list1.head,  list2.head);

        LinkedLists<Integer> list = new LinkedLists<>();
        list.printList(head);
    }
}
