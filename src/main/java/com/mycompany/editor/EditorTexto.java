/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.editor;

import java.awt.Color;
import java.awt.Font;
import static java.awt.SystemColor.text;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author diegu
 */
public class EditorTexto extends javax.swing.JFrame {

    private File f;

    /**
     * Creates new form EditorTexto
     */
    public EditorTexto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nose = new javax.swing.JDialog();
        elegir = new javax.swing.JFileChooser();
        jDialog1 = new javax.swing.JDialog();
        guardar = new javax.swing.JFileChooser();
        eligeColores = new javax.swing.JDialog();
        elegirColor = new javax.swing.JColorChooser();
        Aplicar = new javax.swing.JButton();
        tamanoFuente = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        tamF = new javax.swing.JSpinner();
        lower = new javax.swing.JButton();
        upper = new javax.swing.JButton();
        dialogAcerca = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ubi = new javax.swing.JLabel();
        tam = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Texto = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        Archivos = new javax.swing.JMenu();
        Abrir = new javax.swing.JMenuItem();
        Guardar = new javax.swing.JMenuItem();
        Guardarcomo = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenuItem();
        Formato = new javax.swing.JMenu();
        Fuente = new javax.swing.JMenuItem();
        Color = new javax.swing.JMenuItem();
        acerca = new javax.swing.JMenu();
        acercaItem = new javax.swing.JMenuItem();

        elegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elegirActionPerformed(evt);
            }
        });
        nose.getContentPane().add(elegir, java.awt.BorderLayout.CENTER);

        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(guardar, java.awt.BorderLayout.CENTER);

        eligeColores.getContentPane().add(elegirColor, java.awt.BorderLayout.CENTER);

        Aplicar.setText("Aplicar");
        Aplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AplicarActionPerformed(evt);
            }
        });
        eligeColores.getContentPane().add(Aplicar, java.awt.BorderLayout.PAGE_END);

        tamF.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tamFStateChanged(evt);
            }
        });

        lower.setText("LowerCase");
        lower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowerActionPerformed(evt);
            }
        });

        upper.setText("UpperCase");
        upper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upperActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(lower)
                .addGap(26, 26, 26)
                .addComponent(upper)
                .addGap(27, 27, 27)
                .addComponent(tamF, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tamF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lower)
                    .addComponent(upper))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tamanoFuenteLayout = new javax.swing.GroupLayout(tamanoFuente.getContentPane());
        tamanoFuente.getContentPane().setLayout(tamanoFuenteLayout);
        tamanoFuenteLayout.setHorizontalGroup(
            tamanoFuenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
            .addGroup(tamanoFuenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tamanoFuenteLayout.createSequentialGroup()
                    .addGap(0, 32, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 32, Short.MAX_VALUE)))
        );
        tamanoFuenteLayout.setVerticalGroup(
            tamanoFuenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(tamanoFuenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tamanoFuenteLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel2.setText("Referencias tomadas de StackOverflow y Java API.");

        jLabel3.setText("https://github.com/IlDiegos");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel1.setText("Desarrollado por Diego Gaitán Martín. ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel3))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5);

        javax.swing.GroupLayout dialogAcercaLayout = new javax.swing.GroupLayout(dialogAcerca.getContentPane());
        dialogAcerca.getContentPane().setLayout(dialogAcercaLayout);
        dialogAcercaLayout.setHorizontalGroup(
            dialogAcercaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAcercaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        dialogAcercaLayout.setVerticalGroup(
            dialogAcercaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ubi.setText("Ubicación:");

        tam.setText("Tamaño:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ubi, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(tam, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ubi)
                    .addComponent(tam))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        Texto.setColumns(20);
        Texto.setRows(5);
        jScrollPane1.setViewportView(Texto);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addContainerGap())
        );

        Archivos.setText("Archivo");

        Abrir.setText("Abrir");
        Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirActionPerformed(evt);
            }
        });
        Archivos.add(Abrir);

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        Archivos.add(Guardar);

        Guardarcomo.setText("Guardar como");
        Guardarcomo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarcomoActionPerformed(evt);
            }
        });
        Archivos.add(Guardarcomo);

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        Archivos.add(Salir);

        jMenuBar1.add(Archivos);

        Formato.setText("Formato");

        Fuente.setText("Fuente");
        Fuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuenteActionPerformed(evt);
            }
        });
        Formato.add(Fuente);

        Color.setText("Color");
        Color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorActionPerformed(evt);
            }
        });
        Formato.add(Color);

        jMenuBar1.add(Formato);

        acerca.setText("Acerca de");
        acerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercaActionPerformed(evt);
            }
        });

        acercaItem.setText("Proyecto");
        acercaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercaItemActionPerformed(evt);
            }
        });
        acerca.add(acercaItem);

        jMenuBar1.add(acerca);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirActionPerformed

        //Mostrar sirve para mostrar el archivo seleccionado
        int mostrar = elegir.showOpenDialog(null);
        if (mostrar == JFileChooser.APPROVE_OPTION) {
            f = elegir.getSelectedFile();
        }

        if (Texto.getText().length() > 0) {
            Texto.setText("");
        }

        //Buffered para almacenar el archivo seleccionado, en este caso el archivo File F
        try ( BufferedReader br = new BufferedReader(new FileReader(f))) {
            ubi.setText("" + f.getAbsolutePath());
            tam.setText(""+f.length() +" Bytes");
            Iterator<String> it = br.lines().iterator();

            //Lee las lineas del archivo
            while (it.hasNext()) {
                String s = it.next();
                Texto.append(s + "\n");

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(EditorTexto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EditorTexto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_AbrirActionPerformed

    private void FuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuenteActionPerformed
        tamanoFuente.setSize(500, 200);
        tamanoFuente.setVisible(true);
    }//GEN-LAST:event_FuenteActionPerformed

    private void GuardarcomoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarcomoActionPerformed
        //Mostrar sirve para mostrar el archivo seleccionado
        int mostrar = guardar.showSaveDialog(null);
        if (mostrar == JFileChooser.APPROVE_OPTION) {
            f = guardar.getSelectedFile();
        }

        try ( FileWriter fw = new FileWriter(f)) {
            fw.write(Texto.getText());
            ubi.setText(f.getAbsolutePath());

        } catch (IOException ex) {
            Logger.getLogger(EditorTexto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_GuardarcomoActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void elegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elegirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elegirActionPerformed

    private void acercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercaActionPerformed
       
    }//GEN-LAST:event_acercaActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed

        try ( FileWriter fw = new FileWriter(f)) {
            fw.write(Texto.getText());

        } catch (IOException ex) {
            Logger.getLogger(EditorTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void ColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorActionPerformed
        eligeColores.setSize(600, 300);  
        eligeColores.setVisible(true);
          
    }//GEN-LAST:event_ColorActionPerformed

    private void AplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AplicarActionPerformed
        Color colorFuente = elegirColor.getColor();
        Texto.setForeground(colorFuente);
    }//GEN-LAST:event_AplicarActionPerformed

    private void tamFStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tamFStateChanged
        Font fuente = new Font(Texto.getFont().getName(), Texto.getFont().getStyle(), (int) tamF.getValue() );
        Texto.setFont(fuente);
        
        
    }//GEN-LAST:event_tamFStateChanged

    private void acercaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercaItemActionPerformed
         dialogAcerca.setSize(400, 200);
         dialogAcerca.setVisible(true);
    }//GEN-LAST:event_acercaItemActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void lowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowerActionPerformed
        Texto.setText(Texto.getText().toLowerCase());
    }//GEN-LAST:event_lowerActionPerformed

    private void upperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upperActionPerformed
        Texto.setText(Texto.getText().toUpperCase());
    }//GEN-LAST:event_upperActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditorTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditorTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditorTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditorTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditorTexto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Abrir;
    private javax.swing.JButton Aplicar;
    private javax.swing.JMenu Archivos;
    private javax.swing.JMenuItem Color;
    private javax.swing.JMenu Formato;
    private javax.swing.JMenuItem Fuente;
    private javax.swing.JMenuItem Guardar;
    private javax.swing.JMenuItem Guardarcomo;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JTextArea Texto;
    private javax.swing.JMenu acerca;
    private javax.swing.JMenuItem acercaItem;
    private javax.swing.JDialog dialogAcerca;
    private javax.swing.JFileChooser elegir;
    private javax.swing.JColorChooser elegirColor;
    private javax.swing.JDialog eligeColores;
    private javax.swing.JFileChooser guardar;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lower;
    private javax.swing.JDialog nose;
    private javax.swing.JLabel tam;
    private javax.swing.JSpinner tamF;
    private javax.swing.JDialog tamanoFuente;
    private javax.swing.JLabel ubi;
    private javax.swing.JButton upper;
    // End of variables declaration//GEN-END:variables
}
