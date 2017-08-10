public class ArrayQueue<E> {
  public static final int MAX_SIZE = 10;
  private Object[] arr;
  private int front, back, size;
  public ArrayQueue() {
    arr = new Object[MAX_SIZE];
    front = 0;
    back = 0;
    size = 0;
  }

  public void enqueue(Element e) {
    if(full())
      throw new IllegalStateException("queue is full");
    arr[back] = e;
    back = (back + 1) % arr.length;
  }

  public E dequeue() {
    D element = peek();
    arr[front] = null;
    front = (front + 1) % arr.length;
    return element;
  }

  public boolean empty() {
    return size == 0;
  }

  public boolean full() {
    return size == MAX_SIZE;
  }

  public boolean peek() {
    if(empty)
      throw new IllegalStateException("cannot peek into empty stack");
    return arr[size-1];
  }
}