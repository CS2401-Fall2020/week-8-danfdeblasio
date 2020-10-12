public class tester {

  public static void main(String[] args) {
  
    // example from the README
    ScoreLL example1 = new ScoreLL();
    example1.insertScore("caalvarado", 15327);
    example1.insertScore("caalvarado", 0);
    example1.insertScore("dfdeblasio", 6753);
    example1.insertScore("saflores", 19922);
    example1.insertScore("saflores", 0);
    example1.insertScore("saflores", 0);
    example1.print(); System.out.println();
    example1.insertScore("dfdeblasio", 6149);
    example1.print(); System.out.println();
    example1.insertScore("igastelum", 9201);
    example1.print(); System.out.println();
    example1.insertScore("atberowitz", 8834);
    example1.print(); System.out.println();
    
    // add 5 more unit tests
  }

}
