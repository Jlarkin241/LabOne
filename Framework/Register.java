package Framework;

import java.util.Scanner;

public class Register {
    public Purse makeChange(double amt) {
        //Instantiates array with values associated with a currency
        Denomination[] moneyClip = {new Denomination("Fifty note"
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
        int[] counter = {0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < moneyClip.length; i++) {
            int count = 0;
            while (moneyClip[i].amt() <= amt) {
                //  System.out.println(amt);
                counter[i] = ++count;
                amt -= moneyClip[i].amt();

            }
            if(counter[i] > 0)
                purse.add(moneyClip[i], counter[i]);
        }


        return purse;
    }

    //Main to test register class
    public static void main(String[] args) {
        Purse purse; //Purse variable will be used to pass return of making change
        Scanner sc = new Scanner(System.in);//Used for input

        System.out.println("Enter the double value: ");//prompt
        double input = sc.nextDouble();// gets value used as argument of makingChange

        do {
            //calls function,pass input,returns a purse
            purse = new Register().makeChange(input);//assigned value within loop to erase contents at header return
            System.out.print(purse.toString());//returns proper currency
            System.out.println("Wallet holds: $" + purse.getValue());//returns sum of wallet; should match argument
            input = sc.nextDouble();//ask for new input; -1 and less is used as sentinel
        }while (input >=0);

    }
}