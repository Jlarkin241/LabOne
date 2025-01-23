import Framework.Denomination;
import Framework.*;

public class Register {
    public Purse makeChange(double amt){
        //Instantiates array with values associated with a currency
        Denomination [] moneyClip = { new Denomination("Fifty note"
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
        Purse purse = new Purse();
        //tallies the currency that breaks down amount
        int [] counter = {0,0,0,0,0,0,0};
        for(int i = 0; i < moneyClip.length; i++)
        {
            int count = 0;
            while(moneyClip[i].amt()<= amt)
            {
              //  System.out.println(amt);
                counter[i] = ++count;
                amt -= moneyClip[i].amt();

            }
            purse.add(moneyClip[i],counter[i]);
        }

                System.out.println(purse.toString());
                System.out.println(purse.getValue());




         return purse;
        }
        public static void main(String[] args) {
            new Register().makeChange(.46);
        }
    }


