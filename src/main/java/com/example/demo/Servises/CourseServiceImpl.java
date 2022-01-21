package com.example.demo.Servises;

import com.example.demo.courseDao.CourseDao;
import com.example.demo.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
@Service
public class CourseServiceImpl implements CourseService{
    //List<Course> coursesList;
    @Autowired
    private CourseDao courseDao;
    public CourseServiceImpl() {
//        coursesList = new ArrayList<Course>();
//        coursesList.add(new Course(145L, "Java Core Course", "this course contains basics of java"));
//        coursesList.add(new Course(4343L, "Spring Boot Course", "creating rest api using spring boot"));
    }
    @Override
    public List<Course> getCourses() {
        //return coursesList;
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(long courseId){
        //Course c=null;
//        for(Course course:coursesList){
//            if(course.getId()==courseId)
//                c=course;
//                break;
//        }
   return courseDao.getOne(courseId);
    }

    @Override
    public Course addCourse(Course course) {
//        coursesList.add(course);
        courseDao.save(course);
       return course;
    }

    @Override
    public Course updateCourse(Course course) {
//        coursesList.forEach(e->{
//            if(e.getId() == course.getId()){
//                e.setTitle(course.getTitle());
//                e.setDescription(course.getDescription());
//            }
//        });
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long CourseId) {
        //coursesList = this.coursesList.stream().filter(e -> e.getId() != CourseId).collect(Collectors.toList());
//        courseDao.deleteById(parseLong);
        //return null;
        Course entity=courseDao.getOne(CourseId);
        courseDao.delete(entity);
    }
}
