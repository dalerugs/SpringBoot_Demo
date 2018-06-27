package jccm.PEPSOL.model;

import jccm.PEPSOL.Repository.StudentRepository;
import jccm.PEPSOL.object.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    private StudentRepository studentRepository;

    @Autowired
    public DatabaseSeeder(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        List<Student> students = new ArrayList<>();
        students.add(new Student(
                "Patrick Dale",
                "Rugayan",
                "1997-12-22",
                "09472199299",
                "Barrio Obrero, Tondo, Manila",
                "Anjo Mel Aloyan",
                "Anjo Mel Aloyan"
        ));
        students.add(new Student(
                "Rudolf Christian",
                "Dacay",
                "2000-12-12",
                "0987654322",
                "Tondo, Manila",
                "Patrick Dale Rugayan",
                "Anjo Mel Aloyan"
        ));
        students.add(new Student(
                "Christian",
                "Arnigo",
                "2001-07-12",
                "09876543212",
                "May Pajo, Caloocan",
                "Patrick Dale Rugayan",
                "Anjo Mel Aloyan"
        ));

        studentRepository.saveAll(students);
    }
}
