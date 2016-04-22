import java.util.Arrays;

public class Puzzle {

  public String runPuzzle(String phrase){

    String[] makeArray = phrase.split("");

    for (Integer index = 0; index < makeArray.length; index++){
      if (makeArray[index].equals("a") || makeArray[index].equals("e") || makeArray[index].equals("i")){
        makeArray[index] = "-";
      }
    }

    String outputString = String.join("", makeArray);
      return outputString;

  }
}
