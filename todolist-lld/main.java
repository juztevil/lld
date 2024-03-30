import todolist.*;
import java.util.*;

class main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to ToDo list app !:) ");
        boolean usingTheApp=true;
        while(usingTheApp){
            System.out.println("1) Login\n2) Exit");
            System.out.print("Enter the option: ");
            switch(scan.nextInt()){
                case 1 -> {
                    boolean exit=false;
                    while(!exit){
                        System.out.println("1) Enter the credentials\n2) Signup \n3) Return to main menu");
                        System.out.print("Enter the option: ");
                        switch(scan.nextInt()){
                            case 1 -> {
                                boolean isAccountValid = false,trying=true;
                                users usersObj = new users();
                                user userObj;
                                while(trying){
                                    System.out.println("1) try\n2) exit");
                                    System.out.print("Enter the option: ");
                                    switch(scan.nextInt()){
                                        case 1 -> {
                                            System.out.print("Enter the username: ");
                                            String username=scan.next();
                                            System.out.print("Enter the password: ");
                                            String password=scan.next();
                                            boolean result=usersObj.validateUser(username,password);
                                            if(result){
                                                isAccountValid=true;
                                                userObj=usersObj.getUser(username);
                                                boolean userActive =true;
                                                while(userActive){
                                                    System.out.println("1) Add a todo\n2) Display a todo\n3) logout");
                                                    System.out.print("Enter the option: ");
                                                    switch(scan.nextInt()){
                                                        case 1 -> {
                                                            System.out.print("Enter the todo: ");
                                                            scan.nextLine();
                                                            userObj.addATodo(scan.nextLine());
                                                            System.out.println("Added a todo");
                                                        }
                                                        case 2 -> {
                                                            System.out.println(userObj.getUserName()+" todos:");
                                                            userObj.displayTodos();
                                                        }
                                                        case 3 -> {
                                                            userActive=false;
                                                        }
                                                    }
                                                }
                                            }
                                            else
                                            System.out.println("Username or Password is wrong");
                                        }
                                        case 2 -> {
                                            System.out.println("Back to the menu");
                                            trying=false;
                                        }
                                    }
                                } 
                            }
                            case 2 -> {
                                System.out.print("Enter the username: ");
                                String username=scan.next();
                                System.out.print("Enter the password: ");
                                String password=scan.next();
                                users usersObj=new users();
                                usersObj.addUser(username,password);
                                System.out.println("Account created successfully");
                            }
                            case 3 -> {
                                System.out.println("Returning to the main menu");
                                exit=true;
                            }
                        }
                    }
                }
                case 2 -> {
                    System.out.print("Thanks for using the ToDo list app. :) ");
                    usingTheApp=false;
                }
                default -> System.out.println("Please Enter a valid option");
            }
        }
    }
}