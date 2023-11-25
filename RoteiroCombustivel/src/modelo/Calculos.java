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

	public Float calc_oleoml(Float ol500f, Float quantFmlF) {
		
		float tt = ol500f * quantFmlF;
		
		return tt;
	}

	public Float calc_oleo1l(Float olF1F, Float quantFlF) {
		
		float tt = olF1F * quantFlF;
		
		return tt;
	}

	public Float calc_oleo(Float totaloleo500, Float totaloleo1l) {
		//Float valorml = (float) 0.5;
		
			Float tt = totaloleo500 + totaloleo1l;
		
		return tt;
	}

	public Float calc_total(Float totalcombus, Float totaloleo) {
		
		float tt = totalcombus + totaloleo;
		
		return tt;
	}

	public Float calc_desc(Float total) {
		
		float tt = (float) (total - (total * 0.10));
		
		return tt;
	}

	public Float calc_atrazo(Float total) {
		
		float tt = (float) (total + (total * 0.10));
		
		return tt;
	}


	
	
}
