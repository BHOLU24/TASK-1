class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class LinkedList {
  Node head;

  LinkedList() {
    this.head = null;
  }

  void append(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    Node last = head;
    while (last.next != null) {
      last = last.next;
    }
    last.next = newNode;
  }

  void display() {
    Node current = head;
    while (current != null) {
      System.out.print(current.data + " > ");
      current = current.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.append(1);
    list.append(2);
    list.append(3);
    list.display(); // Output: 1 -> 2 -> 3 -> null
  }
}
