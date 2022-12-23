import java.security.spec.RSAOtherPrimeInfo;
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

        boolean yes = scanner.nextBoolean();//Scanning booleans
        System.out.println(yes);

        //Now we will scan a float and typecast it to int
        float g = (int)scanner.nextFloat();
        System.out.println(g);

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


        boolean isComputer = true; //Declaring boolean
        byte b = 'b';//Stores byte value of  literals(numbers and strings) using ASCII table. Is 32 bits
        System.out.println(b);
        char xx = 'Z'; //Allows for storing unicode. Is 16 bits.
        System.out.println(xx);
        short v = 2098;//Stores numbers upto 16 bits, like char. int stores up to 32 bits like byte
        long w = 20823L;//Stores numbers up to 64 bits. Can add L to end of number.
        float f = 3.21f; //32 bits, ends with f
        System.out.println(f);
        double d = 2.73816; //64 bits. Leaving the f makes programme know it isn't a float. Otherwise, it is a float.

        //i.e. short=char<byte=int=float<long=double

        //We call mathOP in the main function without creating a new playground object because it is static.
        mathOP();


        //All because stringOP() is not a static method.
        Playground strOP =  new Playground();
        strOP.stringOP();
    }

    //Let's put some of the new topics in to methods of their own

    public void taco(){
        //The following is a non - static method.It can 't just be simply referenced in the main to make it run.
        //We will have to create a new object in main() (of the class, i.e Playground) to hold newMethod as 'var x = new Playground();', then reference it as x.newMethod();.e static,no instance of the class will be required.
        System.out.println("This is a new method");
    }

    //Exploring some of the operations we can  explore.
    public static void mathOP(){

        System.out.println("Testing mic mathOP");
        Integer zx = Integer.max(10,20550);//This is a static method. Ergo the lack of need to create an object instance of it.
        Integer.compare(30, 100);
        System.out.println(zx);
        
        String monpere = "203";

        Integer xyx = Integer.valueOf(zx);//Gives the int value of a String or int. i.e. String to int. Is an object.
        int xx = Integer.parseInt(monpere);//Same as above but is a primitive
        System.out.println("xx is:" + xx);

    }

    public void stringOP(){
        String jeez = "Oh jeez!";//Reference type. Is an obj ect and an instance of a class.
        //Single quotes and char are reserved for single characters.
        char jest = 'j';
        //To access individual characters of a string, we do the following.
        char ind = jeez.charAt(0);//Which holds the array value of the string. Don't go out of the bounds of the array.
        System.out.println(ind);

        //Special characters, \t, \n, \, etc. are allowed in Java.
        //We can use StringFormatting here too, like C. Not python.
        System.out.println(String.format("Hello %s", jeez));

        //To get the length of a string.
        System.out.println(jeez.length());//Note that length() is a method, unlike in python where it's a property.

        jeez.concat("Hell Yeah");//This concatenates strings. ehm.. without the addition sign.
        jeez.contains("h");//Returns true or false depending on if the string contains the requested value.
        jeez.indexOf("h");//Checks the index of a requested string
        jeez.toUpperCase();//Turns everything to uppercase and other similar functions exist.
        jeez.strip();//Removes all whitespaces at the beginning and end.
        jeez.substring(0);//To use part of a string starting at a particular index.
        jeez.repeat(12);//Repeats the string the number of requested times.
        jeez.equals("Yes");//Checks if values are same, returning true or false. Similar to compare.
        jeez.compareTo("Yes");//Like above??
    }
}

//Class - Contains everything. Has members and properties.
//methods - Perform functions
//properties - Stores stuff

//We define methods with parameters to later parse arguments

//static - No instance of class needed.
//object - An instance of a class. Erhm, reference type.