package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.StudentEntity;
import com.example.demo.Service.StudentService;

@RestController
public class StudentController {
@Autowired
StudentService sser;
@PostMapping("adddetails")
public StudentEntity add(@RequestBody StudentEntity ss)
{
	return sser.saveinfo(ss);
}
@PostMapping("addndetails")
public List<StudentEntity> insert(@RequestBody List<StudentEntity> ss)
{
	return sser.savedetails(ss);
}
@GetMapping("show")
public List<StudentEntity> showdetails()
{
	return sser.showinfo();
}
@DeleteMapping("delid/{id}")
public void deletemyid(@PathVariable int id)
{
	sser.deleteid(id);
	
}
@GetMapping("getid/{id}")
public Optional<StudentEntity> showid(@PathVariable int id)
{
	return sser.findid(id);
}
@PutMapping("update/{id}")
public String modify(@PathVariable int id,@RequestBody StudentEntity ss)
{
	return sser.updateinfobyid(id, ss);
}



}
