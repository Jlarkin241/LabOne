import Framework.Denomination;
import Framework.*;

public class Register {
    public Purse makeChange(double amt){

        return new Purse();
    }

    public static void main(String[] args) {
        //Instantiates variables with currency
        Denomination fifty = new Denomination("Fifty note"
                ,1.00,"bill","text.txt");
        Denomination ten = new Denomination("Ten note"
                ,1.00,"bill","text.txt");
        Denomination five = new Denomination("five note"
                ,1.00,"bill","text.txt");
        Denomination one = new Denomination("One note"
                ,1.00,"bill","text.txt");
        Denomination quarter = new Denomination("Dollar"
                ,1.00,"coin","text.txt");
        Denomination dime = new Denomination("Dollar"
                ,1.00,"coin","text.txt");
        Denomination penny = new Denomination("Dollar"
                ,1.00,"coin","text.txt");
    }
}
