package javafiles.data;

import javafiles.data.Teacher;
import java.util.List;

public class LessonGroup {
    
    Teacher teacher;
    List<Student> students;
    String groupName;

    public LessonGroup(String groupName, Teacher teacher, List<Student> students){
        this.groupName = groupName;
        this.teacher = teacher;
        this.students = students;
    }

    public String getGroupName(){
        return  this.groupName;
    }

    public void setGroupName(String groupName){
        this.groupName = groupName;
    }

    public List<Student> getStudentsList() {
        return this.students;
    }

    public void setStudentsList(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

}
