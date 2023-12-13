package com.miempresa.DTO;

import jakarta.validation.constraints.NotBlank;

public class SolicitudDTO {
    private String tipoDocumento;

    @NotBlank(message = "Campo obligatorio")
    private String numeroDocumento;

    @NotBlank(message = "Campo obligatorio")
    private String apellidoPaterno;

    @NotBlank(message = "Campo obligatorio")
    private String apellidoMaterno;

    @NotBlank(message = "Campo obligatorio")
    private String nombres;
    @NotBlank(message = "Campo obligatorio")
    private String fechaNacimiento;
   
    private String sexo;
   
    private String estadoCivil;

    @NotBlank(message = "Campo obligatorio")
    private String situacionLaboral;

    @NotBlank(message = "Campo obligatorio")
    private String rucEmpleador;

    private boolean aceptarTerminos;
    
    
    public SolicitudDTO() {
    	 
    }
	public SolicitudDTO(@NotBlank(message = "Campo obligatorio") String tipoDocumento,
			@NotBlank(message = "Campo obligatorio") String numeroDocumento,
			@NotBlank(message = "Campo obligatorio") String apellidoPaterno,
			@NotBlank(message = "Campo obligatorio") String apellidoMaterno,
			@NotBlank(message = "Campo obligatorio") String nombres, String fechaNacimiento, String sexo,
			String estadoCivil, @NotBlank(message = "Campo obligatorio") String situacionLaboral,
			@NotBlank(message = "Campo obligatorio") String rucEmpleador, boolean aceptarTerminos) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.nombres = nombres;
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.situacionLaboral = situacionLaboral;
		this.rucEmpleador = rucEmpleador;
		this.aceptarTerminos = aceptarTerminos;
		
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getSituacionLaboral() {
		return situacionLaboral;
	}
	public void setSituacionLaboral(String situacionLaboral) {
		this.situacionLaboral = situacionLaboral;
	}
	public String getRucEmpleador() {
		return rucEmpleador;
	}
	public void setRucEmpleador(String rucEmpleador) {
		this.rucEmpleador = rucEmpleador;
	}
	public boolean isAceptarTerminos() {
		return aceptarTerminos;
	}
	public void setAceptarTerminos(boolean aceptarTerminos) {
		this.aceptarTerminos = aceptarTerminos;
	}
	
    
    
}
