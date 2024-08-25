class Node {
    int info;
    Node link;
    public Node(int data) {
        this.info = data;
        this.link = null;
    }
}

public class Cll{
    private static Cll Cll;
    Node first;
    Node last;
    public void insertAtFirst(int info) {
        Node newNode = new Node(info);
        if (first == null) {
            newNode.link = newNode;
            first = newNode;
            last = newNode;
        }
        newNode.link = first;
        last.link = newNode;
        first = newNode;
    }

    public void insertAtLast(int info) {
        Node newNode = new Node(info);
        if (first == null) {
            newNode.link = newNode;
            first = newNode;
            last = newNode;
        }
        newNode.link = first;
        last.link = newNode;
        last = newNode;
    }

    public void deleteNode(int x) {

          if (first == null) {
            System.out.println("list is empty");
            return;
        }
          if (first.info == x) {
            first = first.link;
            last.link = first;
            return;
        }
        Node temp = first;
        Node prev = null;
          do {
            prev = temp;
            temp = temp.link;
        } while (temp != first && temp.info != x);
          if (temp == first) {
            System.out.println("element not present");

        }  else {
            if (temp.link == first) {
                last = prev;
            }
            prev.link = temp.link;
        }
    }

    public void display() {
        Node save = first;
          do {
            System.out.print(save.info + " ");
            save = save.link;
        } while (save != first);
    }

    public void insord(int x) {
        Node newNode = new Node(x);
          if (first == null) {
            first = newNode;
            last = newNode;
            newNode.link = first;
            return;
        }
          if (newNode.info < first.info) {
            insertAtFirst(x);
            return;
        }
        Node prev = null;
        Node temp = first;
          do {
            prev = temp;
            temp = temp.link;
        } while (temp != first && temp.info < newNode.info);
          if (temp == first) {
            prev.link = newNode;
            last = newNode;
            newNode.link = first;
        } else {
            prev.link = newNode;
            newNode.link = temp;
        }
    }

    public static void main(String[] args) {
        Cll c= new Cll();
        c.insertAtFirst(10);
        c.insertAtFirst(2);
        c.insertAtLast(24);
        c.insord(4);
        c.deleteNode(2);
        c.display();
    }
}