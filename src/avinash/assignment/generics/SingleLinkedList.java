package avinash.assignment.generics;

public class SingleLinkedList {
    public static void main(String[] args){
            SList list = new SList();
            SLListIterator<Integer> slistIerator = list.Iterator();
            slistIerator.add(list,10);
            slistIerator.add(list,10);


            SList list1 = new SList();
            SLListIterator<String> stringSListIerator = list1.Iterator();
            stringSListIerator.add(list1,"Avinash");



           slistIerator.remove(list);
           //slistIerator.remove(list);

           System.out.println(list);
           System.out.println(list1);
    }
}
