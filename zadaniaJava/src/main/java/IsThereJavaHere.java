public class IsThereJavaHere {
    public static void main(String args[]) {
        String string = new String("Czy to zdanie zaczyna się od słowa \"Java?\"");

        System.out.print("Czy \" Java \" to pierwsze słowo tego zdania? ");
        System.out.println(string.startsWith("Java"));
    }
}