
public class ScoreLL {
  private ScoreLLNode current;
  
  public void insertScore(String uname, int score) {
    if(current == null) {
      current = new ScoreLLNode(uname, score);
      return;
    }
    boolean added = false;
    while(!added) {
      if(current.compareTo(uname)==0) {
        current.addScore(score);
        added = true;
      }else if(current.compareTo(uname) > 0) { // goes on the left
        if(current.previous == null) {
          current.previous = new ScoreLLNode(uname, score);
          current.previous.next = current;
          current = current.previous;
          added = true;
        }else {
          if(current.previous.compareTo(uname) < 0) {
            ScoreLLNode temp = current.previous;
            current.previous = new ScoreLLNode(uname, score);
            current.previous.previous = temp;
            temp.next = current.previous;
            current.previous.next = current;
            current = current.previous;
            added = true;
          }else {
            current = current.previous;
          }
        }
      }else if(current.compareTo(uname) < 0) { // goes on the right
        if(current.next == null) {
          current.next = new ScoreLLNode(uname, score);
          current.next.previous = current;
          current = current.next;
          added = true;
        }else {
          ScoreLLNode temp = current.next;
          current.next = new ScoreLLNode(uname, score);
          current.next.next = temp;
          temp.previous = current.next;
          current.next.previous = current;
          current = current.next;
          added = true;
        }
      }
    }
  }
  
  public void print() {
    System.out.print("/-> ");
    if(current.previous != null) current.previous.printReverse();
    else System.out.println("␀");
    System.out.println("|\n\\/");
    System.out.println(current.toString());
    System.out.println("/\\\n|");
    System.out.print("\\-> ");
    if(current.next != null) current.next.printForward();
    else System.out.println("␀");
  }
}
