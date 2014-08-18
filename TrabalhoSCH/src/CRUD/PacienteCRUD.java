/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRUD;

import Database.DataBase;
import Domain.Paciente;
import java.sql.Connection;

/**
 *
 * @author Adriano
 */
public class PacienteCRUD {
    
    public void inserir(Paciente paciente){
        Connection con;
        DataBase db = new DataBase();
        con = db.conectar("postgres", "cea016");
        
        
    }
    public void ler(){
        Connection con;
        DataBase db = new DataBase();
        con = db.conectar("postgres", "cea016");
        
    }
    public void deletar(){
        Connection con;
        DataBase db = new DataBase();
        con = db.conectar("postgres", "cea016");
        
    }
    public void atualizar(){
        Connection con;
        DataBase db = new DataBase();
        con = db.conectar("postgres", "cea016");
        
    }
    
    
    
}
