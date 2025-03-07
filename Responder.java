import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class Responder
{
    private Random RNG;
    //private ArrayList<String> response;
    private HashMap<String,String> response;
    public void fillResponsesMap(){
        response = new HashMap<>();
        enterNumber("Henry", "123");
        enterNumber("Ben", "765");
        response.put("Alrtire", "643");
    }
    public void enterNumber(String name, String number){
        response.put(name, number);
    }
    public String lookupNumber(String name){
        return response.get(name);
    }
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        response = new HashMap<>();
        fillResponses();
    }
    private void fillResponses(){
        response.put("what","yes");
        response.put("2","no");
        response.put("#","maybe");
        response.put("$","no idea");
        response.put("%","I know but I won't tell you");
        response.put("^","That sounds interesting. Tell me more...");
    }
    private String pickDefaultResponse(){
        return "No idea";
    }
    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String word)
    {
        String answer = response.get(word);
        if (answer == null){
            answer = pickDefaultResponse();
        }
        return answer;
    }
}
