package jccm.PEPSOL.controller.rest;

import jccm.PEPSOL.object.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/students")
public class StudentController {
    private List<Student> students;

    public StudentController() {
        students = new ArrayList<>();
        students.add(new Student(
                1,
                "Patrick Dale",
                "Rugayan",
                "1997-12-22",
                "09472199299",
                "Barrio Obrero, Tondo, Manila",
                "Anjo Mel Aloyan",
                "Anjo Mel Aloyan"
        ));
        students.add(new Student(
                2,
                "Rudolf Christian",
                "Dacay",
                "2000-12-12",
                "0987654322",
                "Tondo, Manila",
                "Patrick Dale Rugayan",
                "Anjo Mel Aloyan"
        ));
        students.add(new Student(
                2,
                "Christian",
                "Arnigo",
                "2001-07-12",
                "09876543212",
                "May Pajo, Caloocan",
                "Patrick Dale Rugayan",
                "Anjo Mel Aloyan"
        ));
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Student> getAll(){
        return students;
    }

    @RequestMapping(value = "/cellLeader/{cellLeader}", method = RequestMethod.GET)
    public List<Student> cellLeader(@PathVariable String cellLeader){
        return students.stream().filter(x-> x.getCellLeader().matches("(.*)"+cellLeader+"(.*)")).collect(Collectors.toList());
    }

    @RequestMapping(value = "/netLeader/{netLeader}", method = RequestMethod.GET)
    public List<Student> netLeader(@PathVariable String netLeader){
        return students.stream().filter(x-> x.getNetworkLeader().matches("(.*)"+netLeader+"(.*)")).collect(Collectors.toList());
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public List<Student> create(@RequestBody Student student) {
        students.add(student);
        return students;
    }
}
