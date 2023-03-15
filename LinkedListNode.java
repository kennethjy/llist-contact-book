import java.lang.reflect.Type;

public class LinkedListNode<Type> {
    LinkedListNode<Type> next = null;
    Type data;

    public LinkedListNode(Type d){
        data = d;
    }

    public void updateNext(LinkedListNode<Type> ptr){
        next = ptr;
    }

}

class linkedList<Type>{
    LinkedListNode<Type> head = null, tail = null;

    public void add(LinkedListNode<Type> node){
        if (head == null){
            head = node;
        } else {
            tail.updateNext(node);
        }
        tail = node;
    }

    public void add(linkedList<Type> list){
        if (head == null){
            head = list.head;
        } else {
            tail.updateNext(list.head);
        }
        tail = list.tail;
    }

    public void add(Type n){
        add(new LinkedListNode<Type>(n));
    }

    public void println(){
        LinkedListNode<Type> temp = head;
        System.out.print("[");
        while(temp != null){
            if(temp.next == null){
                System.out.print(temp.data);
                break;
            }
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        System.out.println("]");
    }

    public void deleteNode(Type node){
        if(node == head.data){
            head = head.next;
        } else {
            LinkedListNode<Type> temp = head.next, prev = head;
            while((temp != null) && (temp.data != node)){
                prev = temp;
                temp = temp.next;
            }
            if(temp != null){
                prev.updateNext(temp.next);
            } else {
                System.out.println("Entry not in list");
            }
        }
    }

        public void deleteAll(){
        head = null;
        tail = null;
    }
}