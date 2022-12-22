import java.util.Scanner;
//Remember that Java is statically typed. i.e. Variables are always given types, unlike dynamic typing in python etc.
public class Playground {

    //Every Java programme is contained in a strictly public class that matches the name of the file.
    //The class contains a strictly public main method(i.e. function) named 'public static void main(String[] arg){}'.

    //The names of classes and methods are referred to as IDENTIFIERS.
    //Anything part of a class is a member of the class. Including properties and methods.

    //Private and Public are access modifiers.

    //We can use args[] like from Python to parse in values from the command line.

    public static void main(String[] arg) {
        //Main function always executes main method. There are exceptions. Libraries for examples.
        String x = "How are you doing, fellow kids?";
        System.out.println(x);
        //System is a class. Out is a member of system. Println is a method contained in out.

        //To take input, we must first create a scanner as follows.

        Scanner scanner = new Scanner(System.in); //Scanner package is imported as 'import Java.util.Scanner'.
        //Scanner is not static.

        //System.in  and System.out simply implies we are utilising the console.
        //The next line is the general structure of creating new objects. Notice how it matches with the above Scanner object.
        //Type identifier_name = new Type();
        //The parenthesis,() is the constructor. Is it???'

        //Here is how to make variables receive input and then output them.
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        Playground c = new Playground();
        c.taco();

        //There are two main object types
        //Primitive types - boolean, byte, char, int, long, short, float, double
        int num = 5; //Primitive type
        Integer y = 6;//Object, Class type (Autoboxing). OFTEN NEVER REALLY USED.
        //Object types - Instance of classes.

        //A constant can be created as follows
        final int init = 10; //The final keyword makes the variable init a constant.

        String z = new String("Hello There"); //property


    }

    public void taco(){
        //The following is a non - static method.It can 't just be simply referenced in the main to make it run.
        //We will have to create a new object in main() (of the class, i.e Playground) to hold newMethod as 'var x = new Playground();', then reference it as x.newMethod();.e static,no instance of the class will be required.
        System.out.println("This is a new method");
    }
}

//Class - Contains everything. Has members and properties.
//methods - Perform functions
//properties - Stores stuff

//We define methods with parameters to later parse arguments

//static - No instance of class needed.
//object - An instance of a class