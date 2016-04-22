import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Puzzle {

  public static void main(String[] args){
    String layout = "templates/layout.vtl";
    ArrayList<String> checkArray = new ArrayList<String>();

    get("/", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/showPuzzle", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/showPuzzle.vtl");
      String inputString = request.queryParams("enter");
      checkArray.add(inputString);
      Puzzle newPuzzle = new Puzzle();
      String myPuzzle = newPuzzle.runPuzzle(inputString);
      model.put("myPuzzle", myPuzzle);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/result", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/result.vtl");

      String inputGuess = request.queryParams("enterGuess").toLowerCase();
      String checkInputString = checkArray.get(0);
      String newInputString = checkInputString.toLowerCase();
      String output = "";
      checkArray.remove(0);

      if (inputGuess.equals(newInputString)){
        output = "GUESSER";
      } else {
        output = "COORDINATOR";
      }

      model.put("output", output);
      model.put("checkInputString", checkInputString);

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public String runPuzzle(String phrase){

    String[] makeArray = phrase.split("");

    for (Integer index = 0; index < makeArray.length; index++){
      if (makeArray[index].equals("a")||makeArray[index].equals("A")||makeArray[index].equals("e")||makeArray[index].equals("E")||makeArray[index].equals("i")||makeArray[index].equals("I")||makeArray[index].equals("o")||makeArray[index].equals("O")||makeArray[index].equals("u")||makeArray[index].equals("U")){
        makeArray[index] = "_";
      }
    }

    String outputString = String.join("", makeArray);
      return outputString;

  }
}
