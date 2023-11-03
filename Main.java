import Controller.Controller;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.createStudent("sfn1","ssn1", "sln1");
        controller.createStudent("sfn2","ssn2", "sln2");
        controller.createStudent("sfn3","ssn3", "sln3");
        controller.createStudent("sfn4","ssn4", "sln4");
        controller.createStudent("sfn5","ssn5", "sln5");
        controller.createStudent("sfn6","ssn6", "sln6");
        controller.getAllStudent();
    }
}