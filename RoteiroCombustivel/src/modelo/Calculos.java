package modelo;

public class Calculos {

	public float calc_combustivel(Float oleoDF, Float gasCF, Float gasAF, Float etanolF, Combustivel tipo, Float quantLitrosF) {
		float tt = 0;
			if (tipo == Combustivel.Diesel) {
			tt = oleoDF * quantLitrosF;
		} 
		else if(tipo == Combustivel.Comum) {
			tt = gasCF * quantLitrosF;
		} 
		else if(tipo == Combustivel.Aditivada) {
			tt = gasAF * quantLitrosF;
		} 
		else if(tipo == Combustivel.Etanol) {
			tt = etanolF * quantLitrosF;
		}
		return tt;
	}

	
	
}
