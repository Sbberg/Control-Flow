public class IfElse {

    public IfElse() {

    }


    // a public with a boolean return type

    public boolean checkStringLength(String input) {


        //the condition here says - if the length
        //of the incoming string 'input ' has more than 7 chars
        //it will return true

        if (input.length() > 7) {
            return true;
        } else {
            return false;
        }


        //note: we don't need this return statement any longer
        //this is because all possible conditions have been met
        //return false;
    }

    /*
    this is a method with a public modifier that takes a string return type
    with a method name called printTStringsOnly.
     */
    public String printTStringsOnly(String input) {

        //here we made the car 'firstLetter'
        //equal to the charAt the index 0 of our input
        char firstLetter = input.charAt(0);
        //her we declare the bool check but we do not give it a value
        boolean check = true;

        //do {
            if (String.valueOf(firstLetter).equals("T") || String.valueOf(firstLetter).equals("t")) {
                return input + "begins with the letter 't' !";
            } else {
                check = false;
                //input = "t";

            }

       // } while (!check);


        return "Did this word begin with the letter 't'? : " + check;
    }


}
