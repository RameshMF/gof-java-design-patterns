package com.ramesh.gof.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * The object to be proxyed.
 * 
 */
public class CourseBatch implements Batch {

	private List<String> listOfStudents;

	public CourseBatch() {
		listOfStudents = new ArrayList<>();
	}

	@Override
	public int totalStudents() {
		return listOfStudents.size() + 1;
	}

	@Override
	public void registerStudent(String name) {
		listOfStudents.add(name);
		System.out.println(" Student name : " + name);
	}
}
