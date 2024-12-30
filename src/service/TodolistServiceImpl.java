package service;

import entity.Todolist;
import repository.TodolistRepository;
import service.TodolistService;

public class TodolistServiceImpl implements TodolistService {
  private TodolistRepository todolistRepository;

  public TodolistServiceImpl(TodolistRepository todolistRepository) {
    this.todolistRepository = todolistRepository;
  };

  public void showTodoList() {
    Todolist[] model = todolistRepository.getAll();
    System.out.println("TODOLIST");
    for (var i = 0; i < model.length; i++) {
      var todo = model[i];
      var no = i + 1;

      if (todo != null) {
        System.out.println(no + ". " + todo.getTodo());
      }
    }

  }

  public void addTodoList(String todo) {

  }

  public void removeTodoList(Integer number) {

  }

}
