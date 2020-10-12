
public class ScoreLLNode {
  // add variables 
  
  ScoreLLNode(String inUsername, int inScore){
    // add content
  }
  
  public void addScore(int inScore) {
    // add content
  }
  
  public String toString() {
    // add content
  }
  
  public int compareTo(String inUsername) {
    return username.compareTo(inUsername);
  }
  
  public void printForward() {
    System.out.print(toString() + " <--> " );
    if(next != null) next.printForward();
    else System.out.println("␀");
  }
  
  public void printReverse() {
    System.out.print(toString() + " <--> " );
    if(previous != null) previous.printReverse();
    else System.out.println("␀");
  }
  
}
