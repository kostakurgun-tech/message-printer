public class MessagePrinter {

    public static String getWelcomeMessage() {
    return "Hello! Welcome to Git and GitHub Tutorial! Learning is fun!";
}


    public static String getDateMessage() {
        return "Today is: " + java.time.LocalDate.now();
    }

    public static String getGoodbyeMessage() {
    	  return "Thank you for using MessagePrinter!";
    }

public static String getAuthorMessage() {
    return "Created by: Кургун Костянтин";
}


   public static void main(String[] args) {
    System.out.println(getWelcomeMessage());
    System.out.println(getDateMessage());
    System.out.println(getAuthorMessage());
    System.out.println("Learning remote repositories!");
    System.out.println(getGoodbyeMessage());
}

}
