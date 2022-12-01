package javafiles.view;
import java.util.List;
import javafiles.data.User;

public class StudentView {
    
    public void printToConsole(List<User> user){
        for(User item: user){
            System.out.println(item.getFirstName() + " " + item.getLastName() + " " + item.getPatronymic());
        }
    }
}
