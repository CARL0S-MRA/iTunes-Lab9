
package lab9_itunes;
import javax.swing.JOptionPane;
import lab9_itunes.Song;

public class JTunes extends javax.swing.JFrame {
    private Song[] canciones;
   
    public JTunes(int tamanio) {
        initComponents();
        canciones = new Song[tamanio];
    }
    
    /*
    public JTunes(int tamanio){
        canciones =new Song[tamanio];
    }
    */
    
    
    private Song searchSong(int codigo){
        for (Song cancion : canciones) {
            if (cancion !=null && cancion.getCodigo() == codigo) {
                return cancion;
            }
        }
        return null;
    }
    
   
    
    //
   
    
    
// Dont Delete this---------------------  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtagregarNombre = new javax.swing.JTextField();
        ITUNES = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jLCodigo = new javax.swing.JLabel();
        txtagregarCodigo = new javax.swing.JTextField();
        jLprecio = new javax.swing.JLabel();
        txtagregarPrecio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLcodigo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtrateCodigo = new javax.swing.JTextField();
        jLEstrellas = new javax.swing.JLabel();
        txtrateEstrellas = new javax.swing.JTextField();
        bnAgregar = new javax.swing.JButton();
        bnCalificar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtBuscarCodigo = new javax.swing.JTextField();
        bnBuscarCancion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ITUNES.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ITUNES.setText("iTunes");

        jLNombre.setText("Nombre");

        jLCodigo.setText("Codigo");

        jLprecio.setText("Precio");

        jLabel1.setText("Agregar Cancion");

        jLabel2.setText("Calificar Cancion");

        jLcodigo.setText("Codigo");

        jLabel3.setText("Buscar Cancion");

        jLEstrellas.setText("Estrellas");

        bnAgregar.setText("Add");
        bnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnAgregarActionPerformed(evt);
            }
        });

        bnCalificar.setText("Rate");
        bnCalificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnCalificarActionPerformed(evt);
            }
        });

        jLabel4.setText("Codigo");

        bnBuscarCancion.setText("Search");
        bnBuscarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnBuscarCancionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel1)
                .addGap(260, 260, 260)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(135, 135, 135))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLprecio)
                                .addGap(18, 18, 18)
                                .addComponent(txtagregarPrecio))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtagregarCodigo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtagregarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(154, 154, 154)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLcodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtrateCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(204, 204, 204)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLEstrellas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtrateEstrellas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(498, 498, 498)
                        .addComponent(ITUNES, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(bnAgregar)
                .addGap(301, 301, 301)
                .addComponent(bnCalificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bnBuscarCancion)
                .addGap(141, 141, 141))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ITUNES, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtagregarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNombre)
                    .addComponent(jLcodigo)
                    .addComponent(txtrateCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigo)
                    .addComponent(txtagregarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLEstrellas)
                    .addComponent(txtrateEstrellas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLprecio)
                    .addComponent(txtagregarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnAgregar)
                    .addComponent(bnCalificar)
                    .addComponent(bnBuscarCancion))
                .addContainerGap(167, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnCalificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnCalificarActionPerformed
        int codigo = Integer.parseInt(txtrateCodigo.getText());
        int estrellas = Integer.parseInt(txtrateEstrellas.getText());
        Song cancion = searchSong(codigo);
        
        if (cancion !=null) {
            cancion.addStars(estrellas);
            JOptionPane.showMessageDialog(null,"Cancion calificada");
        } else{
            JOptionPane.showMessageDialog(null,"No existe el codigo de la cancion");
        }
    }//GEN-LAST:event_bnCalificarActionPerformed

    private void bnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnAgregarActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.parseInt(txtagregarCodigo.getText());
        String nombre = txtagregarNombre.getText();
        double precio = Double.parseDouble(txtagregarPrecio.getText());
        
        if (searchSong(codigo) !=null) {
            JOptionPane.showMessageDialog(null, "Ya existe una cancion con ese codigo");
            return;
        }
        for (int i = 0; i < canciones.length; i++) {
            if (canciones[i] == null) {
                canciones[i] = new Song(codigo, nombre, precio);
                JOptionPane.showMessageDialog(null,"Cancion agregada con exito!");
                return;
            }
        }
    
    }//GEN-LAST:event_bnAgregarActionPerformed

    private void bnBuscarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnBuscarCancionActionPerformed
        int codigo = Integer.parseInt(txtBuscarCodigo.getText());
        Song cancion = searchSong(codigo);
        
        if (cancion !=null) {
            JOptionPane.showMessageDialog(null,"Cancion encontrada!");
        }else{
            JOptionPane.showMessageDialog(null,"No existe una cancion con ese codigo");
        }
    }//GEN-LAST:event_bnBuscarCancionActionPerformed
//--------------------------------------
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
            java.util.logging.Logger.getLogger(JTunes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JTunes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JTunes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JTunes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ITUNES;
    private javax.swing.JButton bnAgregar;
    private javax.swing.JButton bnBuscarCancion;
    private javax.swing.JButton bnCalificar;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLEstrellas;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLcodigo;
    private javax.swing.JLabel jLprecio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBuscarCodigo;
    private javax.swing.JTextField txtagregarCodigo;
    private javax.swing.JTextField txtagregarNombre;
    private javax.swing.JTextField txtagregarPrecio;
    private javax.swing.JTextField txtrateCodigo;
    private javax.swing.JTextField txtrateEstrellas;
    // End of variables declaration//GEN-END:variables
}
