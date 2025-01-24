package Framework;

import java.util.Scanner;

public class Register {
    public Purse makeChange(double amt) {
        //Instantiates array with values associated with a currency
         Denomination[] moneyClip = { new Denomination("Fifty"
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