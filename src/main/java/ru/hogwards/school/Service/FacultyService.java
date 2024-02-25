package ru.hogwards.school.Service;
import ru.hogwards.school.model.Faculty;
import ru.hogwards.school.model.Student;

import java.util.List;

public interface FacultyService {
    Faculty add(Faculty faculty);
    Faculty get(Long id);
    Faculty update(Long id,Faculty faculty);
    void delete(Long id);
    List<Faculty> getByColor(String color);

    List<Faculty> getByNameOrColorIgnoreCase(String name, String color);

    List<Student>getStudents(Long id);


}
