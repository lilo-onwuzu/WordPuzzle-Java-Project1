import java.util.Arrays;

public class Puzzle {

  public String runPuzzle(String phrase){

    String[] makeArray = phrase.split("");

    for (Integer index = 0; index < makeArray.length; index++){
      if (makeArray[index].equals("a")||makeArray[index].equals("A")||makeArray[index].equals("e")||makeArray[index].equals("E")||makeArray[index].equals("i")||makeArray[index].equals("I")||makeArray[index].equals("o")||makeArray[index].equals("O")||makeArray[index].equals("u")||makeArray[index].equals("U")){
        makeArray[index] = "-";
      }
    }

    String outputString = String.join("", makeArray);
      return outputString;

  }
}
