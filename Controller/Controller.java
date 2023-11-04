package Controller;

import model.*;
import service.*;
import view.*;

import java.util.List;
import java.util.Locale;

public class Controller {
    private final DataService dataService = new DataService();
    public final StudentView studentView = new StudentView();
    public final TeacherView teacherView = new TeacherView();

    public void createStudent(String firstName, String secondName, String lastName){
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }

    public void getAllStudent(){
        List<User> userList = dataService.getAllStudent();
        for (User user: userList) {
            studentView.printOnConsole((Student) user);
        }
    }
    public void getAllTeacher(){
        List<User> userList = dataService.getAllTeacher();
        for (User user: userList) {
            teacherView.printOnConsole((Teacher) user);
        }
    }
}
