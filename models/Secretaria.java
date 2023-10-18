package models;

public class Secretaria extends Funcionario {
  private String telefone;
  private String ramal;

  public String getTelefone() {
    return this.telefone;
  }

  public String getRamal() {
    return this.ramal;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public void setRamal(String ramal) {
    this.ramal = ramal;
  }

  public Secretaria(int idFunc, String nome, String email, String documento, String telefone, String ramal) {
    super(idFunc, nome, email, documento);
    this.telefone = telefone;
    this.ramal = ramal;
  }
}