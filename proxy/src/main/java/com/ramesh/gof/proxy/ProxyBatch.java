package com.ramesh.gof.proxy;

/**
 * The proxy class controlling access to the CourseBatch.
 *
 */
public class ProxyBatch implements Batch {

	private Batch batch;
	private static final int TOTAL_STUDENTS_ALLOWED_TO_BATCH = 10;

	public ProxyBatch(Batch batch) {
		this.batch = batch;
	}

	@Override
	public int totalStudents() {
		return batch.totalStudents();
	}

	@Override
	public void registerStudent(String name) {
		if (TOTAL_STUDENTS_ALLOWED_TO_BATCH >= this.totalStudents()) {
			batch.registerStudent(name);
		} else {
			System.out.println("Course batch size is : " + TOTAL_STUDENTS_ALLOWED_TO_BATCH);
			System.out.println("Batch is full so further students are not allowed ");
		}
	}

}