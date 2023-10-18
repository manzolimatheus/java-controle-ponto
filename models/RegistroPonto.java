package models;

import java.time.LocalDateTime;
import java.time.LocalDate;

public class RegistroPonto {
  private Long idRegPonto;
  private Funcionario func;
  private LocalDate dataRegistro;
  private LocalDateTime horaEntrada;
  private LocalDateTime horaSaida;

  public Long getIdRegPonto() {
    return idRegPonto;
  }

  public Funcionario getFunc() {
    return func;
  }

  public LocalDate getDataRegistro() {
    return dataRegistro;
  }

  public LocalDateTime getHoraEntrada() {
    return horaEntrada;
  }

  public LocalDateTime getHoraSaida() {
    return horaSaida;
  }

  public void setIdRegPonto(Long idRegPonto) {
    this.idRegPonto = idRegPonto;
  }

  public void setFunc(Funcionario func) {
    this.func = func;
  }

  public void setDataRegistro(LocalDate dataRegistro) {
    this.dataRegistro = dataRegistro;
  }

  public void setHoraEntrada(LocalDateTime horaEntrada) {
    this.horaEntrada = horaEntrada;
  }

  public void setHoraSaida(LocalDateTime horaSaida) {
    this.horaSaida = horaSaida;
  }

}