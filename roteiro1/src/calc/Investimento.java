package calc;

public class Investimento
{
 private int meses;
 private double juros;
 private double deposito_mensal;

 public Investimento(int NumdeMesesi, double JurosaoMesd, double DepositoMensald) {
	 meses = NumdeMesesi;
	 juros = JurosaoMesd/100;
	 deposito_mensal = DepositoMensald;
}

public double calculaTotal(double depositoMensald, int numdeMesesi, double jurosaoMesd) {
 int num_pagamentos = meses;
 double total = 0;
 for (int i = 0; i < num_pagamentos; i++) {
 total = total + deposito_mensal;
 total = total + total * juros;
 }
 return total;
 }
}

