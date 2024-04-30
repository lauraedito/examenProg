package exn;

import java.util.Date;

public class Client {
	 private String nombre;
	    private String apellidos;
	    private Date fechaNacimiento;
	    private String telefono;
	    private String totalPagado;
	    private String foto;
	    
	    double precioMembresia;
	    String entrenadorAsignado;
	    Date fechaInicio,  fechaFinalizacion;
	    
	    public Client(String nombre, String apellidos, Date fechaNacimiento, String telefono, String totalPagado, String foto) {
	        this.nombre = nombre;
	        this.apellidos = apellidos;
	        this.fechaNacimiento = fechaNacimiento;
	        this.telefono = telefono;
	        this.totalPagado = "$1000";
	        this.foto = foto;
	    }
	    
	    public String getNombre() {
	        return nombre;
	    }
	    
	    public String getApellidos() {
	        return apellidos;
	    }
	    
	    public Date getFechaNacimiento() {
	        return fechaNacimiento;
	    }
	    
	    public String getTelefono() {
	        return telefono;
	    }
	    
	    public String getTotalPagado() {
	        return totalPagado;
	    }
	    
	    public String getFoto() {
	        return foto;
	    }
	    /*
	    public Client(String nombre, String apellidos, Date fechaNacimiento, String telefono, String foto,
                double precioMembresia, String entrenadorAsignado, Date fechaInicio, Date fechaFinalizacion) {
      this.nombre = nombre;
      this.apellidos = apellidos;
      this.fechaNacimiento = fechaNacimiento;
      this.telefono = telefono;
      this.totalPagado = "$" + precioMembresia; 
      this.foto = foto;
      this.precioMembresia = precioMembresia;
      this.entrenadorAsignado = entrenadorAsignado;
      this.fechaInicio = fechaInicio;
      this.fechaFinalizacion = fechaFinalizacion;
  }

		public String getEntrenadorAsignado() {
			return entrenadorAsignado;
		}

		public void setEntrenadorAsignado(String entrenadorAsignado) {
			this.entrenadorAsignado = entrenadorAsignado;
		}

		public  Date getFechaInicio() {
			return fechaInicio;
		}

		public void setFechaInicio(Date fechaInicio) {
			this.fechaInicio = fechaInicio;
		}

		public Date getFechaFinalizacion() {
			return fechaFinalizacion;
		}

		public void setFechaFinalizacion(Date fechaFinalizacion) {
			this.fechaFinalizacion = fechaFinalizacion;
		}

		public void setTotalPagado(String totalPagado) {
			this.totalPagado = totalPagado;
		}
	    */
	    

}
