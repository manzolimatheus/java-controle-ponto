package models;

public class Gerente extends Funcionario {

  private String login;
  private String senha;

  public Gerente(int idFunc, String nome, String email, String documento, String login, String senha) {
    super(idFunc, nome, email, documento);
    this.login = login;
    this.senha = senha;
  }

  public String getlogin() {
    return login;
  }

  public void setlogin(String login) {
    this.login = login;
  }

  public String getSenha() {
    return senha;
  }

  public void setsenha(String senha) {
    this.senha = senha;
  }
}