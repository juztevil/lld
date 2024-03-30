package todolist;
import java.util.*;
public class user{
    private String username,password;
    private ArrayList<String> todos=new ArrayList<String>();

    public user(String username,String password){
        this.username=username;
        this.password=password;
    }
    public user(){}

    public boolean validateUser(String username,String password){
        if(username.trim().equals((this.username).trim())){
            if(password.trim().equals((this.password).trim()))
            return true;
        }
        return false;
    }

    public String getUserName(){
        return username;
    }

    public boolean validateMe(String password){
        if((this.password).equals(password))
        return true;
        return false;
    }

    public void addATodo(String todo){
        todos.add(todo);
    }

    public void displayTodos(){
        for(int i=0;i<todos.size();++i)
        System.out.println(todos.get(i));
    }
}


