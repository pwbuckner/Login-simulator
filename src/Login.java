import java.util.Scanner;

class Login {
    private static User newUser;
    private static final Scanner input = new Scanner(System.in);

    void run(){

        System.out.println("Hello World");
        System.out.println("Enter 1 to Login, 2 to create New User, or 3 to Delete User");

        int selection = input.nextInt();
        input.nextLine();

        if (selection == 1){
            System.out.println("Enter UserName:");
            String name = input.nextLine();

            System.out.println("Enter password:");
            String pass = input.nextLine();

            //find user in database
        }

        else if (selection == 2){
            createUser();
        }
        System.out.println(newUser.getPassword() + " " + newUser.getUserName());
    }

    private void createUser() {
        System.out.println("Enter desired UserName:");
        String name = input.nextLine();

        System.out.println("Enter desired password:");  //create method to make password rules
        String pass = input.nextLine();
        System.out.println("Enter password again:");
        String pass2 = input.nextLine();

        if (checkPass(pass, pass2)) {
           newUser = new User(name, pass);
        }
        else{
            System.out.println("Passwords do not match, try again.");
            createUser();
        }
    }

    private boolean checkPass(String pass, String pass2){
        //verify password better
        return pass.equals(pass2);
    }
}
