package UserServices;

import java.util.List;
import java.util.stream.Collectors;
import lambda.User;

public class UserServiceLambdaImp implements UserService
{
    List<User> users;
    
    public UserServiceLambdaImp(List<User> users)
    {
        this.users = users;
    }
    
    public List<Integer> getUsersIDs()
    {
        return users.stream().map((user)->user.id).collect(Collectors.toList());
    }
    
    public List<String> getUsersNames()
    {
        return users.stream().map((user)->user.name).collect(Collectors.toList());
    }
    
}
