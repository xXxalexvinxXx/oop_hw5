package model;

public class Student extends  User{
    private int studentId;

    public Student(String firstName, String secondName, String lastName, int studentId) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
    }

    //region Getter/Setter
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    //endregion

    //region toString
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName'" + super.getFirstName() + '\''+
                ", secondName'" + super.getSecondName() + '\''+
                ", lastName'" + super.getLastName() + '\''+
                '}';
    }
    //endregion
}
