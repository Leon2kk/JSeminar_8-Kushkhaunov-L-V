package javafiles.controller;

import javafiles.service.UserService;
import javafiles.service.LessonGroupService;
import javafiles.view.StudentView;
import javafiles.data.User;
import java.util.List;

public class Controller {
    private final UserService userService = new UserService();
    private final StudentView studentView = new StudentView();
    private final LessonGroupService lessonGroupService = new LessonGroupService();

    public void createUser(String firstName, String lastName, String patronymic){
        userService.createUser(firstName, lastName, patronymic);
        List<User> students = userService.getAll();
        studentView.printToConsole(students);
    }

    


}
