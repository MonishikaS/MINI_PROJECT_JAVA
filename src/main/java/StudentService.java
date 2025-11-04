package com.project;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
  @Autowired
  private StudentDAO dao;

  public void addStudent(String name, String course, double balance) {
    dao.save(new Student(name, course, balance));
  }

  public List<Student> listStudents() {
    return dao.getAll();
  }

  public void removeStudent(int id) {
    dao.delete(id);
  }
}
