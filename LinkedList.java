public class LinkedList{

    public class Node{
        public Node(Node pointer, String contents){
            next = pointer;
            item = contents;
        }

        public Node next;
        public String item;
    }

    private int size;
    private Node head;


    public LinkedList(){
        this.size = 0;
        this.head = null;
    }

    public String get(int index){
        if(head == null || index > size -1){
            throw new IndexOutOfBoundsException();
        }
        Node loop = this.head;
        for(int i = 0; i < size; i++){
            loop = loop.next;
        }
        return loop.item;

    }

    public void set(int index, String val){
        Node loop = this.head;
        for(int i = 0; i < size; i++){
            loop = loop.next;
        }
        loop.item = val;
    }


    public void add(String val){
        if(size == 0){
            this.head = new Node(null, val);
        }
        else{
            Node loop = this.head;
            for(int i = 0; i < size; i++){
                loop = loop.next;
            }
            
            loop.next = new Node(null, val);
            

        }
        size++;
    }

    public void insert(int index, String val){
        if(head == null || index > size -1){
            throw new IndexOutOfBoundsException();
        }

        Node curr = this.head;
        Node prev = null;

        for(int i = 0; i < index; i++){
            prev = curr;
            curr = curr.next;
        }
        prev.next = new Node(curr, val);
        size++;
    }

    public void remove(int index){
        if(head == null || index > size -1){
            throw new IndexOutOfBoundsException();
        }
        Node curr = this.head;
        Node prev = null;

        for(int i = 0; i < index; i++){
            prev = curr;
            curr = curr.next;
        }

        prev.next = curr.next;
        size--;

    }

    public boolean find(String val){
        Node loop = this.head;
        for(int i = 0; i < size; i++){
            if(loop.item.equals(val)){
                return true;
            }
            loop = loop.next;
            
        }
        return false;
    }










}