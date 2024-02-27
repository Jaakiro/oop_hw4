package org.example.hw4;

public class Teacher extends User implements Comparable<Teacher> {
    private Long teacherID;

    public Teacher(String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
    }

    @Override
    public int compareTo(Teacher o) {
        if (teacherID > o.teacherID)
            return 1;
        if (teacherID < o.teacherID)
            return -1;
        return 0;
    }

    public Long getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Long teacherID) {
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + teacherID +
                '}';
    }
    }
