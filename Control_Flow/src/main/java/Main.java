public class Main {
    public static void main(String[] args) {

        String newLine = "\n";

        //because the method was not static we have to create an instance to reference it
        IfElse ifelse = new IfElse();

        String newString = "hello Hoomans ";

        System.out.println(ifelse.checkStringLength("Bodlerss"));
        System.out.println(ifelse.printTStringsOnly(newString) + "\n");




        /*
                                For Loops
         */

        //we didn't have to make an instance of our ForLoops class
        //in order to invoke these methods - this is because they are static


        //here we are creating our String array right in the param of our method
        ForLoops.printAssociatesNames(new String[] {"Jo jo","CJ","DeeAnne","David","Shane"});

        //the other way is to declare the array first
        //assign it to a variable
        //and use the variable in the method param

        String[] associates = {"Shaquanna", "Mark", "Tyler", "Eric", "Janga", "Li"};
        //this is saying how many total char(s) are in each of the names
        System.out.println(ForLoops.printTotalAssociatesNamesCount(associates)+"\n");


        /*
                                                While Loops
         */


        WhileLoops.printFirst3Indexes(associates);
        System.out.println(newLine);



        /*
                                            DoWhile Loops
         */
        DoWhile doWhile = new DoWhile();
        doWhile.printValueIfTrue();
        System.out.println(newLine);

        /*
                                            SwitchStatements
         */

        SwitchStatements switchStatements = new SwitchStatements();
        switchStatements.gradeCalculator(100);
        System.out.println(newLine);






    }
}
