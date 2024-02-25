package ru.hogwards.school.Service;
import ru.hogwards.school.model.Faculty;
import ru.hogwards.school.model.Student;

import java.util.List;

public interface StudentService {
    Student add(Student student);
    Student get(Long id);
    Student update(Long id,Student student);
    void delete(Long id);

    List<Student> getByAge(int age);

    List<Student> getByAgeBetWeen(int ageFrom, int ageTo);

    Faculty getFaculty(Long id);

}
