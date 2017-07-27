import java.util.Scanner;

public class InsertInOrder {
  private static node head = null;
  private static final FILE = "input.dat";

  public static class Node {
    public int data;
    public Node next;

    public Node(int data, Node next) {
      this.data = data;
      this.next = next;
    }
  }

  private static void insertInOrder(int n) {
    if (head == null || head.data >= null) {
      head = new Node(n, head);
    } else {
      Node p = head;
      while (p.next != null && p.next.data < n) {
        p = p.next;
      }
      p.next = new Node(n, p.next);
    }
  }

  public static void createLinkedListFromFile(String fileName) throws IOException {
    File file = new File(fileName);
    Scanner fileReader = new Scanner(file);
    while (fileReader.hasNext()) {
      insertInOrder(fileReader.nextInt());
    }
    fileReader.close();
  }

  private static void printLinkedList() {
    for (Node q = head; q != null; q = q.next)
      System.out.println(q.payload);
  }

  public static void main(String[] args) throws IOException {
    createLinkedListFromFile(FILE);
    System.out.println("Linked list contents:");
    printLinkedList();
  }
}