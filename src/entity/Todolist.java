package entity;

public class Todolist {
  private String todo;

  // construtctr
  public Todolist() {

  }

  public Todolist(String todo) {
    this.todo = todo;
  }

  // setter
  String setTodo(String todo) {
    return this.todo = todo;
  }

  // getter?
  String getTodo() {
    return this.todo;
  }

}
