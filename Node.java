puplic class Node<E>{

  privete E data;
  privete Node next;

  puplic Node(){
     data = null;
     next = null;
  }
  puplic Node(E data){
    this.data = data;
    this.next = null;
     
  }
  puplic Node(E data, Node next){
    this.data = data;
    this.next = next;
  }

  puplic void setData(E data){
    this.data = data
  }
  puplic void setNext(Node next){
    this.next = next;
  }
  puplic E getData(){
    return data;
  }
  puplic Node getNext(){
    return next;
  }

}