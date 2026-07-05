package linked_list;

public class LinkedList{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx , int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0 ;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("linked list is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head=head.next;
        size--;
        return val;
    }
    
    public int removeLast(){
        if(head==null){
            System.out.println("linked list is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size=0;
        }
        Node temp = head;
        for(int i = 0 ; i < size-2 ; i++){
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next=null;
        tail = temp ;
        size--;
        return val;
    }

    public int remove(int idx){
        Node temp = head;
        int i = size-idx;
        for(int j = 0 ;j<i-1 ;j++){
            temp = temp.next;
        }
        int val = temp.next.data;
        size--;
        temp.next = temp.next.next;
        return val;
    }

    public int itrSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp!=null){
            if(temp.data == key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr =  next;
        }
        head = prev;
    }

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // this is the mid 
    }

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        Node midNode = findMid(head);
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr =  next;
        }
        Node right = prev;
        Node left = head;
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;

        }
        return true;
    }

    public static boolean isCycle(){ // Floyd's cycle finding algo
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(){
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(cycle==false){
            return;
        }

        slow = head;
        Node prev = null;
        while (slow != fast){
            prev = fast ;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;
    }

    private Node getMid(Node head){
        Node slow = head ;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private Node merge(Node head1 , Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1.next;
                head1=head1.next;
            }else{
                temp.next = head2;
                head2=head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next =  head1;
            head1=head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next =  head2;
            head2=head2.next;
            temp = temp.next;
        }
        return mergedLL.next;

    }
    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft,newRight);
    }
    public void print(){
        if(head==null){
            System.out.println("the linked list is empty");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }  

        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.add(2,2);
        // ll.add(4,2);
        // ll.add(2,2);
        // ll.print();
        // ll.remove(2);
        // ll.reverse();
        // System.out.println(ll.itrSearch(6));
        // ll.removeFirst();
        // ll.removeLast();
        // ll.add(0,1);
        // ll.add(1,2);
        // ll.add(2, 2);
        // ll.add(3, 1);
        // ll.print();
        // System.out.println(ll.checkPalindrome());
        // System.out.println("size of the linked list = " + ll.size);


        // head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = new Node(4);
        // head.next.next.next.next = head.next;
        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();
        ll.head = ll.mergeSort(ll.head);
        ll.print();
    }
}

