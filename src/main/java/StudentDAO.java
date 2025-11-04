package com.project;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDAO {
  @Autowired
  private SessionFactory sessionFactory;

  private Session getSession() {
    return sessionFactory.getCurrentSession();
  }

  @Transactional
  public void save(Student s) {
    getSession().save(s);
  }

  @Transactional
  public List<Student> getAll() {
    return getSession().createQuery("from Student", Student.class).list();
  }

  @Transactional
  public void delete(int id) {
    Student s = getSession().get(Student.class, id);
    if (s != null) getSession().delete(s);
  }
}
