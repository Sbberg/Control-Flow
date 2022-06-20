public class ForLoops {

    public ForLoops() {


    }


    //static shared with all the classes with a null return type because we are using void
    public static void printAssociatesNames(String[] names) {

        //here we have our basic for loop
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }


    public static int printTotalAssociatesNamesCount(String[] associatesArray) {

        int counter = 0;

        //here we have an enhanced ForLoop
        //this goes through the entire array no matter what
        // and uses logic for each variable used in the array
        for (String singleAssociate : associatesArray) {
            //here we are adding the length or count
            //of EACH string in the string array
            //to our counter

            counter += singleAssociate.length();

        }

        //after it has completely gone through the entire array
        //we will return counter



        return counter;
    }


}
