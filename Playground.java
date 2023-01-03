import java.security.spec.RSAOtherPrimeInfo;
import java.sql.Struct;
import java.util.*;

//Remember that Java is statically typed. i.e. Variables are always given types, unlike dynamic typing in python etc.
public class Playground {

    String jeezuz = "Oh";

    //Every Java programme is contained in a strictly public class that matches the name of the file.
    //The class contains a strictly public main method(i.e. function) named 'public static void main(String[] arg){}'.

    //The names of classes and methods are referred to as IDENTIFIERS.
    //Anything part of a class is a member of the class. Including properties and methods.

    //Private and Public are access modifiers.

    //We can use args[] like from Python to parse in values from the command line.

    public static void main(String[] arg){
        Play_OOP play_oop = new Play_OOP();
        play_oop.firstName = "Fiq";
        play_oop.lastName = "Bigger";
        play_oop.full();
        play_oop.fullRepeat(3);

        String returnReceiver = play_oop.fullReturn();//The return message is stored at returnReceiver here.

        arrayOP();

        forPlayOP();

        Playground c = new Playground();

        //c.loopOP();

        bitwiseOP();

        c.taco();

        compareOP();
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

        //Accessing the 'name' property from the newly created class, Userground
        Userground user = new Userground();
        user.fname = "Toufiq";
        user.lname = "Musah";

        System.out.println(user.getFullName());//This line accesses the method from the new class and outputs a full name.
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

        //In comparing strings, it is best to use equals(or compareTo).
        //Can't use == for cases in conditional statements because of different types.
        //It works with primitives, but not objects(Because the value of an object is just a reference to it)psst. Reference type.
        //In using ==, the programme looks at a block of memory to compare them.
    }

    public static void controlOP(){
        Playground play = new Playground();

        System.out.println(play.jeezuz);
        int x = 10;
        if(x == 10){
            System.out.println(true);
            return;
            //Adding return at the end ensures that the function stops executing there. Assuming there are any other statements below it, if the condition passes, it will stop executing.
        }
        System.out.println("This will not execute thanks to the return statement");
    }

    public static void compareOP(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("Cats or Dogs");

        String xxx = scanner.nextLine();
        String nam_e = scanner.nextLine();

        if(age>12 && nam_e.equals("Cats")){
            System.out.println("You passed. Nice");
//            Notice the comparisson ops. Same as C programming.
        }
        else{
            System.out.println("Not Welcome");
        }

        //Maybe learn to define stuff out of the conditions
        //Let's try a switch case. NB: Break; prevents a fallthrough.
        switch (nam_e) {
            case "Cats":
                System.out.println("Same here");
                break;
            case "Dogs":
                System.out.println("Welp Hate them");
                break;
            default:
                System.out.println("Let's Go then");
        }
    }

    public static void tenaryOP(){
        //Works on three conditions
        String well = "Wellman";

        boolean act_Well = well.equals("Wellman")? true : false; //We could assign ints, Strings etc.
    }

    public void loopOP(){
        /*icu
        * initialisation
        * comparison/Condition
        * update
        */

        for(int x = 0; x<=5; x++){
            System.out.println("This is "+ x);
        }//So, Similar to C, huh?

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Password Here:");
        String passCode = scanner.nextLine();
        while (!passCode.equals("Fret")){
            System.out.println("Enter Password Here:");
            passCode = scanner.nextLine();
        }//This might work best with a do while loop. No code repitition.
        scanner.close();//Best use this when done with a scanner to prevent memory leaks. System warnings and all. Correct all?

        System.out.println("Congrats!");

        int i = 0;
        while (i<10){
            System.out.println("Well this is:"+ i);
            i++;//Yes, runs!
        }
    }

    public static void forPlayOP() {

        for (int i = 9; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {//Manipulating values etc creates the effect. j=i e.g. creates a slanted triangle.
                System.out.print(j + " ");
            }
            System.out.println();
        }
        /*
        * In Using BREAK(break), the entire process breaks out of an inner loop, exiting where available.
        * If in an outer loop, that loop breaks.
        * In using CONTINUE(continue),exits just the particular iteration of a loop, and not the loop itself.
        * This implies that when the continue condition is meat, the iteration ends and the loop restarts.
        */
    }

    public static void bitwiseOP(){
        int jk = 1;
        System.out.println("jk = "+jk);
        int ytho = ~jk;
        System.out.println("ytho = "+ ytho);
        //The output is -(plus one). Ought to learn bitwise operations.
    }

