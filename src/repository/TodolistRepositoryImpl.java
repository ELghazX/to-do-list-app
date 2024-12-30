package repository;

import entity.Todolist;

public class TodolistRepositoryImpl implements TodolistRepository {
  public Todolist[] data = new Todolist[10];

  public Todolist[] getAll() {
    return data;
  }

  public boolean isFull() {
    var isFull = true;
    for (var i = 0; i < data.length; i++) {
      if (data[i] == null) {
        isFull = false;
      }
      break;
    }
    return isFull;
  }

  public void resizeIfFull() {
    if (isFull()) {
      var temp = data;
      data = new Todolist[data.length * 2];

      for (var i = 0; i < temp.length; i++) {
        data[i] = temp[i];
      }
    }
  }

  public void add(Todolist todolist) {
    resizeIfFull();
    for (var i = 0; i < data.length; i++) {

      if (data[i] == null) {
        data[i] = todolist;
        break;
      }
    }

  }

  public void remove(Integer number) {

  }

}
