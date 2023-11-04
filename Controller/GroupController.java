package Controller;
import model.*;
import service.*;
import view.*;

import java.util.List;

public class GroupController {
    private StudentGroupService studentGroupService;

    public GroupController(){
        studentGroupService = new StudentGroupService();
    }
    public List<Integer> getStudentList(){
        return studentGroupService.getStudentsList();

    }
}
