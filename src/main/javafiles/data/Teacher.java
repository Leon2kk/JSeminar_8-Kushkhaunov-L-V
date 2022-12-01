package javafiles.data;

public class Teacher extends User{

    private Long teacherID; 

    public Teacher(String firstName, String lastName, String patronymic, Long studentID){
        super(firstName, lastName, patronymic);
        this.teacherID = teacherID;
    }

    public Long getTeacherID(){
        return this.teacherID;
    }

    public void setTeacherID(Long teacherID){
        this.teacherID = teacherID;
    }
    
}
