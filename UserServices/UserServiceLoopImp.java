package UserServices;

import java.util.*;
import java.util.stream.Collectors;
import lambda.User;

public class UserServiceLoopImp implements UserService
{
    List<User> users;
    
    public UserServiceLoopImp(List<User> users)
    {
        this.users = users;
    }
    
    public List<Integer> getUsersIDs()
    {
        List<Integer> ids = new ArrayList<>();
        for(User user:users)
        {
            ids.add(user.id);
        }
        
        return ids;
    }
    
    public List<String> getUsersNames()
    {
        List<String> names = new ArrayList<>();
        for(User user:users)
        {
            names.add(user.name);
        }
        
        return names;
    }
}
