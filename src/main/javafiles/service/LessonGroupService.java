package javafiles.service;

import javafiles.data.User;
import javafiles.data.Teacher;
import javafiles.data.LessonGroup;

import java.util.ArrayList;
import java.util.List;

public class LessonGroupService {

    LessonGroup lessonGroup;

    public LessonGroup createLessonGroup(String groupName, Teacher teacher, List<User> students){

        this.lessonGroup = new LessonGroup(groupName, teacher, new ArrayList<>());
        
        return this.lessonGroup;
    }



    

    
}
