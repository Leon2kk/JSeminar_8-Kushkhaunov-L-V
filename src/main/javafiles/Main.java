package javafiles;

import javafiles.controller.Controller;


public class Main {
    
    public static void main(String[] args){
        
        Controller controller = new Controller();

        controller.createUser("Иван", "Иванов", "Иванович");
   
    }
}