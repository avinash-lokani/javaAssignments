package avinash.assignment.generics;

public class SList<T>{
    Node<T> head;

    public SLListIterator Iterator(){
        return new SLListIterator();
    }

    @Override
    public String toString() {
        Node k = head;
        String s = "";
        while (k != null){
            s += (k.data + ",");
            k = k.next;
        }

        return "SList{" +
                s.substring(0,s.length()-1)+
                '}';
    }
}

