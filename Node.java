import org.w3c.dom.Node;

public class Node<E>{

  private E data;
  private Node next;

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

  public void setData(E data){
    this.data = data;
  }
  public void setNext(Node next){
    this.next = next;
  }
  public E getData(){
    return data;
  }
  public Node getNext(){
    return next;
  }

}