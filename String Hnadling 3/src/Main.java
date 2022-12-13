public class Main {
    public static void main(String[] args) {

        String array1 = "I want" + " to learn" + "how to code";
        System.out.println(array1);

        String array2 = "";

        array2= array1.replaceAll("\\s", "");

        System.out.println(array2);



        String statement1 = String.valueOf(array2.compareTo("I want"));
        String statement2 = String.valueOf(array2.equalsIgnoreCase("to learn"));
        System.out.println(statement1.compareTo(statement2));



        }
    }

/*
    define array1 that contains the following strings:
        " I want "
        " to learn "
        " how to code! "
    remove all the whitespaces at the beginning and at the end of each string, assigning the new values to array2
    print the boolean result of !(statement1 > statement2), where
        statement1 corresponds to the lexicographical comparison between the first item of array2 and I want
        statement2 corresponds to the comparison ignoring the case of the second item of array2 and To learn */