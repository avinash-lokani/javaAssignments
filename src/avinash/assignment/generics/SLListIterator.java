package avinash.assignment.generics;

public class SLListIterator<T> {


    public void add(SList<T> sList, T data){
        Node node = new Node(data);

        if(sList.head == null){
            sList.head = node;
        }
        else{
            Node end = sList.head;
            while(end.next != null){
                end = end.next;
            }
            end.next = node;
        }
    }

    public void remove(SList<T> sList){
        Node k = sList.head;
        sList.head = sList.head.next;
        k = null;
    }
}
