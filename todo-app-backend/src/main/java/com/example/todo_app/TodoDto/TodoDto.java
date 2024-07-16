package com.example.todo_app.TodoDto;

public class TodoDto {
	
	private Long id;
	private String title;
	private String description;
	private boolean status;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public TodoDto() {
		super();
	}
	public TodoDto(Long id, String title, String description, boolean status) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.status = status;
	}
	
	public TodoDto(String title, String description, boolean status) {
		super();
		this.id = null;
		this.title = title;
		this.description = description;
		this.status = status;
	}

}
