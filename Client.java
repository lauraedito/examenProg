package exn;

public class Client {
	 private String nombre;
	    private String apellidos;
	    private String fechaNacimiento;
	    private String telefono;
	    private String totalPagado;
	    private String foto;
	    
	    double precioMembresia;
	    String entrenadorAsignado,  fechaInicio,  fechaFinalizacion;
	    
	    public Client(String nombre, String apellidos, String fechaNacimiento, String telefono, String totalPagado, String foto) {
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
	    
	    public String getFechaNacimiento() {
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
	    
	    public Client(String nombre, String apellidos, String fechaNacimiento, String telefono, String foto,
                double precioMembresia, String entrenadorAsignado, String fechaInicio, String fechaFinalizacion) {
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

}
