/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Domain.Consulta;
import Domain.Medico;
import Domain.Paciente;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author rafael
 */
public class Dados {

    private static final ArrayList<Paciente> paciente = new ArrayList<>();
    private static final ArrayList<Medico> medico = new ArrayList<>();
    private static final ArrayList<Consulta> consulta = new ArrayList<>();

    public static ArrayList<Paciente> getPaciente() {
        return paciente;
    }

    public static void setPaciente(Paciente paciente) {
        Dados.paciente.add(paciente);
    }

    public static void delPaciente(String aux) {
        for (int i = 0; i < Dados.getPaciente().size(); i++) {
            if (Dados.getPaciente().get(i).getNome().equalsIgnoreCase(aux)) {
                Dados.getPaciente().remove(i);
                JOptionPane.showMessageDialog(null, "Paciente removido com sucesso!", "AVISO", 1);
                break;
            }
        }

    }

    public static ArrayList<Medico> getMedico() {
        return medico;
    }

    public static void setMedico(Medico medico) {
        Dados.medico.add(medico);
    }

    public static void delMedico(String aux) {
        for (int i = 0; i < Dados.getMedico().size(); i++) {
            if (Dados.getMedico().get(i).getNome().equalsIgnoreCase(aux)) {
                Dados.getMedico().remove(i);
                JOptionPane.showMessageDialog(null, "Médico removido com sucesso!", "AVISO", 1);
                break;
            }
        }

    }

    public static ArrayList<Consulta> getConsulta() {
        return consulta;
    }

    public static void setConsulta(Consulta consulta) {
        Dados.consulta.add(consulta);
    }

    public static void delConsulta(String aux) {
        for (int i = 0; i < Dados.getConsulta().size(); i++) {
            if (String.valueOf(Dados.getConsulta().get(i).getNumeroConsulta()).equalsIgnoreCase(aux)) {
                Dados.getConsulta().remove(i);
                JOptionPane.showMessageDialog(null, "Consulta removida com sucesso!", "AVISO", 1);
                break;
            }

        }
    }
}
