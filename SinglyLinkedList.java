puplic class SinglyLinkedList{
    privete Node head;
    privete Node tail;
    privete int size;

    puplic SinglyLinkedList(){
        head = null;
        tail = null;
        size = 0;

    }
    puplic int getSize(){
        return size;
    }
    puplic Node getFirst(){
        return head;
    }
    puplic Node getLast(){
        return tail;
    }
    puplic boolean isEmpty(){
        return size == 0;
    }
    puplic void display(){
        Node c = new Node();
        c = head;
        While(c != null){
            System.out.print(c.getData()+" ");
            c = c.getNext();
        }
    }

    puplic void addFirst(E e){
        Node newest = new Node(e);
        newest.setNext(head);
        head = newest;
        if(isEmpty()){
            tail = newest;
        }
        size ++;

    }
    puplic void addLast(E e){
        if(isEmpty()){
            addFirst(e);
        }else{
            Node newest = new Node(e);
            tail.setNext(newest);
            tail = newest;
            size++;
        }

    }
    puplic void removeFirst(){
        if(isEmpty()){
            return;
        }
        head = head.getNext();
    }
    puplic void removeLast(){
        
    }

}