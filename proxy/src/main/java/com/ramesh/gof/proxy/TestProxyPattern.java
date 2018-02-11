package com.ramesh.gof.proxy;

public class TestProxyPattern {

	public static void main(String[] args) {

		Batch courseBatch = new CourseBatch();
		Batch proxyBatch = new ProxyBatch(courseBatch);
		proxyBatch.registerStudent(" student 1");
		proxyBatch.registerStudent(" student 2");
		proxyBatch.registerStudent(" student 3");
		proxyBatch.registerStudent(" student 4");
		proxyBatch.registerStudent(" student 5");
		proxyBatch.registerStudent(" student 6");
		proxyBatch.registerStudent(" student 7");
		proxyBatch.registerStudent(" student 8");
		proxyBatch.registerStudent(" student 9");
		proxyBatch.registerStudent(" student 10");
		proxyBatch.registerStudent(" student 11");
		proxyBatch.registerStudent(" student 12");
		proxyBatch.registerStudent(" student 13");
	}

}