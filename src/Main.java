public class Main {
    public static void main(String[] args) {
        //calling methods
       int resultOne = add(1,2);
        System.out.println(resultOne);

        String resultTwo = greeting("Mr. Ewing");
        System.out.println(resultTwo);

        int resultThree = add(1, 2, 3, 4);
        System.out.println(resultThree);

        printMe("Happy friday!");

    }

    //add
    public static int add(int numOne, int numTwo)
    {
        return numOne + numTwo;
    }
    //greeting
    public static String greeting(String name)
    {
        return "Bonjour, " + name + "!";
    }

    //add 4 numbers
    public static int add(int numOne, int numTwo, int numThree, int numFour)
    {
        int a;
        int b;
        a = add(numOne,numTwo);
        b = add(numThree,numFour);
        return add(a,b);
    }

    //print
    public static void printMe(String toBePrinted)
    {
        System.out.println(toBePrinted);
    }
}

