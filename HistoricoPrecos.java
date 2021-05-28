package projetoIntegrador;

import java.time.chrono.ChronoLocalDate;

public class HistoricoPrecos {
	
	private String TipoCombustivel;
	private ChronoLocalDate data;
	private String hora;
	private float valorCombustivel;
	
	public String getTipoCombustivel() {
		return TipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		TipoCombustivel = tipoCombustivel;
	}
	public ChronoLocalDate getData() {
		return data;
	}
	public void setData(ChronoLocalDate data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public float getValorCombustivel() {
		return valorCombustivel;
	}
	public void setValorCombustivel(float valorCombustivel) {
		this.valorCombustivel = valorCombustivel;
	}

}
