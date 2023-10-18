 import models.Gerente;
 import models.ControlePonto;
 import models.Operador;
 import models.Secretaria;

class GerenciarControlePonto {
  public static void main(String[] args) {
    Gerente gerente = new Gerente(1, "Gerente Marcão", "marcao@gmail.com", "428.000.123-13", "marcos.gerente",
            "senhaDoMarcos$");
    Operador operador = new Operador(1, "Operador João", "tugrp@example.com", "123456789", 20);
    Secretaria secretaria = new Secretaria(2, "Secretária Maria", "tugrp1@example.com", "987654321", "123456", "ramal");

    ControlePonto controleGerente = new ControlePonto();
    ControlePonto controleOperador = new ControlePonto();
    ControlePonto controleSecretaria = new ControlePonto();

    controleGerente.registraEntrada(gerente);
    controleGerente.registraSaida(gerente);

    controleOperador.registraEntrada(operador);
    controleOperador.registraSaida(operador);

    controleSecretaria.registraEntrada(secretaria);
    controleSecretaria.registraSaida(secretaria);
  }

}
