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
    if (full()) {
      throw new IllegalStateException("queue is full");
    } else {
      size++;
      arr[back] = e;
      back++;
      if (back == arr.length) back = 0;
    }
  }

  public E dequeue() {
    if (empty()) {
      throw new IllegalStateException("queue is empty");
    } else {
      size--;
      String value = arr[front];
      arr[front] = null;
      front++;
      if (front == arr.length)
        front = 0;
      return value;
    }
  }

  public boolean empty() {
    return size == 0;
  }

  public boolean full() {
    return size == MAX_SIZE;
  }

  public boolean peek() {
    if (empty())
      throw new IllegalStateException("cannot peek into empty stack");
    return arr[front];
  }
}
