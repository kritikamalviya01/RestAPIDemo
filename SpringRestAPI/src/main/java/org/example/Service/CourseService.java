package org.example.Service;

import org.example.Entities.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();

    public Course getCourse(long courseId);

    public Course addCourse(Course course);

    public Course updateCourse(Course course);

    public List<Course> deleteCourse(Long courseId);
}
