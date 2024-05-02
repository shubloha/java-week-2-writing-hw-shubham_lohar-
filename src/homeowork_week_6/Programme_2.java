package homeowork_week_6;
/**
 * Write a Java programme using the following steps.
 * 1 Declare two static variables
 * 2 Declare one static method
 * 3 Call both static variables into the static method inside the print statement.
 * 4 Declare the Main method.
 * 5 Call the static method into the Main method and Run the programme.
 */

public class Programme_2 {
    //1 Declare two static variables
    static int a = 100;
    static int b = 200;

    //2 declare one static method
    //3 call both static variables into the static method inside the print statement.
    public static void staticMethod() {
        System.out.println(a);
        System.out.println(b);
    }

    //4 declare the Main method.
    //5 call the static method into the Main method and Run the programme.
    public static void main(String[] args) {
        staticMethod();
    }
}
