package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Task;
import main.TaskService;

class TaskServiceTest {

	@Test
	void testAddTaskId() {
		TaskService taskService = new TaskService();
		Task task = new Task("111", "This is a task name", "This task does this and that");
		
		assertTrue(taskService.addTaskId(task) == "successfully added task" );
		assertTrue(taskService.taskList.size() == 1);
		
	}
	
	@Test
	void testAddUniqueId() {
		TaskService taskService = new TaskService();
		Task task1 = new Task("111", "This is a task name", "This task does this and that");
		Task task2 = new Task("111", "This is a task name", "This task does this and that");
		
		assertTrue(taskService.addTaskId(task1) == "successfully added task" );
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			taskService.addTaskId(task2);
			}); 	
	}
	
	@Test
	void testDeleteTask() {
		TaskService taskService = new TaskService();
		Task task = new Task("111", "This is a task name", "This task does this and that");
		
		//adds and then checks to ensure task was added 
		assertTrue(taskService.addTaskId(task) == "successfully added task" );
		assertTrue(taskService.taskList.size() == 1);
		
		//deletes and then checks to ensure the task was deleted
		assertTrue(taskService.deleteTask("111") == "Task successfully removed");
		assertTrue(taskService.taskList.size() == 0);
		
		//checks to make sure taskId that does not exist cannot be deleted
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			taskService.deleteTask("999");
			});
	}
	
	@Test
	void testUpdateName() {
		TaskService taskService = new TaskService();
		Task task = new Task("111", "This is a task name", "This task does this and that");
		
		//ensures task is added
		assertTrue(taskService.addTaskId(task) == "successfully added task" );
		
		//tests that name is updated correctly
		assertTrue(taskService.updateName("111", "New task name") == "New task name");
		assertTrue(task.getName() == "New task name");
		
		//throws exception if taskId is not found 
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			taskService.updateName("999", "New task name");
			});
		
	}
	
	@Test
	void testUpdateDescription() {
		TaskService taskService = new TaskService();
		Task task = new Task("111", "This is a task name", "This task does this and that");
		
		assertTrue(taskService.addTaskId(task) == "successfully added task" );
		
		assertTrue(taskService.updateDescription("111", "New task description") == "New task description");
		assertTrue(task.getDescription() == "New task description");
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			taskService.updateDescription("999", "New task description");
			});
		
	}
	
	
	
	
	/*void testTaskService() {
		TaskService taskService = new TaskService();
		Task task = new Task("111", "This is a task name", "This task does this and that");
		
		
	}*/

}
