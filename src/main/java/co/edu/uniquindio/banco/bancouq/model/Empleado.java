package co.edu.uniquindio.banco.bancouq.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Empleado extends Persona{

	
	private String rol;
	private String eventoAsignado;
	ArrayList<Cliente> listaClientesAsociados = new ArrayList<Cliente>();

	
	public Empleado() {
		
	}
	
	
	public String getCodigo() {
		return eventoAsignado;
	}

	public void setEventoAsignado(String eventoAsignado) {
		this.eventoAsignado = eventoAsignado;
	}

	public String getRol() {
		return rol;
	}


	public void setRol(String rol) {
		this.rol = rol;
	}


	public ArrayList<Cliente> getListaClientesAsociados() {
		return listaClientesAsociados;
	}


	public void setListaClientesAsociados(ArrayList<Cliente> listClientesAsociados) {
		this.listaClientesAsociados = listClientesAsociados;
	}
	
	
	
}
