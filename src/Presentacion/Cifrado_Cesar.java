package Presentacion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import Dominio.*;
import javax.swing.JOptionPane;

public class Cifrado_Cesar extends javax.swing.JFrame {

    Cesar cifra = new Cesar();
    String num1 = "9876543210";
    String abc1 = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
    String num = "0123456789";
    String abc  = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    public Cifrado_Cesar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Entrada = new javax.swing.JTextField();
        Cifrado = new javax.swing.JButton();
        Descifrado = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        msj = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Cifrado Cesar");

        jLabel2.setText("Ingrese la frase a modificar");

        Cifrado.setText("Cifrar");
        Cifrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CifradoActionPerformed(evt);
            }
        });

        Descifrado.setText("Descifrar");
        Descifrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescifradoActionPerformed(evt);
            }
        });

        Exit.setText("Salir");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        msj.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(186, 186, 186))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(155, 155, 155))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Entrada)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Cifrado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                        .addComponent(Descifrado)
                        .addGap(123, 123, 123)
                        .addComponent(Exit))
                    .addComponent(msj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(msj, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cifrado)
                    .addComponent(Descifrado)
                    .addComponent(Exit))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void DescifradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescifradoActionPerformed
        String input = Entrada.getText().toUpperCase();
        msj.setText(" ");
        if(valida(input)){
            
            String res = cifra.char_type(input, 4, abc1, num1);
            JOptionPane.showMessageDialog(null, "El mensaje desencriptado es: \n"
                    + res);
            
        }else{
            msj.setText("Esta cadena no es válida");
        }
    }//GEN-LAST:event_DescifradoActionPerformed
    private void CifradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CifradoActionPerformed
        String input = Entrada.getText().toUpperCase();
        msj.setText(" ");
        if(valida(input)){
            
            String res = cifra.char_type(input,4,abc, num);
            JOptionPane.showMessageDialog(null, "El mensaje encriptado es: \n"
                    + res);
            
        }else{
            
            msj.setText("Cadena inválida");
            
        }
    }//GEN-LAST:event_CifradoActionPerformed
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cifrado;
    private javax.swing.JButton Descifrado;
    private javax.swing.JTextField Entrada;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel msj;
    // End of variables declaration//GEN-END:variables
    public boolean valida(String input) {
        String rex = "^([A-Z0-9]+ ?)*[A-Z0-9]+";
        Pattern pat = Pattern.compile(rex);
        Matcher mat = pat.matcher(input);
        if (mat.matches()) {
            return true;
        } else {
            return false;
        }
    }
}
