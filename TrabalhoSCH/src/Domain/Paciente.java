package Domain;

import javax.swing.JOptionPane;

public class Paciente {

    private String nome;
    private String cpf;
    private String rg;
    private String sexo;
    private String tel;
    private String endereco;
    private String cidade;
    private String estado;

    public Paciente() {

    }

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        // mensagem de erro caso o nome não seja informado
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O preenchimento do nome do paciente é obrigatório!", "ATENÇÃO", 2);
            return false;
        }
        // retorna confirmação da atribuição do nome
        this.nome = nome;
        return true;
    }

    public String getCpf() {
        return cpf;
    }

    public boolean setCpf(String cpf) {
        // mensagem de erro caso o cpf não seja informado
        if (cpf.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O preenchimento do cpf do paciente é obrigatório!", "ATENÇÃO", 2);
            return false;
        } // mensagem de erro caso o cpf não possua o tamanho correto
        else if (cpf.length() != 11) {
            JOptionPane.showMessageDialog(null, "O CPF deve possuir 11 digitos!", "ATENÇÃO", 2);
            return false;
        }
        // retorna confirmação da atribuição do cpf
        this.cpf = cpf;
        return true;
    }

    public String getEndereco() {
        return endereco;
    }

    public boolean setEndereco(String endereco) {
        // mensagem de erro caso o endereço não seja informado
        if (endereco.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O preenchimento do endereço do paciente é obrigatório!", "ATENÇÃO", 2);
            return false;
        }
        // retorna confirmação da atribuição do endereço
        this.endereco = endereco;
        return true;
    }

    public String getCidade() {
        return cidade;
    }

    public boolean setCidade(String cidade) {
        // mensagem de erro caso a cidade não seja informada
        if (cidade.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O preenchimento da cidade do paciente é obrigatório!", "ATENÇÃO", 2);
            return false;
        }
        // retorna confirmação da atribuição da cidade
        this.cidade = cidade;
        return true;
    }

    public String getEstado() {
        return estado;
    }

    public boolean setEstado(String estado) {
        // mensagem de erro caso o estado não seja informado
        if (estado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O preenchimento da UF do paciente é obrigatório!", "ATENÇÃO", 2);
            return false;
        }
        // mensagem de erro caso o tamanho da UF seja inválido
        if (estado.length() != 2) {
            JOptionPane.showMessageDialog(null, "A UF deve possuir somente 2 digitos!", "ATENÇÃO", 2);
            return false;
        }
        // retorna confirmação da atribuição do estado
        this.estado = estado;
        return true;
    }

    public String getTel() {
        return tel;
    }

    public boolean setTel(String tel) {
        // mensagem de erro caso o telefone não seja informado
        if (tel.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O preenchimento do telefone do paciente é obrigatório!", "ATENÇÃO", 2);
            return false;
        }
        // retorna confirmação da atribuição do telefone
        this.tel = tel;
        return true;
    }

    public String getRg() {
        return rg;
    }

    public boolean setRg(String rg) {
        // mensagem de erro caso o rg não seja informado
        if (rg.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O preenchimento do RG do paciente é obrigatório!", "ATENÇÃO", 2);
            return false;
        }
        // retorna confirmação da atribuição do rg
        this.rg = rg;
        return true;
    }

    public String getSexo() {
        return sexo;
    }

    public boolean setSexo(String sexo) {
        this.sexo = sexo;

        return true;
    }

}
