package Framework;

import java.util.HashMap;
import java.util.Map;

public class Purse {
    // an array consisting of currency details held in type Denomination
    //Will be used to check for available keys within map and then to pull it value
    private Denomination[] arr = { new Denomination("Fifty"
            , 50, "bill", "images/Fifty.jpg"),
            new Denomination("Ten"
                    , 10, "bill", "images/Ten.jpg"),
            new Denomination("Five"
                    , 5, "bill", "images/Five.jpg"),
            new Denomination("One"
                    , 1, "bill", "images/One.png"),
            new Denomination("Quarter"
                    , .25, "coin", "images/Quarter.jpg"),
            new Denomination("Dime"
                    , .10, "coin", "images/Dime.jpg"),
            new Denomination("Penny"
                    , .01, "coin", "images/Penny.jpg")};
   //Data type consisting of pairs that call each other
   private Map<Denomination,Integer> cash  = new HashMap<>();

   public Map<Denomination,Integer> getCash() {
       return cash;
   }

    //Instance methods
    //adds a given number of a currency into cash variable
    // key(denomination/currency):value(amount of denomination/currency)
    public void add(Denomination type, int number){
        cash.put(type,number);
    }
    //Didn't get this one.
    //if the given Denomination isn't present or if (value minus number) is less than zero, returned zero
    //else returned (value - number) and replaces value of given key
    public double remove(Denomination type, int number){
        if(cash.containsKey(type)){ //checks if key is present
            if((cash.get(type) - number) < 0) {
                cash.put(type,0);
                return 0;
            }
            else {
                cash.put(type,cash.get(type) - number);
                return cash.get(type);}
        }
        return 0;

    }
    //for loop that increments through the array and checks
    // map to see if one of its keys matches value matches with Denomination of the array
    //if found, adds matched value to sum that will be returned
    public double getValue() {
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(cash.containsKey(arr[i])){
                sum += arr[i].amt() * cash.get(arr[i]);
            }
        }
        return Math.round(sum*100.0)/100.0; //rounds two decimal places;got logic from google
    }
    //For loops compares map to array,
    // if keys exist purse is occupied and records inventory in a string
    public String toString(){
        String str = "";
        boolean check = false;
        for(int i = 0; i < arr.length; i++){
            if(cash.containsKey(arr[i])){
                check = true;
                str += cash.get(arr[i]) + " " + arr[i].name() + '\n';
            }
        }
        if(!check)
            str = "Empty purse\n";
        return str;
    }
}
