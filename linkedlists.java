//Attributes
public class Node {
  public int value;
  public Node next;
  
  public Node(int value) {
    this.value = value;
    this.next = next;
  }
}

//Methods
public interface MyList {
  public int get(int index);
  
  public void update(int index, int value);
  
  public String toString();
  
}
