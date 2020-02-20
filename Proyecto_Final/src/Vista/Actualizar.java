/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import Modelo.Alumno;
import Modelo.Notas;
import javax.swing.JOptionPane;

/**
 *
 * @author Paul
 */
public class Actualizar extends javax.swing.JFrame {
    
    Notas notas =new Notas();
    Controlador controlador=new Controlador();
    Alumno alumno=new Alumno(0, "", "");

    /**
     * Creates new form actualizar_alumno
     */
    public Actualizar(int ci) {
        initComponents();
        
        controlador.LlenarActualizar(ci, notas, alumno);
        
        txt_Ci.setText(notas.getCi()+"");
        txt_notaIngles.setText(notas.getInglesN()+"");
        txt_notaLenguaje.setText(notas.getLenguajeN()+"");
        txt_notaFisica.setText(notas.getFisicaN()+"");
        txt_notaMatematica.setText(notas.getMatematicaN()+"");
        txt_notaQuimica.setText(notas.getQuimicaN()+"");
        txt_notaEdFisica.setText(notas.getEfisicaN()+"");
        txt_notaGeometria.setText(notas.getGeometriaN()+"");
        txt_notaComputacion.setText(notas.getComputacionN()+"");
        txt_notaBiologia.setText(notas.getBiologiaN()+"");
        txt_notaAnatomia.setText(notas.getAnatomiaN()+"");
        
        String[] nombres = alumno.getNombres().split(" ");
        String[] apellidos = alumno.getApellidos().split(" ");
        
        txt_Nombre1.setText(nombres[0]);
        txt_Nombre2.setText(nombres[1]);
        txt_Apellido1.setText(apellidos[0]);
        txt_Apellido2.setText(apellidos[1]);
        
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_Nombre1 = new javax.swing.JTextField();
        txt_Nombre2 = new javax.swing.JTextField();
        txt_Apellido1 = new javax.swing.JTextField();
        txt_Apellido2 = new javax.swing.JTextField();
        txt_Ci = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_notaIngles = new javax.swing.JTextField();
        txt_notaQuimica = new javax.swing.JTextField();
        txt_notaFisica = new javax.swing.JTextField();
        txt_notaMatematica = new javax.swing.JTextField();
        txt_notaEdFisica = new javax.swing.JTextField();
        txt_notaComputacion = new javax.swing.JTextField();
        txt_notaGeometria = new javax.swing.JTextField();
        txt_notaAnatomia = new javax.swing.JTextField();
        txt_notaBiologia = new javax.swing.JTextField();
        txt_notaLenguaje = new javax.swing.JTextField();
        btn_Cancelar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Actualizar Alumno");

        jLabel2.setFont(new java.awt.Font("Eras Demi ITC", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombres:");

        jLabel3.setFont(new java.awt.Font("Eras Demi ITC", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Apellidos:");

        jLabel4.setFont(new java.awt.Font("Eras Demi ITC", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CI:");

        txt_Nombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Nombre1ActionPerformed(evt);
            }
        });
        txt_Nombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_Nombre1KeyTyped(evt);
            }
        });

        txt_Nombre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_Nombre2KeyTyped(evt);
            }
        });

        txt_Apellido1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_Apellido1KeyTyped(evt);
            }
        });

        txt_Apellido2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_Apellido2KeyTyped(evt);
            }
        });

        txt_Ci.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Eras Demi ITC", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("NOTAS");

        jLabel6.setFont(new java.awt.Font("Eras Demi ITC", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setText("LENGUAJE");

        jLabel7.setFont(new java.awt.Font("Eras Demi ITC", 2, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("INGLES");

        jLabel8.setFont(new java.awt.Font("Eras Demi ITC", 2, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 0));
        jLabel8.setText("FISICA");

        jLabel9.setFont(new java.awt.Font("Eras Demi ITC", 2, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 255));
        jLabel9.setText("COMPUTACION");

        jLabel10.setFont(new java.awt.Font("Eras Demi ITC", 2, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 204, 0));
        jLabel10.setText("BIOLOGIA");

        jLabel11.setFont(new java.awt.Font("Eras Demi ITC", 2, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 255, 204));
        jLabel11.setText("GEOMETRIA");

        jLabel12.setFont(new java.awt.Font("Eras Demi ITC", 2, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 204, 255));
        jLabel12.setText("EDUCACION_FISICA");

        jLabel13.setFont(new java.awt.Font("Eras Demi ITC", 2, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 204, 102));
        jLabel13.setText("QUIMICA");

        jLabel14.setFont(new java.awt.Font("Eras Demi ITC", 2, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 51));
        jLabel14.setText("MATEMATICA");

        jLabel15.setFont(new java.awt.Font("Eras Demi ITC", 2, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 204, 255));
        jLabel15.setText("ANATOMIA");

        txt_notaIngles.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_notaInglesKeyTyped(evt);
            }
        });

        txt_notaQuimica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_notaQuimicaKeyTyped(evt);
            }
        });

        txt_notaFisica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_notaFisicaKeyTyped(evt);
            }
        });

        txt_notaMatematica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_notaMatematicaKeyTyped(evt);
            }
        });

        txt_notaEdFisica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_notaEdFisicaKeyTyped(evt);
            }
        });

        txt_notaComputacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_notaComputacionActionPerformed(evt);
            }
        });
        txt_notaComputacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_notaComputacionKeyTyped(evt);
            }
        });

        txt_notaGeometria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_notaGeometriaActionPerformed(evt);
            }
        });
        txt_notaGeometria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_notaGeometriaKeyTyped(evt);
            }
        });

        txt_notaAnatomia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_notaAnatomiaKeyTyped(evt);
            }
        });

        txt_notaBiologia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_notaBiologiaKeyTyped(evt);
            }
        });

        txt_notaLenguaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_notaLenguajeActionPerformed(evt);
            }
        });
        txt_notaLenguaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_notaLenguajeKeyTyped(evt);
            }
        });

        btn_Cancelar.setFont(new java.awt.Font("Elephant", 3, 24)); // NOI18N
        btn_Cancelar.setForeground(new java.awt.Color(255, 0, 51));
        btn_Cancelar.setText("Regresar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        btn_actualizar.setFont(new java.awt.Font("Elephant", 3, 24)); // NOI18N
        btn_actualizar.setForeground(new java.awt.Color(0, 51, 204));
        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(27, 27, 27)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(65, 65, 65)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txt_Nombre1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                                .addComponent(txt_Apellido1))
                                            .addGap(60, 60, 60)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txt_Nombre2, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                                .addComponent(txt_Apellido2)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(65, 65, 65)
                                            .addComponent(txt_Ci, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_notaIngles, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                        .addComponent(txt_notaLenguaje, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54)))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_notaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(76, 76, 76)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txt_notaMatematica, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(58, 58, 58)
                                                .addComponent(txt_notaQuimica, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(104, 104, 104)
                                                .addComponent(txt_notaEdFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(616, 616, 616)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(txt_notaGeometria, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(txt_notaComputacion, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(txt_notaBiologia, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(txt_notaAnatomia, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1012, 1012, 1012)
                        .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Ci, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_Nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_Apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_Apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_notaAnatomia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_notaComputacion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_notaGeometria, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_notaEdFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_notaMatematica, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_notaQuimica, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_notaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_notaIngles, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_notaLenguaje, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_notaBiologia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(104, 104, 104)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_Nombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Nombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Nombre1ActionPerformed

    private void txt_notaLenguajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_notaLenguajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_notaLenguajeActionPerformed

    private void txt_notaGeometriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_notaGeometriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_notaGeometriaActionPerformed

    private void txt_notaComputacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_notaComputacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_notaComputacionActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
       
        Alumnos_Calificaciones regresar=new Alumnos_Calificaciones();
        
        this.setVisible(false);
        regresar.setVisible(true);
        
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed

        
        if(Double.parseDouble(txt_notaAnatomia.getText()) > 10 ){
        
            JOptionPane.showMessageDialog(null, "La nota no puede ser mayor a 10", "ERROR", 0);
            
        }
        else if(Double.parseDouble(txt_notaBiologia.getText()) > 10 ){
        
            JOptionPane.showMessageDialog(null, "La nota no puede ser mayor a 10", "ERROR", 0);
            
        }
        else if(Double.parseDouble(txt_notaComputacion.getText()) > 10 ){
        
            JOptionPane.showMessageDialog(null, "La nota no puede ser mayor a 10", "ERROR", 0);
            
        }
        else if(Double.parseDouble(txt_notaEdFisica.getText()) > 10 ){
        
            JOptionPane.showMessageDialog(null, "La nota no puede ser mayor a 10", "ERROR", 0);
            
        }
        else if(Double.parseDouble(txt_notaFisica.getText()) > 10 ){
        
            JOptionPane.showMessageDialog(null, "La nota no puede ser mayor a 10", "ERROR", 0);
            
        }
        else if(Double.parseDouble(txt_notaGeometria.getText()) > 10 ){
        
            JOptionPane.showMessageDialog(null, "La nota no puede ser mayor a 10", "ERROR", 0);
            
        }
        else if(Double.parseDouble(txt_notaIngles.getText()) > 10 ){
        
            JOptionPane.showMessageDialog(null, "La nota no puede ser mayor a 10", "ERROR", 0);
            
        }
        else if(Double.parseDouble(txt_notaLenguaje.getText()) > 10 ){
        
            JOptionPane.showMessageDialog(null, "La nota no puede ser mayor a 10", "ERROR", 0);
            
        }
        else if(Double.parseDouble(txt_notaMatematica.getText()) > 10 ){
        
            JOptionPane.showMessageDialog(null, "La nota no puede ser mayor a 10", "ERROR", 0);
            
        }
        else if(Double.parseDouble(txt_notaQuimica.getText()) > 10 ){
        
            JOptionPane.showMessageDialog(null, "La nota no puede ser mayor a 10", "ERROR", 0);
            
        }
        else{
        
        
            double promedio = (Double.parseDouble(txt_notaAnatomia.getText()) + Double.parseDouble(txt_notaBiologia.getText()) + Double.parseDouble(txt_notaComputacion.getText()) + Double.parseDouble(txt_notaEdFisica.getText()) + Double.parseDouble(txt_notaFisica.getText()) + Double.parseDouble(txt_notaGeometria.getText()) + Double.parseDouble(txt_notaIngles.getText()) + Double.parseDouble(txt_notaLenguaje.getText()) + Double.parseDouble(txt_notaMatematica.getText()) + Double.parseDouble(txt_notaQuimica.getText()))/10;
         
            notas.setInglesN((float) Double.parseDouble(txt_notaIngles.getText()));
            notas.setLenguajeN((float) Double.parseDouble(txt_notaLenguaje.getText()));
            notas.setFisicaN((float) Double.parseDouble(txt_notaFisica.getText()));
            notas.setMatematicaN((float) Double.parseDouble(txt_notaMatematica.getText()));
            notas.setQuimicaN((float) Double.parseDouble(txt_notaQuimica.getText()));
            notas.setEfisicaN((float) Double.parseDouble(txt_notaEdFisica.getText()));
            notas.setGeometriaN((float) Double.parseDouble(txt_notaGeometria.getText()));
            notas.setComputacionN((float) Double.parseDouble(txt_notaComputacion.getText()));
            notas.setBiologiaN((float) Double.parseDouble(txt_notaBiologia.getText()));
            notas.setAnatomiaN((float) Double.parseDouble(txt_notaAnatomia.getText()));
            notas.setPromedioN((float) promedio);
            
            alumno.setNombres(txt_Nombre1.getText()+" "+txt_Nombre2.getText());
            alumno.setApellidos(txt_Apellido1.getText()+" "+txt_Apellido2.getText());
            
            controlador.Actualizar(Integer.parseInt(txt_Ci.getText()), alumno, notas);
        
        }
        
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void txt_Nombre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Nombre1KeyTyped
        
        char car = evt.getKeyChar();
if(Character.isLetter(car)){
}else{
evt.consume();
getToolkit().beep();
} 
        
    }//GEN-LAST:event_txt_Nombre1KeyTyped

    private void txt_Nombre2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Nombre2KeyTyped
       char car = evt.getKeyChar();
if(Character.isLetter(car)){
}else{
evt.consume();
getToolkit().beep();
} 
    }//GEN-LAST:event_txt_Nombre2KeyTyped

    private void txt_Apellido1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Apellido1KeyTyped
        char car = evt.getKeyChar();
if(Character.isLetter(car)){
}else{
evt.consume();
getToolkit().beep();
} 
    }//GEN-LAST:event_txt_Apellido1KeyTyped

    private void txt_Apellido2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Apellido2KeyTyped
        char car = evt.getKeyChar();
if(Character.isLetter(car)){
}else{
evt.consume();
getToolkit().beep();
} 
    }//GEN-LAST:event_txt_Apellido2KeyTyped

    private void txt_notaInglesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_notaInglesKeyTyped
       char car = evt.getKeyChar();
if(Character.isDigit(car) || car == '.'){

}else{
evt.consume();
getToolkit().beep();
} 
    }//GEN-LAST:event_txt_notaInglesKeyTyped

    private void txt_notaLenguajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_notaLenguajeKeyTyped
        char car = evt.getKeyChar();
