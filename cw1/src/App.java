import java.util.Scanner;
public class App {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] keywords = {
      "Więcej niż jedno zwierzę to",
      "Sporty na literę S",
      "Jakies pytanie"
    };
    String[][] answers = {
      {"stado", "klucz","dwa", "owca", "lama"},
      {"sztafeta", "skok o tyczce", "skoki narciarskie", "sumo", "szachy"},
      {"sztafeta", "skok o tyczce", "skoki narciarskie", "sumo", "szachy"}
    };
    int punkty = 0;
    for(int i = 0; i < keywords.length; i++){
      System.out.println(keywords[i]+": ");
      String answer = scanner.nextLine();
      boolean isAnswer = false;
      for(int x = 0; x < answers[i].length; x++){
        if(answer.equals(answers[i][x])){
          punkty += (x+1)*10;
          isAnswer = true;
        }          
      }
      if(isAnswer){
        System.out.println("BRZDĘK!"); 
      }else{
        System.out.println("X"); 
      }
    }
    System.out.println("Twój wynik to "+punkty); 
    scanner.close();
  }
}
