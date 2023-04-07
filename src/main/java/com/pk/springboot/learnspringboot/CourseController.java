package com.pk.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1,"Learn AWS","PK"),
				new Course(2,"Learn DevOps","PK"),
				new Course(3,"Learn Azure","PK"),
				new Course(4,"Learn GCP","PK"),
				new Course(5,"Learn FSD Course","PK")
				);
	}
}
