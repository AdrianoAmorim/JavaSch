package Domain;

import javax.swing.JOptionPane;

public class Medico {

    private String nome;
    private String crm;
    private String especialidade;

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        // mensagem de erro caso o nome não seja informado
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O preenchimento do nome do médico é obrigatório!", "ATENÇÃO", 2);
            return false;
        }
        // retorna confirmação da atribuição do nome
        this.nome = nome;
        return true;
    }

    public String getCrm() {
        return crm;
    }

    public boolean setCrm(String crm) {
        // mensagem de erro caso o crm não seja informado
        if (crm.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O preenchimento do número do CRM é obrigatório!", "ATENÇÃO", 2);
            return false;
        }
        // retorna confirmação da atribuição do crm
        this.crm = crm;
        return true;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public boolean setEspecialidade(String especialidade) {
        // mensagem de erro caso a especialidade não seja informada
        if (especialidade.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O preenchimento da especialidade é obrigatório!", "ATENÇÃO", 2);
            return false;
        }
        // retorna confirmação da atribuição da especialidade
        this.especialidade = especialidade;
        return true;
    }

}
