package main;

import java.util.ArrayList;
import java.util.List;

public class TaskService {

	public List<Task> taskList = new ArrayList<>();
	
	//Constructor for task list 
	public TaskService() {
		this.taskList = new ArrayList<Task>();
	}
	
	//adds a task with a unique taskId to taskList
	public String addTaskId(Task task) {
		for(int i = 0; i < taskList.size(); i++) {
			if(taskList.get(i).getTaskId().equals(task.getTaskId())) {
				throw new IllegalArgumentException("Task Id already in use.");
			}
		}
		taskList.add(task);
		return "successfully added task";
	}
	
	
	//method to delete tasks per taskId
	public String deleteTask(String taskId) {
		for(int i = 0; i < taskList.size(); i++) {
			if(taskList.get(i).getTaskId().equals(taskId)) {
				taskList.remove(i);
				return "Task successfully removed";
			}
	}
		throw new IllegalArgumentException("Task unable to be removed");
}
	
	
	//method to update a name per taskId
	public String updateName(String taskId, String name) {
		for(int i = 0; i < taskList.size(); i++) {
			if(taskList.get(i).getTaskId().equals(taskId)) {
				taskList.get(i).setName(name); 
				return name;
			}
	}
		throw new IllegalArgumentException("Task not found");
	}
	
	
	//method to update a description per taskId
	public String updateDescription(String taskId, String description) {
		for(int i = 0; i < taskList.size(); i++) {
			if(taskList.get(i).getTaskId().equals(taskId)) {
				taskList.get(i).setDescription(description); 
				return description;
			}
	}
		throw new IllegalArgumentException("Task not found");
	}
	
	
}
