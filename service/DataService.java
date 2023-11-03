package service;

import java.util.ArrayList;
import java.util.List;

import model.*; //подключили все классы из model

public class DataService {
    private List<User> userList; //объявление списка userList типа User

    //region Constructor
    public DataService() {
        this.userList = new ArrayList<>();
    }

    //endregion
    //region Getter
    public List<User> getUserList() {
        return userList;
    }
    //endregion
    //region Получаем последний свободный id в типе студент/учитель
    private int getFreeId(Type type) {
        int lastId = 1;
        boolean itsStudent = Type.STUDENT == type; //проверяем к какой группе относится  user - в данном случае - true - студент
        for (User user : userList) { //!!!!! в userList лежат все пользовател (и Teacher и Student)
            if (user instanceof Teacher && !itsStudent) //если user типа Teacher и itsStudent = false (!itsStudent)
                lastId = ((Teacher) user).getTeacherId() + 1; // user переводит в Teacher а потом берет getTeacherId
            if (user instanceof Student && itsStudent)
                lastId = ((Student) user).getStudentId() + 1;

        }
        return lastId;

    }
    //endregion
    //region create - для создания пользователя
    public void create (String firstName, String secondName, String lastName, Type type){ // принимает фио и тип пользователя
        int id = getFreeId(type); //по типу пользователя получаем свободный id
        if (type == Type.STUDENT){//проверяем на тип
            Student student = new Student(firstName, secondName, lastName, id); //создаем объект и передаем в него
            userList.add(student); //добавляем объект в лист user
        }
        if (type == Type.TEACHER){
            Teacher teacher = new Teacher(firstName, secondName, lastName, id);
            userList.add(teacher);
        }
    }
    //endregion
    //region поиск пользователя по id
    public User getUserById(Type type, int id){
        boolean itsStudent = Type.STUDENT == type;
        for (User user: userList) {
            if (user instanceof Teacher && ((Teacher) user).getTeacherId() == id)
                return user;
            if (user instanceof Student && ((Student) user).getStudentId()== id)
                return user;
        }
        return null;
    }
    //endregion
    //region метод, возвращающий всех студентов
    public List<User> getAllStudent(){
        List<User> studentList = new ArrayList<>();
        for (User user : userList){
            if (user instanceof Student) //если пользователь принадлежит Student
                studentList.add(user); // добавляем в список
        }
        return studentList; //возвращаем список
    }
    //endregion
    //region метод, возвращающий всех учителей
    public List<User> getAllTeacher(){
        List<User> teacherList = new ArrayList<>();
        for (User user: userList){
            if (user instanceof Teacher)
                teacherList.add(user);
        }
        return teacherList;
        }
        //endregion
    }




