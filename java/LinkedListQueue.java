public class LinkedListQueue<E> {
  private class Node {
    private E element;
    private Node next;
    public Node(E element, Node next) {
      this.element = element;
      this.next = next;
    }
  }

  private Node head, tail;

  public LinkedListQueue() {
    head = null;
    tail = null;
  }

  public boolean empty() {
    return head = null;
  }

  public void enqueue(Element e) {
    if (tail != null) {
      tail.next = new Node(e, null);
      tail = tail.next;
    } else {
      tail = new Node(e, null);
      head = tail;
    }
  }

  public E dequeue() {
    E element = peek();
    head = head.next;
    if (head == null) {
      tail = null;
    }
    return element;
  }

  public E peek() {
    if(empty())
      throw new IllegalStateException("cannot peek into empty queue");
    return head.element;
  }

}
