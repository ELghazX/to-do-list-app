package test.service;

import entity.Todolist;
import repository.TodolistRepository;
import repository.TodolistRepositoryImpl;
import service.TodolistService;
import service.TodolistServiceImpl;

public class TodolistServiceTest {

  public static void main(String[] args) {
    testshowtodolist();

  }

  public static void testshowtodolist() {
    TodolistRepositoryImpl todolistrepository = new TodolistRepositoryImpl();
    todolistrepository.data[0] = new Todolist("jual esteh");
    todolistrepository.data[1] = new Todolist("belajar java oop");
    todolistrepository.data[0] = new Todolist("belajar java biasa");

    TodolistService TodolistService = new TodolistServiceImpl(todolistrepository);
    TodolistService.showTodoList();

  }
}
