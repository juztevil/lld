package todolist;
import todolist.user;
import java.util.*;
public class users{
    private static ArrayList<user> users=new ArrayList<user>();
    public void addUser(String username,String password){
        user userObj=new user(username,password);
        users.add(userObj);
    }

    public boolean validateUser(String username,String password){
        for(int i=0;i<users.size();++i){
            if((users.get(i).getUserName()).equals(username))
            return users.get(i).validateMe(password);
        }
        return false;
    }

    public user getUser(String username){
        user obj=new user();
        for(int i=0;i<users.size();++i){
            if((users.get(i).getUserName()).equals(username)){
                obj=users.get(i);
                break;
            }
        }
        return obj;
    }
}