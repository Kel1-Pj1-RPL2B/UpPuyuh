/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormUpPuyuh;

import Controller.PenyakitController;

import javax.swing.JTable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author Aulia
 */
public class FormDataPenyakit extends javax.swing.JFrame {

    /**
     * Creates new form FormDataPenyakit
     */
    
    PenyakitController controller;
    public FormDataPenyakit() {
        initComponents();
        showDate();
        showTime();
        MenuData();
        controller = new PenyakitController(this);
    }
    
    public void showDate() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        jDate.setText(sdf.format(d));
    }
    
    public void showTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
                jTime.setText(sdf.format(d));
            }
        }
        ).start();
    }
    
    public void MenuData() {
        MenuData.setVisible(true);
        MenuInput.setVisible(false);
    }
    
    public JTextField getTxtIdPenyakit() {
        return TxtIdPenyakit;
    }
    
    public JTextField getTxtNamaPenyakit() {
        return TxtNamaPenyakit;
    }
    
    public JTextArea getJtxKeterangan() {
        return JtxKeterangan;
    }
    
    public JTable getTblDataPenyakit() {
        return TblDataPenyakit;
    }
    
    public JTable getTblInputPenyakit() {
        return TblInputPenyakit;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuData = new javax.swing.JPanel();
        jDate = new javax.swing.JLabel();
        jTime = new javax.swing.JLabel();
        MenuTabel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        JspDataPenyakit = new javax.swing.JScrollPane();
        TblDataPenyakit = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        BtnTambah = new javax.swing.JButton();
        BtnKembali = new javax.swing.JButton();
        SubMenu = new javax.swing.JPanel();
        Home = new javax.swing.JPanel();
        jDashboard = new javax.swing.JLabel();
        MenuInput = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        MenuInputData = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        BtnSimpan = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        TxtNamaPenyakit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        JpsInputPenyakit = new javax.swing.JScrollPane();
        TblInputPenyakit = new javax.swing.JTable();
        TxtIdPenyakit = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtxKeterangan = new javax.swing.JTextArea();
        BtnClear = new javax.swing.JButton();
        BtnKembaliData = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        MenuData.setBackground(new java.awt.Color(255, 255, 255));

        jDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jDate.setText("Date");

        jTime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTime.setText("Time");

        MenuTabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Data Penyakit");

        JspDataPenyakit.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        TblDataPenyakit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Penyakit", "Nama Penyakit", "Keterangan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblDataPenyakit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TblDataPenyakit.setDoubleBuffered(true);
        TblDataPenyakit.setEnabled(false);
        TblDataPenyakit.setRowHeight(32);
        TblDataPenyakit.setRowMargin(2);
        JspDataPenyakit.setViewportView(TblDataPenyakit);
        if (TblDataPenyakit.getColumnModel().getColumnCount() > 0) {
            TblDataPenyakit.getColumnModel().getColumn(0).setResizable(false);
            TblDataPenyakit.getColumnModel().getColumn(0).setPreferredWidth(50);
            TblDataPenyakit.getColumnModel().getColumn(1).setPreferredWidth(150);
            TblDataPenyakit.getColumnModel().getColumn(2).setResizable(false);
            TblDataPenyakit.getColumnModel().getColumn(2).setPreferredWidth(700);
        }

        javax.swing.GroupLayout MenuTabelLayout = new javax.swing.GroupLayout(MenuTabel);
        MenuTabel.setLayout(MenuTabelLayout);
        MenuTabelLayout.setHorizontalGroup(
            MenuTabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuTabelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JspDataPenyakit, javax.swing.GroupLayout.DEFAULT_SIZE, 1068, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(MenuTabelLayout.createSequentialGroup()
                .addGap(443, 443, 443)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuTabelLayout.setVerticalGroup(
            MenuTabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuTabelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JspDataPenyakit, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("2021 Perternakan Burung Puyuh");

        BtnTambah.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtnTambah.setText("Tambah Data");
        BtnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTambahActionPerformed(evt);
            }
        });

        BtnKembali.setText("Kembali");
        BtnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuDataLayout = new javax.swing.GroupLayout(MenuData);
        MenuData.setLayout(MenuDataLayout);
        MenuDataLayout.setHorizontalGroup(
            MenuDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MenuTabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(MenuDataLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jTime, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(MenuDataLayout.createSequentialGroup()
                .addGroup(MenuDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuDataLayout.createSequentialGroup()
                        .addGap(407, 407, 407)
                        .addComponent(jLabel6))
                    .addGroup(MenuDataLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(BtnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuDataLayout.setVerticalGroup(
            MenuDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuDataLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(BtnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MenuDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuDataLayout.createSequentialGroup()
                        .addComponent(BtnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuDataLayout.createSequentialGroup()
                        .addGroup(MenuDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTime, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(MenuTabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(13, 13, 13))
        );

        getContentPane().add(MenuData);
        MenuData.setBounds(160, 0, 1120, 720);

        Home.setBackground(new java.awt.Color(204, 204, 204));
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });

        jDashboard.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jDashboard.setText("Dashboard");

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jDashboard)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout SubMenuLayout = new javax.swing.GroupLayout(SubMenu);
        SubMenu.setLayout(SubMenuLayout);
        SubMenuLayout.setHorizontalGroup(
            SubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        SubMenuLayout.setVerticalGroup(
            SubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(588, Short.MAX_VALUE))
        );

        getContentPane().add(SubMenu);
        SubMenu.setBounds(0, 0, 160, 722);

        MenuInput.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("2021 Perternakan Burung Puyuh");

        MenuInputData.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nama Penyakit");

        BtnSimpan.setText("Simpan");
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });

        BtnUpdate.setText("Update");
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });

        BtnDelete.setText("Hapus");
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });

        TxtNamaPenyakit.setText("jTextField1");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Input Data Penyakit");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Keterangan");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("ID Penyakit");

        JpsInputPenyakit.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        TblInputPenyakit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Penyakit", "Nama Penyakit", "Keterangan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblInputPenyakit.setRowHeight(32);
        TblInputPenyakit.setRowSelectionAllowed(false);
        TblInputPenyakit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblInputPenyakitMouseClicked(evt);
            }
        });
        JpsInputPenyakit.setViewportView(TblInputPenyakit);

        TxtIdPenyakit.setText("jTextField1");

        JtxKeterangan.setColumns(20);
        JtxKeterangan.setLineWrap(true);
        JtxKeterangan.setRows(5);
        jScrollPane1.setViewportView(JtxKeterangan);

        BtnClear.setText("Hapus");
        BtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuInputDataLayout = new javax.swing.GroupLayout(MenuInputData);
        MenuInputData.setLayout(MenuInputDataLayout);
        MenuInputDataLayout.setHorizontalGroup(
            MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuInputDataLayout.createSequentialGroup()
                .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuInputDataLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(MenuInputDataLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtIdPenyakit, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuInputDataLayout.createSequentialGroup()
                                .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(MenuInputDataLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jScrollPane1))
                                    .addComponent(TxtNamaPenyakit, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(MenuInputDataLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(MenuInputDataLayout.createSequentialGroup()
                                .addComponent(BtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuInputDataLayout.createSequentialGroup()
                                .addComponent(BtnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114)
                                .addComponent(BtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JpsInputPenyakit)
                .addContainerGap())
            .addGroup(MenuInputDataLayout.createSequentialGroup()
                .addGap(424, 424, 424)
                .addComponent(jLabel4)
                .addContainerGap(457, Short.MAX_VALUE))
        );
        MenuInputDataLayout.setVerticalGroup(
            MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuInputDataLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuInputDataLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(JpsInputPenyakit, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuInputDataLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtIdPenyakit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNamaPenyakit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        BtnKembaliData.setText("Kembali");
        BtnKembaliData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKembaliDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuInputLayout = new javax.swing.GroupLayout(MenuInput);
        MenuInput.setLayout(MenuInputLayout);
        MenuInputLayout.setHorizontalGroup(
            MenuInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuInputLayout.createSequentialGroup()
                .addGroup(MenuInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuInputLayout.createSequentialGroup()
                        .addGroup(MenuInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuInputLayout.createSequentialGroup()
                                .addGap(408, 408, 408)
                                .addComponent(jLabel7))
                            .addGroup(MenuInputLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(BtnKembaliData, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(MenuInputLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(MenuInputData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        MenuInputLayout.setVerticalGroup(
            MenuInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuInputLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(BtnKembaliData, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(MenuInputData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(MenuInput);
        MenuInput.setBounds(160, 0, 1120, 720);

        setSize(new java.awt.Dimension(1298, 767));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTambahActionPerformed
        // TODO add your handling code here:
        MenuData.setVisible(false);
        MenuInput.setVisible(true);
    }//GEN-LAST:event_BtnTambahActionPerformed

    private void BtnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKembaliActionPerformed
        // TODO add your handling code here:
        FormMainMenuAdmin formMainMenu = new FormMainMenuAdmin();
        formMainMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnKembaliActionPerformed

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        // TODO add your handling code here:
        FormMainMenuAdmin formMainMenu = new FormMainMenuAdmin();
        formMainMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_HomeMouseClicked

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        // TODO add your handling code here:
        controller.insert();
        controller.clearForm();
        controller.viewTableInput();
    }//GEN-LAST:event_BtnSimpanActionPerformed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        // TODO add your handling code here:
        controller.update();
        controller.clearForm();
        controller.viewTableInput();
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        // TODO add your handling code here:
        controller.delete();
        controller.clearForm();
        controller.viewTableInput();
    }//GEN-LAST:event_BtnDeleteActionPerformed

    private void TblInputPenyakitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblInputPenyakitMouseClicked
        // TODO add your handling code here:
        controller.onClickTabel();
    }//GEN-LAST:event_TblInputPenyakitMouseClicked

    private void BtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearActionPerformed
        // TODO add your handling code here:
        controller.clearForm();
    }//GEN-LAST:event_BtnClearActionPerformed

    private void BtnKembaliDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKembaliDataActionPerformed
        // TODO add your handling code here:
        MenuData.setVisible(true);
        MenuInput.setVisible(false);
    }//GEN-LAST:event_BtnKembaliDataActionPerformed

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
            java.util.logging.Logger.getLogger(FormDataPenyakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDataPenyakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDataPenyakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDataPenyakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDataPenyakit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnClear;
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnKembali;
    private javax.swing.JButton BtnKembaliData;
    private javax.swing.JButton BtnSimpan;
    private javax.swing.JButton BtnTambah;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JPanel Home;
    private javax.swing.JScrollPane JpsInputPenyakit;
    private javax.swing.JScrollPane JspDataPenyakit;
    private javax.swing.JTextArea JtxKeterangan;
    private javax.swing.JPanel MenuData;
    private javax.swing.JPanel MenuInput;
    private javax.swing.JPanel MenuInputData;
    private javax.swing.JPanel MenuTabel;
    private javax.swing.JPanel SubMenu;
    private javax.swing.JTable TblDataPenyakit;
    private javax.swing.JTable TblInputPenyakit;
    private javax.swing.JTextField TxtIdPenyakit;
    private javax.swing.JTextField TxtNamaPenyakit;
    private javax.swing.JLabel jDashboard;
    private javax.swing.JLabel jDate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jTime;
    // End of variables declaration//GEN-END:variables
}
