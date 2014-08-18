package View;

import Database.DataBase;

public class Main {

    public static void main(String[] args) {
        DataBase db = new DataBase();
        
        db.conectar("postgres", "cea016");
        FrmSplash splash = new FrmSplash();
        splash.setVisible(true);
        
    }

}
