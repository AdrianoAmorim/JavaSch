package Domain;

import javax.swing.JOptionPane;

public class Consulta {

    private int numeroConsulta;
    private String medico;
    private String paciente;
    private String data;
    private String horario;

    public int getNumeroConsulta() {
        return numeroConsulta;
    }

    public boolean setNumeroConsulta(int numeroConsulta) {
        // mensagem de erro caso o número da consulta não seja informado
        if (numeroConsulta == 0) {
            JOptionPane.showMessageDialog(null, "O preenchimento do número da consulta é obrigatório!", "ATENÇÃO", 2);
            return false;
        }
        // retorna confirmação da atribuição do nome
        this.numeroConsulta = numeroConsulta;
        return true;
    }

    public String getMedico() {
        return medico;
    }

    public boolean setMedico(String medico) {
        // mensagem de erro caso o medico da consulta não seja informado
        if (medico.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O preenchimento do médico da consulta é obrigatório!", "ATENÇÃO", 2);
            return false;
        }
        // retorna confirmação da atribuição do medico
        this.medico = medico;
        return true;
    }

    public String getPaciente() {
        return paciente;
    }

    public boolean setPaciente(String paciente) {
        // mensagem de erro caso o paciente da consulta não seja informado
        if (paciente.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O preenchimento do paciente da consulta é obrigatório!", "ATENÇÃO", 2);
            return false;
        }
        // retorna confirmação da atribuição do paciente
        this.paciente = paciente;
        return true;
    }

    public String getData() {
        return data;
    }

    public boolean setData(String data) {
        // mensagem de erro caso a data da consulta não seja informada
        if (data.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O preenchimento da data da consulta é obrigatório!", "ATENÇÃO", 2);
            return false;
        }
        // retorna confirmação da atribuição da data
        this.data = data;
        return true;
    }

    public String getHorario() {
        return horario;
    }

    public boolean setHorario(String horario) {
        // mensagem de erro caso o horario da consulta não seja informado
        if (horario.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O preenchimento do horário da consulta é obrigatório!", "ATENÇÃO", 2);
            return false;
        }
        // retorna confirmação da atribuição do paciente
        this.horario = horario;
        return true;
    }

}
