public class Play_OOP {
    //Fields are variables inside a class. i.e. class level variables.
    //public static int enx = 12;
    //Instance of a class is an object.

    public String firstName;
    public String lastName;

    public void full(){
        System.out.println(firstName + " " + lastName);
    }
    //To  output fullname a number of times using a loop and parameters.
    public void fullRepeat(int times){
        for(int i = 0; i < times; i++){
            System.out.println(firstName + " " + lastName);
        }
    }
    //Using return statements
    public String fullReturn(){
        return "Hello there, " + firstName + " " + lastName;
    }
}