if(Character.isDigit(car) || car == '.'){

}else{
evt.consume();
getToolkit().beep();
}  // TODO add your handling code here:
    }//GEN-LAST:event_txt_notaLenguajeKeyTyped

    private void txt_notaFisicaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_notaFisicaKeyTyped
 char car = evt.getKeyChar();
if(Character.isDigit(car) || car == '.'){

}else{
evt.consume();
getToolkit().beep();
}         // TODO add your handling code here:
    }//GEN-LAST:event_txt_notaFisicaKeyTyped

    private void txt_notaMatematicaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_notaMatematicaKeyTyped
 char car = evt.getKeyChar();
if(Character.isDigit(car) || car == '.'){

}else{
evt.consume();
getToolkit().beep();
}         // TODO add your handling code here:
    }//GEN-LAST:event_txt_notaMatematicaKeyTyped

    private void txt_notaQuimicaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_notaQuimicaKeyTyped
 char car = evt.getKeyChar();
if(Character.isDigit(car) || car == '.'){

}else{
evt.consume();
getToolkit().beep();
}         // TODO add your handling code here:
    }//GEN-LAST:event_txt_notaQuimicaKeyTyped

    private void txt_notaEdFisicaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_notaEdFisicaKeyTyped
 char car = evt.getKeyChar();
if(Character.isDigit(car) || car == '.'){

}else{
evt.consume();
getToolkit().beep();
}         // TODO add your handling code here:
    }//GEN-LAST:event_txt_notaEdFisicaKeyTyped

    private void txt_notaGeometriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_notaGeometriaKeyTyped
      char car = evt.getKeyChar();
