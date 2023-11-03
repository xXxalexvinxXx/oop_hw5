package model;

public class Teacher extends  User{
    private int teacherId;

    public Teacher(String firstName, String secondName, String lastName, int teacherId) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }

    //region Getter/Setter
    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
    //endregion

    //region toString
    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", firstName'" + super.getFirstName() + '\''+
                ", secondName'" + super.getSecondName() + '\''+
                ", lastName'" + super.getLastName() + '\''+
                '}';
    }
    //endregion
}