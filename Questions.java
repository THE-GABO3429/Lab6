import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Write a description of class Questions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Questions
{
    // instance variables - replace the example below with your own
    private int x;
    /*
     * 1) Pressing enter still does the same when typing anything
     * 2)
     * 3)The toffset allows you to start anywhere you want within the string
     * 4)It's a boolean that ends with a specified suffix. It's called endsWith
     * 5)length() and it has no paramaters only the string its self
     * 6)I used control F/f3, and it was easy for the first one, the second one was a little difficult since
     * length is a parameter its self
     * 7)trim() | text.trim()
     * 8)done
     * 9)done
     * 10)it returns a boolean
     * 11) done
     * 12)java.util | creats a R.N.G | public Random() | by creating a new Random object
     * 13)done
     * 14)
     * 15)
     * 16)
     * 17)
     * 18)
     * 19)
     * 20)
     * 21)
     * 22)
     * 23)
     * Part 2
     * 24)A hash map is a method that consistance of two parramter wich are both strings but are called kays and numbers
     * we would use this to have a ArrayList where every string has a "number" associated with.
     * 25)
    */
    private Random RNG;
    private ArrayList<String> response;
    private HashMap<String,String> PhoneBook;
    public void MapTester(){
        PhoneBook = new HashMap<>();
        enterNumber("Henry", "123");
        enterNumber("Ben", "765");
        PhoneBook.put("Alrtire", "643");
    }
    public void enterNumber(String name, String number){
        PhoneBook.put(name, number);
    }
    public String lookupNumber(String name){
        return PhoneBook.get(name);
    }
    public void randomngTester(){
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
        response.add("...");
    }
    public void printOneRNG(){
        System.out.println(RNG.nextInt(1000));
    }
    public void printMultRNG(int howMany){
        int index = 0;
        while (index < howMany){
            System.out.println("New random number "+ (index+1) + ": " + RNG.nextInt(1000));
            index ++;
        }
    }
    public String getResponse(){
        int index = RNG.nextInt(3);
        
        if (index == 0){
            return "yes";
        }
        else if (index == 1){
            return "no";
        }
        else{
            return "Maybe";
        }
    }
    public String getBetterResponses(){
        int index = RNG.nextInt(response.size());
        return response.get(index);
    }
    /**
     * Constructor for objects of class Questions
     */
    public Questions()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
