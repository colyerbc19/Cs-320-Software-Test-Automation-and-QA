package main;

public class Task {

	//shall not be updatable 
	final String taskId;
	String name; 
	String description;
	
	//constructor for task object
	public Task(String taskId, String name, String description) {
		
		if(taskId == null || taskId.length() > 10) {
			throw new IllegalArgumentException("Invaild Task Id");
		}
		
		if(name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invaild Task name");
		}
		
		if(description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invaild Task description");
		}
		
		this.name = name;
		this.description = description;
		this.taskId = taskId;
	}
	
	//getters 
	public String getTaskId() {
		return taskId;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
}
