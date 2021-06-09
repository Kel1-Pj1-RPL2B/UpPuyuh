/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormUpPuyuh;

import Controller.KandangController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Aulia
 */
public class FormDataKandang extends javax.swing.JFrame {

    /**
     * Creates new form FormDataKandang
     */
    KandangController controller;

    public FormDataKandang() {
        initComponents();
        showTime();
        showDate();
        controller = new KandangController(this);
        MenuData();
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
    
    public JTextField getTxtIdKandang() {
        return TxtIdKandang;
    }
    
    public JTextField getTxtLabelKandang() {
        return TxtLabelKandang;
    }
    
    public JTextField getTxtJmlTernak() {
        return TxtJmlTernak;
    }
    
    public JTextField getTxtBlokKandang() {
        return TxtBlokKandang;
    }
    
    public JTable getTblDataKandang() {
        return TblDataKandang;
    }
    
    public JTable getTblInputKandang() {
        return TblInputKandang;
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
        JspDataKandang = new javax.swing.JScrollPane();
        TblDataKandang = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        BtnTambah = new javax.swing.JButton();
        BtnKembaliMenu = new javax.swing.JButton();
        MenuInput = new javax.swing.JPanel();
        BtnKembaliData = new javax.swing.JButton();
        MenuInputData = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JpsInputKandang = new javax.swing.JScrollPane();
        TblInputKandang = new javax.swing.JTable();
        BtnSimpan = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        TxtIdKandang = new javax.swing.JTextField();
        TxtLabelKandang = new javax.swing.JTextField();
        TxtBlokKandang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BtnClear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TxtJmlTernak = new javax.swing.JTextField();
        JpsInputKandang1 = new javax.swing.JScrollPane();
        TblInputKandang1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        SubMenu = new javax.swing.JPanel();
        Home = new javax.swing.JPanel();
        jDashboard = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        MenuData.setBackground(new java.awt.Color(255, 255, 255));

        jDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jDate.setText("Date");

        jTime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTime.setText("Time");

        MenuTabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Data Kandang");

        JspDataKandang.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        TblDataKandang.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TblDataKandang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Kandang", "Nama", "Jumlah Ternak", "Blok Kandang"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblDataKandang.setRowHeight(32);
        JspDataKandang.setViewportView(TblDataKandang);

        javax.swing.GroupLayout MenuTabelLayout = new javax.swing.GroupLayout(MenuTabel);
        MenuTabel.setLayout(MenuTabelLayout);
        MenuTabelLayout.setHorizontalGroup(
            MenuTabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuTabelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JspDataKandang)
                .addContainerGap())
            .addGroup(MenuTabelLayout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(jLabel9)
                .addContainerGap(482, Short.MAX_VALUE))
        );
        MenuTabelLayout.setVerticalGroup(
            MenuTabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuTabelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JspDataKandang, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        BtnKembaliMenu.setText("Kembali");
        BtnKembaliMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKembaliMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuDataLayout = new javax.swing.GroupLayout(MenuData);
        MenuData.setLayout(MenuDataLayout);
        MenuDataLayout.setHorizontalGroup(
            MenuDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuDataLayout.createSequentialGroup()
                .addGroup(MenuDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuDataLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(MenuTabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(MenuDataLayout.createSequentialGroup()
                        .addGroup(MenuDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuDataLayout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jTime, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuDataLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(BtnKembaliMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addContainerGap())
            .addGroup(MenuDataLayout.createSequentialGroup()
                .addGap(414, 414, 414)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuDataLayout.setVerticalGroup(
            MenuDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuDataLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(MenuDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MenuDataLayout.createSequentialGroup()
                        .addComponent(BtnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(MenuDataLayout.createSequentialGroup()
                        .addComponent(BtnKembaliMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(MenuDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTime, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(MenuTabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(7, 7, 7))
        );

        getContentPane().add(MenuData);
        MenuData.setBounds(160, 0, 1120, 720);

        MenuInput.setBackground(new java.awt.Color(255, 255, 255));

        BtnKembaliData.setText("Kembali");
        BtnKembaliData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKembaliDataActionPerformed(evt);
            }
        });

        MenuInputData.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ID Kandang");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Label Kandang");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Blok Kandang");

        TblInputKandang.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TblInputKandang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Kandang", "Nama", "Jumlah Ternak", "Blok Kandang"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblInputKandang.setRowHeight(32);
        TblInputKandang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblInputKandangMouseClicked(evt);
            }
        });
        JpsInputKandang.setViewportView(TblInputKandang);

        BtnSimpan.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        BtnSimpan.setText("Simpan");
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });

        BtnUpdate.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        BtnUpdate.setText("Update");
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });

        BtnDelete.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        BtnDelete.setText("Hapus");
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });

        TxtIdKandang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtIdKandang.setText("jTextField1");

        TxtLabelKandang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtLabelKandang.setText("jTextField1");

        TxtBlokKandang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtBlokKandang.setText("jTextField1");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Input Data Kandang");

        BtnClear.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        BtnClear.setText("Clear");
        BtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClearActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Jumlah Ternak");

        TxtJmlTernak.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtJmlTernak.setText("jTextField1");
        TxtJmlTernak.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtJmlTernakKeyTyped(evt);
            }
        });

        TblInputKandang1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TblInputKandang1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Kandang", "Nama", "Jumlah Ternak", "Blok Kandang"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblInputKandang1.setRowHeight(32);
        TblInputKandang1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblInputKandang1MouseClicked(evt);
            }
        });
        JpsInputKandang1.setViewportView(TblInputKandang1);

        javax.swing.GroupLayout MenuInputDataLayout = new javax.swing.GroupLayout(MenuInputData);
        MenuInputData.setLayout(MenuInputDataLayout);
        MenuInputDataLayout.setHorizontalGroup(
            MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuInputDataLayout.createSequentialGroup()
                .addGap(424, 424, 424)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MenuInputDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MenuInputDataLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuInputDataLayout.createSequentialGroup()
                        .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuInputDataLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtJmlTernak, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuInputDataLayout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtLabelKandang))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuInputDataLayout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtIdKandang, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuInputDataLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtBlokKandang, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(JpsInputKandang, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpsInputKandang1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        MenuInputDataLayout.setVerticalGroup(
            MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuInputDataLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuInputDataLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtIdKandang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtLabelKandang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtJmlTernak, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtBlokKandang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(MenuInputDataLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(JpsInputKandang, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuInputDataLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(JpsInputKandang1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("2021 Perternakan Burung Puyuh");

        javax.swing.GroupLayout MenuInputLayout = new javax.swing.GroupLayout(MenuInput);
        MenuInput.setLayout(MenuInputLayout);
        MenuInputLayout.setHorizontalGroup(
            MenuInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuInputLayout.createSequentialGroup()
                .addGroup(MenuInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuInputLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(BtnKembaliData, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(MenuInputLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(MenuInputData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(MenuInputLayout.createSequentialGroup()
                .addGap(414, 414, 414)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuInputLayout.setVerticalGroup(
            MenuInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuInputLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(BtnKembaliData, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(MenuInputData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        getContentPane().add(MenuInput);
        MenuInput.setBounds(160, 0, 1120, 720);

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

        setSize(new java.awt.Dimension(1298, 767));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTambahActionPerformed
        // TODO add your handling code here:
        MenuData.setVisible(false);
        MenuInput.setVisible(true);
    }//GEN-LAST:event_BtnTambahActionPerformed

    private void BtnKembaliMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKembaliMenuActionPerformed
        // TODO add your handling code here:
        FormMainMenuAdmin formMainMenu = new FormMainMenuAdmin();
        formMainMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnKembaliMenuActionPerformed

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        // TODO add your handling code here:
        FormMainMenuAdmin formMainMenu = new FormMainMenuAdmin();
        formMainMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_HomeMouseClicked

    private void BtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearActionPerformed
        // TODO add your handling code here:
        controller.clearForm();
    }//GEN-LAST:event_BtnClearActionPerformed

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        // TODO add your handling code here:
        controller.delete();
        controller.clearForm();
        controller.viewTableInput();
    }//GEN-LAST:event_BtnDeleteActionPerformed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        // TODO add your handling code here:
            controller.update();
            controller.clearForm();
            controller.viewTableInput();
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        // TODO add your handling code here:
        controller.insert();
        controller.clearForm();
        controller.viewTableInput();
    }//GEN-LAST:event_BtnSimpanActionPerformed

    private void TblInputKandangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblInputKandangMouseClicked
        // TODO add your handling code here:
        controller.onClickTabel();
    }//GEN-LAST:event_TblInputKandangMouseClicked

    private void BtnKembaliDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKembaliDataActionPerformed
        // TODO add your handling code here:
        MenuData.setVisible(true);
        MenuInput.setVisible(false);
    }//GEN-LAST:event_BtnKembaliDataActionPerformed

    private void TxtJmlTernakKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtJmlTernakKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtJmlTernakKeyTyped

    private void TblInputKandang1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblInputKandang1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TblInputKandang1MouseClicked

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
            java.util.logging.Logger.getLogger(FormDataKandang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDataKandang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDataKandang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDataKandang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDataKandang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnClear;
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnKembaliData;
    private javax.swing.JButton BtnKembaliMenu;
    private javax.swing.JButton BtnSimpan;
    private javax.swing.JButton BtnTambah;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JPanel Home;
    private javax.swing.JScrollPane JpsInputKandang;
    private javax.swing.JScrollPane JpsInputKandang1;
    private javax.swing.JScrollPane JspDataKandang;
    private javax.swing.JPanel MenuData;
    private javax.swing.JPanel MenuInput;
    private javax.swing.JPanel MenuInputData;
    private javax.swing.JPanel MenuTabel;
    private javax.swing.JPanel SubMenu;
    private javax.swing.JTable TblDataKandang;
    private javax.swing.JTable TblInputKandang;
    private javax.swing.JTable TblInputKandang1;
    private javax.swing.JTextField TxtBlokKandang;
    private javax.swing.JTextField TxtIdKandang;
    private javax.swing.JTextField TxtJmlTernak;
    private javax.swing.JTextField TxtLabelKandang;
    private javax.swing.JLabel jDashboard;
    private javax.swing.JLabel jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jTime;
    // End of variables declaration//GEN-END:variables
}
