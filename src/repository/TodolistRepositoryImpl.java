package repository;

import entity.Todolist;
import repository.TodolistRepository;

public class TodolistRepositoryImpl implements TodolistRepository {
  private Todolist[] data = new Todolist[10];

  public Todolist[] getAll() {
    return data;
  }

  public void add(Todolist todolist) {

  }

  public void remove(Integer number) {

  }

}
