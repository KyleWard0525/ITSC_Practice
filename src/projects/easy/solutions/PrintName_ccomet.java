package projects.easy.solutions;
/**
 *
 * For this project, create a string variable
 * for your first name and another for your last
 * name. Then, combine the two using the String
 * concat() method. Finally, print the string:
 * "Hello, my name is" followed by your name.
 *
 * In order for the solution to be correct the
 * output must have a space between each word
 *
 * @author kward60
 */
public class PrintName_ccomet {
    public static void main(String[] args) {
        String firstName = "Christina ";
        String lastName = "Xie";

        String name = "Hello, my name is ";

        name = name.concat(firstName).concat(lastName);
        System.out.println(name);

    }
}
