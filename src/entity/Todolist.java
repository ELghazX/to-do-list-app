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
  public String setTodo(String todo) {
    return this.todo = todo;
  }

  // getter?
  public String getTodo() {
    return this.todo;
  }

}
