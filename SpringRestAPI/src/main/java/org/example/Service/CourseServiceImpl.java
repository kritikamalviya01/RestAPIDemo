package org.example.Service;

import org.example.Entities.Course;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    List<Course> list;

   public CourseServiceImpl(){
       list = new ArrayList<>();
       list.add(new Course(101,"Core Java"," This is Core Java"));
       list.add(new Course(102,"Python"," This is Python"));
   }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long courseId) {
       Course c = null;
       for(Course course: list){
           if(course.getId() == courseId){
               c = course;
               break;
           }
       }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
       list.add(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
       list.forEach( a-> {
           if(a.getId() == course.getId()){
               a.setTitle(course.getTitle());
               a.setDescription(course.getDescription());
           }
       });
        return course;
    }

    @Override
    public List<Course> deleteCourse(Long courseId) {
       int count = 0;
       for(int i=1; i< list.size()-1; i++){
           if(list.contains(courseId)){
               break;
           }
           count++;
       }
       list.remove(count);
        return list;
    }
}
