import java.util.Random;
import java.util.ArrayList;

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
    private ArrayList<String> response;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        RNG = new Random();
        response = new ArrayList<>();
        fillResponses();
    }
    private void fillResponses(){
        response.add("yes");
        response.add("no");
        response.add("maybe");
        response.add("no idea");
        response.add("I know but I won't tell you");
        response.add("That sounds interesting. Tell me more...");
    }
    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int index = RNG.nextInt(response.size());
        return response.get(index);
    }
}
