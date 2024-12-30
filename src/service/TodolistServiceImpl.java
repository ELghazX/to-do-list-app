package service;

import repository.TodolistRepository;
import service.TodolistService;

public class TodolistServiceImpl implements TodolistService {
  private TodolistRepository todolistRepository;

  public TodolistServiceImpl(TodolistRepository todolistRepository) {
    this.todolistRepository = todolistRepository;
  };

  public void showTodoList() {
    System.out.println("TODOLIST");

  }

  public void addTodoList(String todo) {

  }

  public void removeTodoList(Integer number) {

  }

}