    public static void arrayOP(){
        int[] ar1 = new int[5];//Position of first sq bracket doesn't matter
        ar1[0] = 1;
        System.out.println(ar1[0]);

        int ar2[] = {1,4,5,2,6};
        System.out.println(ar2[0]);
        //We can't go beyond the size of the array.

        //To output an entire array
        System.out.println(Arrays.toString(ar2));

        //Iterating through an array
        int[] ar3 = new int[5];
        for(int i = 0; i<5; i++){
            ar3[i] = 5;
        }
        System.out.println(Arrays.toString(ar3));

        //To get user input in an array
        Scanner scanner = new Scanner(System.in);
        //Scanner can be used to determine size of array. Don't forget for loop. This is dynamic sizing.
        int[] ar4 = new int[3];
        for(int i = 0; i<3; i++){
            ar4[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(ar4));

        //Iterating through an array to find a value.
        for(int i = 0; i<ar2.length; i++){
            if(ar2[i] == 4){
                System.out.println(ar2[i]+ ":We got 4");
            }
            else{
                System.out.println(ar2[i]+ ":Welp not 4");
            }
        }

        //To sort an array
        Arrays.sort(ar2);
        System.out.println(Arrays.toString(ar2));

        //Arrays.equals(ar1, ar2) - To compare an array.
        //Arrays.fill(ar1, value) - To fill with particular value.
        //Arrays.asList(ar1) - To return a fixed size list. >>> List<String> testing = Arrays.asList(ar1)


        //ROW - FORWARD
        //COLUMN - DOWN
        //Declaring 2D arrays
        int[][] ar2D1 = new int[5][2];//i.e 5 external arrays each with 2 elements.
        int [][] ar2D2 = {
                {1,2,4},
                {3,5,6,7,9},
                {6,8,12}
        };//Here we have a staggered array. The internal elements vary in size, which can't be explicitly declared.

        System.out.println("Yeesss" + Arrays.deepToString(ar2D2));//Simplifies it.
        //Iterating through a 2D array. Specifically a staggered one
        System.out.println(ar2D2.length);//Simply gives length of entire external array.
        System.out.println(ar2D1[0].length);//Gives length of first internal array.

        for(int i=0;i< ar2D2.length;i++){
            for(int j=0;j< ar2D2[i].length;j++){
                System.out.print(ar2D2[i][j]+ "\t");

            }
            System.out.println();
        }


    }
    //Do note that we aren't able to change the size of an array once declared. This can only be done with ArrayLists.

    //Learn Generics
    public static void arrListOP(){//ArrayList<Integer>arL1 = new ArrayList<Integer>();
        //Declaring a list
        List<Integer> arLst1 = new ArrayList<Integer>();//At the 'ArrayList' section, that could be any other kind of list. Linked list, doubly linked lists, etc.
        //To add elements to the list one at a time
        arLst1.add(5);//Psst.. it is still indexed
        arLst1.add(2, 7);//7 is stored at index 2
        arLst1.set(1, 5);//Replaces index 1 element w/ value 5

        System.out.println(arLst1.get(1));//This simply outputs value at said index.
        System.out.println(arLst1.indexOf(5));//This gets the index of the value. -1 returned if it doesn't exist. arList.contains returns T/F
        //arList.isEmpty checks if it is an empty array. T/F returned
        arLst1.remove(1);//Removes element at set index.
        arLst1.clear();//Clears a list

        //Psst.. We can't do the ff. List<Integer> arLst1 = {1,2,3}; Might be better to just convert to array to list.
        List<Integer> arLst2 = Arrays.asList(1,4,5,6);

        //To output an array, its not that simple
        System.out.println(Arrays.toString(arLst2.toArray()));//Had to convert list to array.

        //Iterating through an array, and can also adding stuff
        for(int i = 0; i<arLst2.size();i++){
            arLst2.set(i, arLst2.get(i)*2);
            System.out.println(arLst2.get(i));

        }
        //Creating a 2D list
        List<List<Integer>> ar2DLst = new ArrayList<List<Integer>>();

        //We can convert Lists to array with .toArray. A complicated and nice way is to use a loop to assign elements of the list to the elements of a new array.
        //Collection.sort(arLst2);//Sorts a list. .reverse reverses it.

        String [] arString = new String[12]; //Hehe string array

    }

}

//Class - Contains everything. Has members and properties.
//methods - Perform functions
//properties - Stores stuff

//We define methods with parameters to later parse arguments

//static - No instance of class needed.
//object - An instance of a class. Erhm, reference type.