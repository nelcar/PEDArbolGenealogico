package arbolgenealogico;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class main extends javax.swing.JFrame {

    public main() {
        initComponents();
        panelAbrirNuevo.setVisible(false);
        panelNew.setVisible(false);
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signInDialog = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        signInDialogName = new javax.swing.JTextField();
        signInDialogPassword = new javax.swing.JTextField();
        CreateAcount = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mainUser = new javax.swing.JTextField();
        mainPassword = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        panelAbrirNuevo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        mainNew = new javax.swing.JButton();
        panelNew = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        AddFather = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        signIn = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.blue);
        jLabel7.setText("Nombre:");

        CreateAcount.setBackground(java.awt.Color.red);
        CreateAcount.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CreateAcount.setForeground(new java.awt.Color(255, 255, 255));
        CreateAcount.setText("Crear");
        CreateAcount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAcountActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(java.awt.Color.blue);
        jLabel9.setText("Contraseña:");

        javax.swing.GroupLayout signInDialogLayout = new javax.swing.GroupLayout(signInDialog.getContentPane());
        signInDialog.getContentPane().setLayout(signInDialogLayout);
        signInDialogLayout.setHorizontalGroup(
            signInDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signInDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(signInDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signInDialogLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(37, 37, 37)
                        .addComponent(signInDialogName))
                    .addGroup(signInDialogLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signInDialogPassword)))
                .addContainerGap())
            .addGroup(signInDialogLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(CreateAcount)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        signInDialogLayout.setVerticalGroup(
            signInDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signInDialogLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(signInDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(signInDialogName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(signInDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(signInDialogPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CreateAcount)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Árbol Genealógico");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Árbol Genealógico");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel4.setForeground(java.awt.Color.blue);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        jLabel4.setText("Usuario:");

        jLabel5.setForeground(java.awt.Color.blue);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/contraseña.png"))); // NOI18N
        jLabel5.setText("Contraseña:");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(java.awt.Color.red);
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iniciar Sesion.png"))); // NOI18N
        jButton3.setText("Iniciar Sesión");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.blue);
        jLabel2.setText("Abrir");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abrir.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.blue);
        jLabel3.setText("Nuevo");

        mainNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        mainNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAbrirNuevoLayout = new javax.swing.GroupLayout(panelAbrirNuevo);
        panelAbrirNuevo.setLayout(panelAbrirNuevoLayout);
        panelAbrirNuevoLayout.setHorizontalGroup(
            panelAbrirNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAbrirNuevoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelAbrirNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelAbrirNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(mainNew))
                .addGap(31, 31, 31))
        );
        panelAbrirNuevoLayout.setVerticalGroup(
            panelAbrirNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAbrirNuevoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelAbrirNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addGap(29, 29, 29)
                .addGroup(panelAbrirNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(mainNew))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jLabel6.setText("descripcion");

        AddFather.setText("Agregar Principal");
        AddFather.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddFatherActionPerformed(evt);
            }
        });

        jButton5.setText("Agregar Hijo");

        javax.swing.GroupLayout panelNewLayout = new javax.swing.GroupLayout(panelNew);
        panelNew.setLayout(panelNewLayout);
        panelNewLayout.setHorizontalGroup(
            panelNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(AddFather)
                    .addComponent(jButton5))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        panelNewLayout.setVerticalGroup(
            panelNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNewLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addGap(43, 43, 43)
                .addComponent(AddFather)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 591, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        jMenu1.setText("File");

        signIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registro.jpg"))); // NOI18N
        signIn.setText("Registro");
        signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInActionPerformed(evt);
            }
        });
        jMenu1.add(signIn);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar sesion.gif"))); // NOI18N
        jMenuItem2.setText("Cerrar Sesión");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mainUser, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mainPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelAbrirNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(mainUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(mainPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelAbrirNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 42, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddFatherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddFatherActionPerformed
        node = new Nodo("");
        tree.insertarNodo("Familia", "Familia");
        tree.insertarNodo("nelson", "Familia");

        tree.graficarArbol(tree);
    }//GEN-LAST:event_AddFatherActionPerformed

    private void signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInActionPerformed
        signInDialog.pack();
        signInDialog.setModal(true);
        signInDialog.setLocationRelativeTo(this);
        signInDialog.setVisible(true);
    }//GEN-LAST:event_signInActionPerformed

    private void CreateAcountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAcountActionPerformed
        Usuario user = new Usuario();
        user.setNombre(signInDialogName.getText());
        user.setContraseña(signInDialogPassword.getText());

        users.add(user);

        //Guardar Archivo
        File archivo = null;
        try {
            archivo = new File("./User.ncr");
            if (!archivo.exists()) {
                FileOutputStream salida = new FileOutputStream(archivo);
                ObjectOutputStream objeto = new ObjectOutputStream(salida);
                objeto.writeObject(users);
                objeto.flush();
                objeto.close();
                salida.close();
            } else {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                Usuario temp;
                try {
                    while ((temp = (Usuario) objeto.readObject()) != null) {
                        users.add(temp);
                    }
                } catch (Exception e) {

                } finally {
                    entrada.close();
                    objeto.close();
                }
                users.add(user);

                //sobreescribir
                FileOutputStream salida2 = new FileOutputStream(archivo);
                ObjectOutputStream objeto2 = new ObjectOutputStream(salida2);
                for (Usuario per : users) {
                    objeto2.writeObject(per);
                }
                objeto2.flush();
                objeto2.close();
                salida2.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El Usuario no se guardo");
        }
        signInDialogName.setText("");
        signInDialogPassword.setText("");
        JOptionPane.showMessageDialog(this, "El Usuario se creo con éxito");
    }//GEN-LAST:event_CreateAcountActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        File archivo = null;
        try {
            archivo = new File("./User.ncr");
            FileInputStream entrada = new FileInputStream(archivo);
            ObjectInputStream objeto = new ObjectInputStream(entrada);
            Usuario temp;
            int cont = 0;
            try {
                
                while ((temp = (Usuario) objeto.readObject()) != null) {
                    if (temp.getNombre().equals(mainUser.getText()) && temp.getContraseña().equals(mainPassword.getText())) {
                        panelAbrirNuevo.setVisible(true);
                        mainUser.setEditable(false);
                        mainPassword.setEditable(false);
                        cont++;
                    }
                }
                System.out.println("sale");
                
            } catch (Exception e) {
                //JOptionPane.showMessageDialog(this, "El usuario o la contraceña son incorrectas");
                if (cont == 0) {
                    mainUser.setText("");
                    mainPassword.setText("");
                }
            } finally {
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {

        } finally {

        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void mainNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainNewActionPerformed
        panelNew.setVisible(true);
    }//GEN-LAST:event_mainNewActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddFather;
    private javax.swing.JButton CreateAcount;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton mainNew;
    private javax.swing.JPasswordField mainPassword;
    private javax.swing.JTextField mainUser;
    private javax.swing.JPanel panelAbrirNuevo;
    private javax.swing.JPanel panelNew;
    private javax.swing.JMenuItem signIn;
    private javax.swing.JDialog signInDialog;
    private javax.swing.JTextField signInDialogName;
    private javax.swing.JTextField signInDialogPassword;
    // End of variables declaration//GEN-END:variables
   private TDAArbol tree = new TDAArbol();
    private Nodo node;
    private ArrayList<Usuario> users = new ArrayList();

}
