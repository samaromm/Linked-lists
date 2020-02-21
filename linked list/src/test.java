
public class test {
public static void main(String[] args) {
        
        ListNode list = new ListNode(1,new ListNode(5, new ListNode(8, new ListNode(9, null))));
        ListNode list2 = new ListNode(2,new ListNode(3, new ListNode(6, new ListNode(9, null))));
        printMutual(list,list2);
        merge(list, list2);
        
    }
    
	//merge 2 list nodes
    public static void merge(ListNode l1, ListNode l2){
        LinkedList list = new LinkedList(l1);
        ListNode current = l2;
        while(current!=null){
            list.addSorted(current.data);
            current = current.next;
        }
        list.print();
    } 
    
    //print the mutual nodes   
    public static void printMutual(ListNode list, ListNode list2) {
        LinkedList l = new LinkedList(list2);
        ListNode cur = list;
        while(cur!=null){
            if(l.contains(cur.data))
                System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
}
