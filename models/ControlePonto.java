package models;

import java.util.Random;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class ControlePonto {
  public String registraEntrada(Funcionario f) {
    try {
      Thread.sleep(1000);
      RegistroPonto registro = new RegistroPonto();
      registro.setIdRegPonto(new Random().nextLong());
      registro.setFunc(f);
      registro.setDataRegistro(LocalDate.now());
      registro.setHoraEntrada(LocalDateTime.now());

      System.out.println(DateUtils.getFormattedDate(registro.getHoraEntrada()) + " - Entrada de " + f.getNome());
      return DateUtils.getFormattedDate(registro.getHoraEntrada()) + " - Entrada de " + f.getNome();

    } catch (InterruptedException ex) {

      Thread.currentThread().interrupt();
      return "";

    }

  }

  public String registraSaida(Funcionario f) {
    try {
      RegistroPonto registro = new RegistroPonto();
      Thread.sleep(1000);
      registro.setIdRegPonto(new Random().nextLong());
      registro.setFunc(f);
      registro.setDataRegistro(LocalDate.now());
      registro.setHoraSaida(LocalDateTime.now());

      System.out.println(DateUtils.getFormattedDate(registro.getHoraSaida()) + " - Saída de " + f.getNome());
      return DateUtils.getFormattedDate(registro.getHoraSaida()) + " - Saída de " + f.getNome();

    } catch (InterruptedException ex) {

      Thread.currentThread().interrupt();
      return "";

    }
  }
}