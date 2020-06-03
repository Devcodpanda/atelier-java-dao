package fr.wildcodeschool.students.repository;

import fr.wildcodeschool.students.models.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepoBdx implements StudentDao {

    @Override
    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Cucu"));
        students.add(new Student("Coco"));
        students.add(new Student("Concon"));
        return students;
    }


}