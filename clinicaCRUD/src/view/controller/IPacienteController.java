package view.controller;

import java.sql.SQLException;

import view.model.Paciente;

public interface IPacienteController {

	public void inserirPaciente(Paciente p) throws ClassNotFoundException, SQLException;
	public void atualizarPaciente(Paciente p) throws ClassNotFoundException, SQLException;
	public void excluirPaciente(Paciente p) throws ClassNotFoundException, SQLException;
	public void buscaPaciente(Paciente p) throws ClassNotFoundException, SQLException;
	public void listarPacientes() throws ClassNotFoundException, SQLException;

	
}
