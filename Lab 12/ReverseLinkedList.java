import java.util.*;

class Node{
    int info;
    Node link;
    public Node(int data){
        this.info = data;
        this.link = null;
    }
}

class Reverse{
    Node frist;
    private Object first;
    public void add(int data){
        Node newNode = new Node(data);
        if(first == null){
            first = newNode;
        }
        else{
            
        }
    }
}

public class ReverseLinkedList{
    
}