if(Character.isDigit(car) || car == '.'){

}else{
evt.consume();
getToolkit().beep();
}    // TODO add your handling code here:
    }//GEN-LAST:event_txt_notaGeometriaKeyTyped

    private void txt_notaComputacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_notaComputacionKeyTyped
 char car = evt.getKeyChar();
if(Character.isDigit(car) || car == '.'){

}else{
evt.consume();
getToolkit().beep();
}         // TODO add your handling code here:
    }//GEN-LAST:event_txt_notaComputacionKeyTyped

    private void txt_notaBiologiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_notaBiologiaKeyTyped
 char car = evt.getKeyChar();
if(Character.isDigit(car) || car == '.'){

}else{
evt.consume();
getToolkit().beep();
}         // TODO add your handling code here:
    }//GEN-LAST:event_txt_notaBiologiaKeyTyped

    private void txt_notaAnatomiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_notaAnatomiaKeyTyped
 char car = evt.getKeyChar();
if(Character.isDigit(car) || car == '.'){

}else{
evt.consume();
getToolkit().beep();
}         // TODO add your handling code here:
    }//GEN-LAST:event_txt_notaAnatomiaKeyTyped

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_Apellido1;
    private javax.swing.JTextField txt_Apellido2;
    private javax.swing.JTextField txt_Ci;
    private javax.swing.JTextField txt_Nombre1;
    private javax.swing.JTextField txt_Nombre2;
    private javax.swing.JTextField txt_notaAnatomia;
    private javax.swing.JTextField txt_notaBiologia;
    private javax.swing.JTextField txt_notaComputacion;
    private javax.swing.JTextField txt_notaEdFisica;
    private javax.swing.JTextField txt_notaFisica;
    private javax.swing.JTextField txt_notaGeometria;
    private javax.swing.JTextField txt_notaIngles;
    private javax.swing.JTextField txt_notaLenguaje;
    private javax.swing.JTextField txt_notaMatematica;
    private javax.swing.JTextField txt_notaQuimica;
    // End of variables declaration//GEN-END:variables
}
