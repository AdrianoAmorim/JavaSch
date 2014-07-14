/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import com.sun.awt.AWTUtilities;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Adriano
 */
public class FrmSplash extends javax.swing.JFrame {

    /**
     * Creates new form FrmSplash
     */
    public FrmSplash() {
        initComponents();
        this.setTransparencia(this);
        this.carregarLoad();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pbSplash = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 300));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        pbSplash.setStringPainted(true);
        pbSplash.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                pbSplashStateChanged(evt);
            }
        });
        getContentPane().add(pbSplash);
        pbSplash.setBounds(80, 260, 410, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imgSplash.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 550, 300);

        setSize(new java.awt.Dimension(550, 297));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//metodo que faz o efeito fade-out e chama o menu principal
    private void pbSplashStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_pbSplashStateChanged
        FrmPrincipal principal = new FrmPrincipal();
        if (pbSplash.getValue() == 100) {
            System.out.println("oi");
            for (float i = 1.0f; i >= 0f; i -= 0.1f) {
                AWTUtilities.setWindowOpacity(this, i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException ex) {
                    JOptionPane.showMessageDialog(null, "Erro Ao finalizar a Opacidade.");
                }

            }

            principal.setVisible(true);
            this.dispose();
        }


    }//GEN-LAST:event_pbSplashStateChanged

//metodo que carrega a barra de progresso de 0 a 100
    public void carregarLoad() {
        new Thread() {
            public void run() {
                for (int i = 0; i < 101; i++) {
                    try {
                        sleep(20);
                        pbSplash.setValue(i);
                    } catch (InterruptedException ex) {
                        JOptionPane.showMessageDialog(null, "Erro Ao Carregar barra de Progresso.");
                    }
                }
            }
        }.start();
    }

    //metodo que transforma o frame todo transparente
    public void setTransparencia(JFrame frame) {
        AWTUtilities.setWindowOpaque(frame, false);
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar pbSplash;
    // End of variables declaration//GEN-END:variables
}
