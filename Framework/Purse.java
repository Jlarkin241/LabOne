package Framework;

import java.util.HashMap;
import java.util.Map;

public class Purse {
    // an array consisting of currency details held in type Denomination
    //Will be used to reference key and to pull it values
   private Denomination [] arr = { new Denomination("Fifty note"
            , 50, "bill", "images/fifty.jpg"),
            new Denomination("Ten note"
                    , 10, "bill", "images/ten.jpg"),
            new Denomination("five note"
                    , 5, "bill", "images/five.jpg"),
            new Denomination("One note"
                    , 1, "bill", "images/one.png"),
            new Denomination("quarter"
                    , .25, "coin", "images/quarter.jpg"),
            new Denomination("Dime"
                    , .10, "coin", "images/dime.jpg"),
            new Denomination("Penny"
                    , .01, "coin", "images/penny.jpg")};
   //Data type consisting of pairs that call each other
   private Map<Denomination,Integer> cash  = new HashMap<>();

    //Instance methods
    //adds a given number of a currency into cash variable
    public void add(Denomination type, int number){
        cash.put(type,number);
    }
    //Didn't get this one.
    //if the given Denomination isn't present or if value minus number is less than zero, returned zero
    //else returned value - number
    public double remove(Denomination type, int number){
        if(cash.containsKey(type)){ //checks if key is present
            if((cash.get(type) - number) < 0)
                return 0;
            else {
                cash.put(type,cash.get(type) - number);
                return cash.get(type);}
        }
        return 0;

    }
    //for loop that increments through the array and checks
    // map to see if one of its keys matches value matches with Denomination of the array
    //if found adds matched value to sum that will be returned
    public double getValue() {
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(cash.containsKey(arr[i])){
                sum += arr[i].amt() * cash.get(arr[i]);
            }
        }
        return sum;
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
            str = "Empty purse";
        return str;
    }
}
