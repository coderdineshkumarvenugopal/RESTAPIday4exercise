		package com.example.demo.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Model.StudentEntity;
import com.example.demo.Repository.StudentRepo;

@Service
public class StudentService 
{
	@Autowired
	StudentRepo sr;
	////entry of one student
	public StudentEntity saveinfo(StudentEntity ss)
	{
		return sr.save(ss);
	}
	///list of students
	public List<StudentEntity> savedetails(List<StudentEntity> ss)
	{
		return (List<StudentEntity>)sr.saveAll(ss);
	}
	///get totally
	public List<StudentEntity> showinfo()
	{
		return sr.findAll();
	}
	///delete by id
	public void deleteid(int id)
	{
		sr.deleteById(id);
	}
	///get by id
	public Optional<StudentEntity> findid(int id)
	{
		return sr.findById(id);
	}
	
	///put by id
	public String updateinfobyid(int id,StudentEntity ss)
	{
		sr.saveAndFlush(ss);
		if(sr.existsById(id))
		{
			return "updated";
		}
		else
		{
			return "Not Updated";
		}
	}
	
	
	
	
	
}
