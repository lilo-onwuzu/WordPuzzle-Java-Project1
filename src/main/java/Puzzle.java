import java.util.Arrays;

public class Puzzle {

  public String runPuzzle(String phrase){

    String[] makeArray = phrase.split("");
    String outputString = makeArray.toString();
      return outputString;

  }
}

// for (index = 0; index > makeArray.length(); index++){
//   if (makeArray[index].equals("a" || "e" || "i" || "o" || "u")){
//     makeArray[index] = "-";
//   }
// }
