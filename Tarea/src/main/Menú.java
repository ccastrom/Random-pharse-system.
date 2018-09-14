package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import model.TMAction;
import model.TMName;
import model.TMPlace;

public class Menú extends javax.swing.JFrame {

    //DECLARACIONES
    private Random r;
    private List<String> listanombre;
    private List<String> listaaccion;
    private List<String> listalugar;
    //Se declaran objetos del tipo TM
    private TMName modelNombre;
    private TMAction modelAccion;
    private TMPlace modelLugar;

    public Menú() {
        setTitle("Funny random phrase");
        initComponents();
        r = new Random();
        //INICIALIZACION DE LOS ELEMENTOS
        listanombre = new ArrayList<>();
        listaaccion = new ArrayList<>();
        listalugar = new ArrayList<>();
        //INICIALIZO EL OBJETO, EL CONSTRUCTOR RECIBE COMO PARAMETRO
        //LAS LISTAS CORRESPONDIENTES.
        modelNombre = new TMName(listanombre);
        modelAccion = new TMAction(listaaccion);
        modelLugar = new TMPlace(listalugar);
        //LAS TABLAS RECIBEN COMO PARAMETRO LOS OBJETOS PROVENIENTES DE LAS CLASES TM
        TableName.setModel(modelNombre);
        TableAction.setModel(modelAccion);
        TablePlace.setModel(modelLugar);
        
        GeneratebtnValidate();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnAddName = new javax.swing.JButton();
        lblAction = new javax.swing.JLabel();
        txtAction = new javax.swing.JTextField();
        btnAddAction = new javax.swing.JButton();
        lblPlace = new javax.swing.JLabel();
        txtPlace = new javax.swing.JTextField();
        btnAddPlace = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableName = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableAction = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablePlace = new javax.swing.JTable();
        btnGenerate = new javax.swing.JButton();
        lblFrase1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Name");

        btnAddName.setText("ADD");
        btnAddName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNameActionPerformed(evt);
            }
        });

        lblAction.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAction.setText("Action");

        btnAddAction.setText("ADD");
        btnAddAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionActionPerformed(evt);
            }
        });

        lblPlace.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlace.setText("Place");
        lblPlace.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnAddPlace.setText("ADD");
        btnAddPlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPlaceActionPerformed(evt);
            }
        });

        TableName.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TableName);

        TableAction.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TableAction);

        TablePlace.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(TablePlace);

        btnGenerate.setText("Generate");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        lblFrase1.setBackground(new java.awt.Color(255, 255, 255));
        lblFrase1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblFrase1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFrase1.setText("INFO HERE.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFrase1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtName)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(btnAddName)
                                .addGap(61, 61, 61))
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtAction)
                                        .addComponent(lblAction, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(btnAddAction)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(lblPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addComponent(btnAddPlace)
                                        .addGap(71, 71, 71))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAction)
                    .addComponent(lblPlace)
                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddName)
                    .addComponent(btnAddAction)
                    .addComponent(btnAddPlace))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFrase1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNameActionPerformed
        setName();
      

    }//GEN-LAST:event_btnAddNameActionPerformed

    private void btnAddActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionActionPerformed
        setAction();
        GeneratebtnValidate();
    }//GEN-LAST:event_btnAddActionActionPerformed

    private void btnAddPlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPlaceActionPerformed
        setPlace();
        GeneratebtnValidate();
    }//GEN-LAST:event_btnAddPlaceActionPerformed

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        
        randomizeValue();


    }//GEN-LAST:event_btnGenerateActionPerformed
    public void setName() {
        GeneratebtnValidate();
        String nombre;
        nombre = txtName.getText();
        
        if (!nombre.isEmpty()) {
            //Si el nombre no es vacio hago lo siguente
            //AGREGO DATOS A LA LISTA Y ACTUALIZA LA TABLA
            listanombre.add(nombre);
            TableName.updateUI();
            txtName.setText(null);
            txtName.requestFocus();
            GeneratebtnValidate();
             
            
            
        }
    }

    public void setAction() {
        
        String accion;
        accion = txtAction.getText();
        if (!accion.isEmpty()) {
            //Si el nombre no es vacio hago lo siguente
            //AGREGO DATOS A LA LISTA Y ACTUALIZA LA TABLA
            listaaccion.add(accion);
            TableAction.updateUI();
            txtAction.setText(null);
            txtAction.requestFocus();
            

        }
    }

    public void setPlace() {
        
        String lugar;
        lugar = txtPlace.getText();
        if (!lugar.isEmpty()) {
            //Si el nombre no es vacio hago lo siguente
            //AGREGO DATOS A LA LISTA Y ACTUALIZA LA TABLA
            listalugar.add(lugar);
            TablePlace.updateUI();
            txtPlace.setText(null);
            txtPlace.requestFocus();
            
        }
    }

    public void GeneratebtnValidate() {
        if (listanombre.isEmpty()||listaaccion.isEmpty()||listalugar.isEmpty()) {
            btnGenerate.setEnabled(false);
        } else {
            btnGenerate.setEnabled(true);
        }
    }

    public void randomizeValue() {
        /*
        1.- Creo 3 variables las cuales, el objeto ran expondra un numero al azar,
        ese numero al azar sera según sea el largo de la lista(.size())
        2.- Creo variables de tipo string el cual me almacenaran el valor obtenido
        por las variables "numero","numero2","numero3".
        3.-Muestro en el labe las variables del tipo String.
         */
        Random ran = new Random();
        int numero = ran.nextInt(listanombre.size());
        int numero2 = ran.nextInt(listaaccion.size());
        int numero3 = ran.nextInt(listalugar.size());
        String resultadonombre = listanombre.get(numero);
        String resultadoaccion = listaaccion.get(numero2);
        String resultadolugar = listalugar.get(numero3);
        lblFrase1.setText(resultadonombre + " " + resultadoaccion + " " + resultadolugar);
        GeneratebtnValidate();
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menú().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableAction;
    private javax.swing.JTable TableName;
    private javax.swing.JTable TablePlace;
    private javax.swing.JButton btnAddAction;
    private javax.swing.JButton btnAddName;
    private javax.swing.JButton btnAddPlace;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAction;
    private javax.swing.JLabel lblFrase1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPlace;
    private javax.swing.JTextField txtAction;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPlace;
    // End of variables declaration//GEN-END:variables
}
