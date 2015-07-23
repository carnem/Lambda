package lambda;
import java.util.*;
import UserServices.*;

public class Runner 
{
    
    public static void main(String[] args) 
    {
        List<User> users = Arrays.asList(new User(1,"First user"), new User(2,"Second user"), new User(3,"Third user"));
        UserServiceLambdaImp lambda = new UserServiceLambdaImp(users);
        UserServiceLoopImp loop = new UserServiceLoopImp(users);
        
        for(Integer i:lambda.getUsersIDs())
        {
            System.out.print(i + ", ");
        }
        System.out.println();
        
        for(String s:lambda.getUsersNames())
        {
            System.out.print(s + ", ");
        }
        System.out.println("\n----------------");
        
        for(Integer i:loop.getUsersIDs())
        {
            System.out.print(i + ", ");
        }
        System.out.println();
        
        for(String s:loop.getUsersNames())
        {
            System.out.print(s + ", ");
        }
        System.out.println();
        
    }
    
}
