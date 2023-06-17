package DSA.day02;

public class MergeTwoSortedList extends LinkedLists{

    public Node merge(Node head1, Node head2){

        

        return null;
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
