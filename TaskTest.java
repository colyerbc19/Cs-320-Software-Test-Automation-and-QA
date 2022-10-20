package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Task;

class TaskTest {

//tests that a new tasks can be name and values can be assigned 
	@Test
	void testTask() {
		Task task = new Task("111", "This is a task name", "This task does this and that");
		assertTrue(task.getTaskId().equals("111"));
		assertTrue(task.getName().equals("This is a task name"));
		assertTrue(task.getDescription().equals("This task does this and that"));
	}
	
//tests that the taskId is not longer than 10 
	@Test
	void testTaskIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("01234567890", "This is a task name", "This task does this and that");
			}); 
	}
	
//tests that the taskId is not null
	@Test
	void testTaskIdNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "This is a task name", "This task does this and that");
			}); 
	}
	
//tests that the name is not longer than 20
	@Test
	void testNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("111", "This is a task name that is way too long", "This task does this and that");
			}); 
	}
		
//tests that the name is not null
	@Test
	void testNameNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("111", null, "This task does this and that");
			}); 
	}

//tests that the description is not longer than 50
	@Test
	void testDescriptionTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("111", "This is a task name", "This task does this and that and the next thing wow this is too long");
			}); 
	}

//tests that the description is not null
	@Test
	void testDescriptionNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("111", "This is a task name", null);
			}); 
	}
	
	@Test 
	void testSetName() {
		Task task = new Task("111", "This is a task name", "This task does this and that");
		task.setName("This is a new task name");
		assertTrue(task.getName().equals("This is a new task name"));
	}
	
	@Test 
	void testSetDescription() {
		Task task = new Task("111", "This is a task name", "This task does this and that");
		task.setDescription("This is a new task description");
		assertTrue(task.getDescription().equals("This is a new task description"));
	}
	
	
	
	
	
	

}
