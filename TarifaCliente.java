package exn;

import java.util.Date;

public class TarifaCliente {
	private String cliente;
    private String telefono;
    private double cuotaMensual;
    private Date fechaInicio;
    private Date fechaFin;
    private String entrenador;

    public TarifaCliente(String cliente, String telefono, double cuotaMensual, Date fechaInicio, Date fechaFin, String entrenador) {
        this.cliente = cliente;
        this.telefono = telefono;
        this.cuotaMensual = cuotaMensual;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.entrenador = entrenador;
    }

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public double getCuotaMensual() {
		return cuotaMensual;
	}

	public void setCuotaMensual(double cuotaMensual) {
		this.cuotaMensual = cuotaMensual;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(String entrenador) {
		this.entrenador = entrenador;
	}
    
    

}
