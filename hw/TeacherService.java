package org.example.hw4;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher>{
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, String lastName) {
        Long countMaxId = 0L;
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherID() > countMaxId) {
                countMaxId = teacher.getTeacherID();
            }
        }
        countMaxId++;
        Teacher teacher = new Teacher(firstName, secondName, lastName);
        teachers.add(teacher);
    }
}
