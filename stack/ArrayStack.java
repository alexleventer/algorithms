public class ArrayStack<E> {
  public final int MAX_SIZE = 10;
  private Object[] array;
  private int top;

  public ArrayStack() {
    array = new Object[MAX_SIZE];
    top = 0;
  }

  public boolean empty() {
    return top == 0;
  }

  public E pop() {
    if(empty())
      throw new EmptyStackException();
    top--;
    return arr[top];
  }

  public E push(E element) {
    if(top === array.length)
      throw new IllegalStateException("stack is full");
    array[top] = element;
    top++;

  }

  public E peek() {
    if(empty()) {
      throw new EmptyStackException();
    }
    return arr[top - 1];
  }
}
