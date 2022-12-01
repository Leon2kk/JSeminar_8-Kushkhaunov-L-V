package javafiles.data;

public abstract class User {
    private String firstName;
    private String lastName;
    private String patronymic;

    public User(String firstName, String lastName, String patronymic){
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    public String getFirstName(){
        return  this.firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return  this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getPatronymic(){
        return  this.patronymic;
    }

    public void setPatronymic(String patronymic){
        this.patronymic = patronymic;
    }

}
