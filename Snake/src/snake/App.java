
package snake;

import snake.segmento.Fruta;
import snake.segmento.Serpiente;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class App extends javax.swing.JFrame {

    private JLabel[][] cuadriculaGamePane;
    private Serpiente serpiente;
    private Fruta fruta;
    private Thread hiloRepintar;
    private Thread hiloMoverSerpiente;
    private volatile int direccion;
    private volatile int velocidad = 1000;
    private volatile int modificadorDeDificultad;
    private volatile boolean juegoActivo = false;
    private final int ARRIBA = 0;
    private final int ABAJO = 1;
    private final int DERECHA = 2;
    private final int IZQUIERDA = 3;
    public App() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        gamePanel = new javax.swing.JPanel();
        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        javax.swing.JButton btnArriba = new javax.swing.JButton();
        javax.swing.JButton btnAbajo = new javax.swing.JButton();
        javax.swing.JButton btnDerecha = new javax.swing.JButton();
        javax.swing.JButton btnIzquierda = new javax.swing.JButton();
        javax.swing.JButton btnIniciar = new javax.swing.JButton();
        lb1tamanio = new javax.swing.JLabel();
        lb1velocidad = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Dificultad = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 0));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        gamePanel.setBackground(new java.awt.Color(0, 102, 153));
        gamePanel.setMinimumSize(new java.awt.Dimension(300, 300));
        gamePanel.setPreferredSize(new java.awt.Dimension(300, 300));
        gamePanel.setLayout(new java.awt.GridLayout(1, 1, 1, 1));

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 10))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(0, 102, 204));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        btnArriba.setBackground(new java.awt.Color(0, 102, 102));
        btnArriba.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnArriba.setForeground(new java.awt.Color(0, 0, 0));
        btnArriba.setText("Arriba");
        btnArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArribaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel4.add(btnArriba, gridBagConstraints);

        btnAbajo.setBackground(new java.awt.Color(0, 102, 102));
        btnAbajo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAbajo.setForeground(new java.awt.Color(0, 0, 0));
        btnAbajo.setText("Abajo");
        btnAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbajoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel4.add(btnAbajo, gridBagConstraints);

        btnDerecha.setBackground(new java.awt.Color(0, 102, 102));
        btnDerecha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDerecha.setForeground(new java.awt.Color(0, 0, 0));
        btnDerecha.setText("Der");
        btnDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerechaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel4.add(btnDerecha, gridBagConstraints);

        btnIzquierda.setBackground(new java.awt.Color(0, 102, 102));
        btnIzquierda.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnIzquierda.setForeground(new java.awt.Color(0, 0, 0));
        btnIzquierda.setText("Izq");
        btnIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzquierdaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel4.add(btnIzquierda, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jPanel4, gridBagConstraints);

        btnIniciar.setBackground(new java.awt.Color(102, 0, 51));
        btnIniciar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(0, 0, 0));
        btnIniciar.setText("<html><center>Nuevo<br>juego</center></html>");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciar, new java.awt.GridBagConstraints());

        lb1tamanio.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lb1tamanio.setForeground(new java.awt.Color(0, 0, 0));
        lb1tamanio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb1tamanio.setText("0");

        lb1velocidad.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lb1velocidad.setForeground(new java.awt.Color(0, 0, 0));
        lb1velocidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb1velocidad.setText("0");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tamaño de Serpiente");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Velocidad");

        Dificultad.setBackground(new java.awt.Color(0, 0, 0));
        Dificultad.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Dificultad.setForeground(new java.awt.Color(255, 255, 255));
        Dificultad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Facil", "Medio ", "Dificil" }));

        jLabel3.setBackground(new java.awt.Color(0, 153, 153));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DIFICULTAD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(gamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(70, 70, 70))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(lb1tamanio, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(lb1velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(182, 182, 182))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Dificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Dificultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gamePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb1tamanio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb1velocidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
 
    }//GEN-LAST:event_formKeyPressed

    private void btnArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArribaActionPerformed
        direccion = ARRIBA;
    }//GEN-LAST:event_btnArribaActionPerformed

    private void btnAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbajoActionPerformed
        direccion = ABAJO;
    }//GEN-LAST:event_btnAbajoActionPerformed

    private void btnDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerechaActionPerformed
        direccion = DERECHA;
    }//GEN-LAST:event_btnDerechaActionPerformed

    private void btnIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzquierdaActionPerformed
        direccion = IZQUIERDA;
    }//GEN-LAST:event_btnIzquierdaActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        if (this.hiloMoverSerpiente != null && this.hiloMoverSerpiente.isAlive() || this.hiloRepintar != null && this.hiloRepintar.isAlive()) {
            return;
        }
        GridLayout gamePanelLayout = (GridLayout) this.gamePanel.getLayout();
        int cantidadCol = 10;
        int cantidadFilas = 10;
        serpiente = new Serpiente();
        gamePanelLayout.setColumns(cantidadCol);
        gamePanelLayout.setRows(cantidadFilas);
        cuadriculaGamePane = new JLabel[cantidadFilas][cantidadCol];
        gamePanel.removeAll();
        for (int i = 0; i < cuadriculaGamePane.length; i++) {
            for (int j = 0; j < cuadriculaGamePane[i].length; j++) {
                cuadriculaGamePane[i][j] = new JLabel();
                cuadriculaGamePane[i][j].setOpaque(true);
                cuadriculaGamePane[i][j].setBackground(Color.white);
                gamePanel.add(cuadriculaGamePane[i][j]);
            }
        }
        modificadorDeDificultad = this.Dificultad.getSelectedIndex() + 1;
        velocidad = 1000;
        this.lb1tamanio.setText(String.valueOf(serpiente.getLargo()));
        this.lb1velocidad.setText(String.valueOf(velocidad));
        nuevaFruta();
        gamePanel.validate();
        juegoActivo = true;
        direccion = -1;
        hiloRepintar = new Thread(() -> {
            repintar();
        });
        hiloRepintar.start();
        hiloMoverSerpiente = new Thread(() -> {
            mover();
        });
        hiloMoverSerpiente.start();
    }//GEN-LAST:event_btnIniciarActionPerformed

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }
    
    private synchronized void mover() {
        while (juegoActivo && serpiente.puedeCrecer()) {
            switch (direccion) {
                case IZQUIERDA ->
                    serpiente.moverIzquierda();
                case ARRIBA ->
                    serpiente.moverArriba();
                case DERECHA ->
                    serpiente.moverDerecha();
                case ABAJO ->
                    serpiente.moverAbajo();
            }
            try {
                wait(velocidad);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
        juegoActivo = false;
    }

    private synchronized void repintar() {
        while (juegoActivo && serpiente.isViva()) {
            for (int i = 0; i < cuadriculaGamePane.length; i++) {
                for (int j = 0; j < cuadriculaGamePane[i].length; j++) {
                    cuadriculaGamePane[i][j].setBackground(Color.gray);
                }
            }
            for (int i = 0; i < serpiente.getLargo(); i++) {
                int posX = serpiente.getSegmentos()[i].getPosX();
                int posY = serpiente.getSegmentos()[i].getPosY();
                colisionConBordes(posX, posY);
            }
            colisionConFruta();
            try {
                wait(20);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }

    private void colisionConBordes(int posX, int posY) {
        if (posY >= 0 && posX >= 0 && posY < cuadriculaGamePane.length && posX < cuadriculaGamePane[0].length) {
            cuadriculaGamePane[posY][posX].setBackground(Color.green);
        } else {
            serpiente.setViva(false);
            juegoActivo = false;
            JOptionPane.showMessageDialog(null, "La serpiente ha muerto", this.getTitle(), JOptionPane.INFORMATION_MESSAGE);
        }
    }
 private void colisionConFruta(){
        int posXFruta = fruta.getPosX();
        int posYFruta = fruta.getPosY();  
        
        int posXCabeza = serpiente.getSegmentos()[0].getPosX();
        int posYCabeza = serpiente.getSegmentos()[0].getPosY();
        if(posXFruta==posXCabeza && posYFruta==posYCabeza){
        nuevaFruta(); 
        serpiente.Crecer();
        lb1tamanio.setText(String.valueOf(serpiente.getLargo()));
        if(modificadorDeDificultad==1){
            velocidad = (int) (velocidad*(1 - 0.03));
            lb1velocidad.setText(String.valueOf(velocidad));
        }else if(modificadorDeDificultad==2){
            velocidad = (int) (velocidad*(1 - 0.06)); 
            lb1velocidad.setText(String.valueOf(velocidad));
        }else if(modificadorDeDificultad==3){
            velocidad = (int) (velocidad*(1 - 0.09));
            lb1velocidad.setText(String.valueOf(velocidad));
        }
        }
        cuadriculaGamePane[posYFruta][posXFruta].setBackground(Color.orange);
    }
        
    private void nuevaFruta(){
        int largoY = cuadriculaGamePane.length - 1;
        int largoX = cuadriculaGamePane[0].length - 1;
        
        int posX = (int) Math.round(Math.random()*largoX);
        int posY = (int) Math.round(Math.random()*largoY);
        
        fruta = new Fruta(posX, posY);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Dificultad;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lb1tamanio;
    private javax.swing.JLabel lb1velocidad;
    // End of variables declaration//GEN-END:variables
}
