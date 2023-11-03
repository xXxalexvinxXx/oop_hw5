package Controller;

import model.*;
import service.*;
import view.*;

import java.util.List;
import java.util.Locale;

public class Controller {
    private final DataService dataService = new DataService();
    public final StudentView studentView = new StudentView();

    public void createStudent(String firstName, String secondName, String lastName){
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }

    public void getAllStudent(){
        List<User> userList = dataService.getAllStudent();
        for (User user: userList) {
            studentView.printOnConsole((Student) user);
        }
    }

    //region hw

    private StudentGroupService studentGroupService;
    public StudentGroup createStudentGroup(int teacherId, List<Student> studentId){
        Teacher teacher = getTeacher(teacherId);
        List<Student> students = getStudents(studentId);

        return studentGroupService.crereateStudentGroup(teacher, students);
    }

    private Teacher getTeacher(int teacherID){

        return teacher;
    }

    private List<Student> getStudents(List<Long> studentId){

        return students;
    }



    //endregion
}
