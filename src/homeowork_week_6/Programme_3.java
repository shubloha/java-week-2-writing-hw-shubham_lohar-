package homeowork_week_6;

/**
 *  Write a Java programme using the following steps.
 *  1 Declare one instance and one static variable.
 *  2 Declare one instance method.
 *  3 Declare one static method.
 *  4 Call both instance and static variables into both instance and static methods inside the print statement.
 *  5 Declare the Main method.
 *   6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme_3 {
    //1 Declare one instance and one static variable.
    String name = "Prime";
    static String surname = "Testing";

    //2 Declare one instance method.
    //3 Call both instance and static variables into both instance and static methods inside the print statement.
    public void instanceMethod() {
        System.out.println(name);
        System.out.println(Programme_3.surname);
    }

    //3 Declare one static method.
    //4 Call both instance and static variables into both instance and static methods inside the print statement.
    public static void staticMethod() {
        Programme_3 programme_3 = new Programme_3();
        System.out.println(programme_3.name);
        System.out.println(surname);
    }

    //5 Declare the Main method.
    //6 Call both instance and static methods into the Main method and run the programme.
    public static void main(String[] args) {
        Programme_3 programme_3 = new Programme_3();
        programme_3.instanceMethod();
        staticMethod();
    }
}