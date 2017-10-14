public class LinkedListStack {
  private class Node {
    private String value;
    private Node next;
    public Node(value, next) {
      this.value = value;
      this.next = next;
    }
  }

  private Node top = null;

  private String pop() {
    if (empty())
      throw new EmptyStackException();
    else {
      String retValue = top.value;
      top = top.next;
      return retValue;
    }
  }

  public void push(String e) {
    top = new Node(e, null);
  }

  public boolean empty() {
    return top == null;
  }

  public String peek() {
    if (empty())
      throw new EmptyStackException();
    return top.value;
  }

}
