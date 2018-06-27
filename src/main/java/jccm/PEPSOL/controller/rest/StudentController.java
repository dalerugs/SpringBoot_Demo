package jccm.PEPSOL.controller.rest;

import jccm.PEPSOL.model.StudentRepository;
import jccm.PEPSOL.model.Student;
import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.annotation.ApiMethod;
import org.jsondoc.core.annotation.ApiPathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/students")
@Api(name = "Students API", description = "Methods to manage students")
public class StudentController {

    StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ApiMethod(description = "Get all students from database")
    public List<Student> getAll(){
        return studentRepository.findAll();
    }

    @RequestMapping(value = "/cellLeader/{cellLeader}", method = RequestMethod.GET)
    @ApiMethod(description = "Filter students by Cell Leader")
    public List<Student> cellLeader(@ApiPathParam(name = "cellLeader") @PathVariable String cellLeader){
        return studentRepository.findByCellLeaderContaining(cellLeader);
    }

    @RequestMapping(value = "/netLeader/{netLeader}", method = RequestMethod.GET)
    @ApiMethod(description = "Filter students by Network Leader")
    public List<Student> netLeader(@ApiPathParam(name = "netLeader") @PathVariable String netLeader){
        return studentRepository.findByNetworkLeaderContaining(netLeader);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ApiMethod(description = "Create new student")
    public List<Student> create(@RequestBody Student student) {
        studentRepository.save(student);
        return studentRepository.findAll();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    @ApiMethod(description = "Delete student")
    public List<Student> delete(@ApiPathParam(name = "id") @PathVariable Integer id) {
        studentRepository.deleteById(id);
        return studentRepository.findAll();
    }
}
