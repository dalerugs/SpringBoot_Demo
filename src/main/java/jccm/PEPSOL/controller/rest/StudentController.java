package jccm.PEPSOL.controller.rest;

import jccm.PEPSOL.Repository.StudentRepository;
import jccm.PEPSOL.object.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/students")
public class StudentController {

    StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Student> getAll(){
        return studentRepository.findAll();
    }

    @RequestMapping(value = "/cellLeader/{cellLeader}", method = RequestMethod.GET)
    public List<Student> cellLeader(@PathVariable String cellLeader){
        return studentRepository.findByCellLeaderContaining(cellLeader);
    }

    @RequestMapping(value = "/netLeader/{netLeader}", method = RequestMethod.GET)
    public List<Student> netLeader(@PathVariable String netLeader){
        return studentRepository.findByNetworkLeaderContaining(netLeader);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public List<Student> create(@RequestBody Student student) {
        studentRepository.save(student);
        return studentRepository.findAll();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public List<Student> delete(@RequestBody int id) {
        studentRepository.deleteById(id);
        return studentRepository.findAll();
    }
}
