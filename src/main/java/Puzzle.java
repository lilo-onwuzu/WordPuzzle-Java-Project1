import java.util.Arrays;

public class Puzzle {

  public String runPuzzle(String phrase){

    String newPhrase = phrase.toLowerCase();
    String[] makeArray = newPhrase.split("");

    for (Integer index = 0; index < makeArray.length; index++){
      if (makeArray[index].equals("a") || makeArray[index].equals("e") || makeArray[index].equals("i") || makeArray[index].equals("o") || makeArray[index].equals("u")){
        makeArray[index] = "-";
      }
    }

    String outputString = String.join("", makeArray);
      return outputString;

  }
}
