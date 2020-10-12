
public class ScoreLLNode {
  private String username; 
  private int scoreTotal;
  private int scoreCount;
  public ScoreLLNode next;
  public ScoreLLNode previous;
  
  ScoreLLNode(String inUsername, int inScore){
    username = inUsername;
    scoreTotal = inScore; 
    scoreCount = 1;
  }
  
  public void addScore(int inScore) {
    scoreTotal += inScore; 
    scoreCount++;
  }
  
  public String toString() {
    return username + " (" + ((double)scoreTotal/scoreCount) + ")";
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
