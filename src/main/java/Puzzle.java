import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Puzzle {

  public static void main(String[] args){
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

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
