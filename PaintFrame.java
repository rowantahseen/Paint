package eg.edu.alexu.cse.oop.draw;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import eg.edu.alexu.cse.oop.draw.Line;
import eg.edu.alexu.cse.oop.draw.Engine;
import eg.edu.alexu.cse.oop.draw.Ellipse;
import eg.edu.alexu.cse.oop.draw.Circle;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.security.auth.Refreshable;
import javax.swing.Timer;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author first
 */
public class PaintFrame extends javax.swing.JFrame {

    Map<String, Double> layer1, layer2;
    Shape cur;
    /**
     * Creates new form NewJFrame
     */
    
    int x = 0;
    double  xaxis,yaxis;

    public PaintFrame() {
        layer1 = new HashMap<String, Double>();
        layer2 = new HashMap<String, Double>();
        this.setResizable(false);
        layer1 = new HashMap<String, Double>();
        layer2 = new HashMap<String, Double>();
        int x , y;
        initComponents();

        canvas1.setBackground(Color.white);
        canvas1.setVisible(true);

        ColorDialog.setVisible(false);
        MoveDialog.setVisible(false);
        CopyDialog.setVisible(false);
        EditDialog.setVisible(false);
        DoneButton.setVisible(false);
        Timer timer;
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Engine.getInstance().refresh(canvas1.getGraphics());
            }

        });
        timer.start();
    }

    public void Display(Map<String, Double> mp) {
        mainDialog.setVisible(true);
        int i = 0;
        this.layer1.clear();
        this.layer1 = new HashMap<String, Double>();
        for (Map.Entry<String, Double> entry : mp.entrySet()) {
            layer1.put(entry.getKey(), 0.0);
            if (i == 0) {
                label1.setVisible(true);
                label1.setText(entry.getKey());
                TextField1.setVisible(true);
            }
            if (i == 1) {
                label2.setVisible(true);
                label2.setText(entry.getKey());
                TextField2.setVisible(true);
            }
            if (i == 2) {
                label3.setVisible(true);
                label3.setText(entry.getKey());
                TextField3.setVisible(true);
            }
            if (i == 3) {
                label4.setVisible(true);
                label4.setText(entry.getKey());
                TextField4.setVisible(true);
            }
            if (i == 4) {
                label5.setVisible(true);
                label5.setText(entry.getKey());
                TextFiedl5.setVisible(true);
            }
            if (i == 5) {
                label6.setVisible(true);
                label6.setText(entry.getKey());
                TextField6.setVisible(true);
            }
            i++;
        }
    }

    public void Hide() {
        mainDialog.setVisible(false);
        label1.setVisible(false);
        label2.setVisible(false);
        label3.setVisible(false);
        label4.setVisible(false);
        label5.setVisible(false);
        label6.setVisible(false);
        TextField1.setVisible(false);
        TextField2.setVisible(false);
        TextField3.setVisible(false);
        TextField4.setVisible(false);
        TextFiedl5.setVisible(false);
        TextField6.setVisible(false);
    }

    public void displayEditDialog() {
        mainDialog.setVisible(true);
        int i = 0;
        this.layer1.putAll(this.cur.getProperties());
        System.out.print(this.layer1.size());
        if (this.layer1.containsKey("X-axis")) {
            this.layer1.remove("X-axis");
            this.layer1.remove("Y-axis");
            // System.out.print(cur.getProperties().size());
        }
        for (Map.Entry<String, Double> entry : this.layer1.entrySet()) {
            if (!entry.getKey().equals("X-axis")) {
                if (i == 0) {
                    label1.setVisible(true);
                    label1.setText(entry.getKey());
                    TextField1.setVisible(true);
                }
            
            if (i == 1) {
                label2.setVisible(true);
                label2.setText(entry.getKey());
                TextField2.setVisible(true);
            }
            if (i == 2) {
                label3.setVisible(true);
                label3.setText(entry.getKey());
                TextField3.setVisible(true);
            }
            if (i == 3) {
                label4.setVisible(true);
                label4.setText(entry.getKey());
                TextField4.setVisible(true);
            }
            if (i == 4) {
                label5.setVisible(true);
                label5.setText(entry.getKey());
                TextFiedl5.setVisible(true);
            }
            if (i == 5) {
                label6.setVisible(true);
                label6.setText(entry.getKey());
                TextField6.setVisible(true);
            }
            }
            i++;
        }
        layer2.clear();
        layer2 = new HashMap<>();
        layer2.putAll(this.layer1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ColorDialog = new javax.swing.JDialog();
        jColorChooser2 = new javax.swing.JColorChooser();
        ChangeColor = new javax.swing.JButton();
        SelectColor = new javax.swing.JButton();
        MoveDialog = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        CopyDialog = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jFileChooser1 = new javax.swing.JFileChooser();
        jDialog10 = new javax.swing.JDialog();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        mainDialog = new javax.swing.JDialog();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        TextField1 = new javax.swing.JTextField();
        TextField2 = new javax.swing.JTextField();
        TextField3 = new javax.swing.JTextField();
        TextField4 = new javax.swing.JTextField();
        TextFiedl5 = new javax.swing.JTextField();
        TextField6 = new javax.swing.JTextField();
        SaveButton = new javax.swing.JButton();
        DoneButton = new javax.swing.JButton();
        EditDialog = new javax.swing.JDialog();
        LABEL1 = new javax.swing.JLabel();
        LABEL2 = new javax.swing.JLabel();
        LABEL3 = new javax.swing.JLabel();
        LABEL4 = new javax.swing.JLabel();
        LABEL5 = new javax.swing.JLabel();
        LABEL6 = new javax.swing.JLabel();
        TEXT1 = new javax.swing.JTextField();
        TEXT2 = new javax.swing.JTextField();
        Text3 = new javax.swing.JTextField();
        Text4 = new javax.swing.JTextField();
        TEXT5 = new javax.swing.JTextField();
        TEXT6 = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        Rectangle = new javax.swing.JButton();
        Triangle = new javax.swing.JButton();
        Ellipse = new javax.swing.JButton();
        Square = new javax.swing.JButton();
        LineSegment = new javax.swing.JButton();
        Circle = new javax.swing.JButton();
        canvas1 = new java.awt.Canvas();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        MoveButton = new javax.swing.JButton();
        ColorButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        CopyButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        importButton = new javax.swing.JButton();
        useButton = new javax.swing.JButton();

        ColorDialog.setMinimumSize(new java.awt.Dimension(600, 600));

        ChangeColor.setText("Change Color");
        ChangeColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeColorActionPerformed(evt);
            }
        });

        SelectColor.setText("Select Color");
        SelectColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectColorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ColorDialogLayout = new javax.swing.GroupLayout(ColorDialog.getContentPane());
        ColorDialog.getContentPane().setLayout(ColorDialogLayout);
        ColorDialogLayout.setHorizontalGroup(
            ColorDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ColorDialogLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jColorChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(ColorDialogLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(SelectColor)
                .addGap(85, 85, 85)
                .addComponent(ChangeColor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ColorDialogLayout.setVerticalGroup(
            ColorDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ColorDialogLayout.createSequentialGroup()
                .addComponent(jColorChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(ColorDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChangeColor)
                    .addComponent(SelectColor))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        MoveDialog.setMinimumSize(new java.awt.Dimension(500, 500));

        jLabel6.setText("Enter NewX");

        jLabel7.setText("Enter NewY");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jButton16.setText("Done");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MoveDialogLayout = new javax.swing.GroupLayout(MoveDialog.getContentPane());
        MoveDialog.getContentPane().setLayout(MoveDialogLayout);
        MoveDialogLayout.setHorizontalGroup(
            MoveDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoveDialogLayout.createSequentialGroup()
                .addGroup(MoveDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MoveDialogLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(MoveDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(63, 63, 63)
                        .addGroup(MoveDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(jTextField6)))
                    .addGroup(MoveDialogLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jButton16)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        MoveDialogLayout.setVerticalGroup(
            MoveDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoveDialogLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(MoveDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(MoveDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jButton16)
                .addGap(33, 33, 33))
        );

        CopyDialog.setMinimumSize(new java.awt.Dimension(500, 500));

        jLabel10.setText("NEWX");

        jLabel11.setText("NewY");

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jButton18.setText("Done");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CopyDialogLayout = new javax.swing.GroupLayout(CopyDialog.getContentPane());
        CopyDialog.getContentPane().setLayout(CopyDialogLayout);
        CopyDialogLayout.setHorizontalGroup(
            CopyDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CopyDialogLayout.createSequentialGroup()
                .addGroup(CopyDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CopyDialogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(CopyDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(47, 47, 47)
                        .addGroup(CopyDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField9)
                            .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
                    .addGroup(CopyDialogLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jButton18)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        CopyDialogLayout.setVerticalGroup(
            CopyDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CopyDialogLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(CopyDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(CopyDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addComponent(jButton18)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jDialog10.setMinimumSize(new java.awt.Dimension(500, 500));

        jLabel28.setText("X1");

        jLabel29.setText("Y1");

        jLabel30.setText("X2");

        jLabel31.setText("Y2");

        jTextField30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField30ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog10Layout = new javax.swing.GroupLayout(jDialog10.getContentPane());
        jDialog10.getContentPane().setLayout(jDialog10Layout);
        jDialog10Layout.setHorizontalGroup(
            jDialog10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog10Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jDialog10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel30)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28))
                .addGap(57, 57, 57)
                .addGroup(jDialog10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField30, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jTextField29)
                    .addComponent(jTextField28)
                    .addComponent(jTextField27))
                .addGap(195, 195, 195))
        );
        jDialog10Layout.setVerticalGroup(
            jDialog10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog10Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jDialog10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialog10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialog10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialog10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        mainDialog.setMinimumSize(new java.awt.Dimension(500, 500));

        label1.setText("jLabel32");

        label2.setText("jLabel33");

        label3.setText("jLabel34");

        label4.setText("jLabel35");

        label5.setText("jLabel36");

        label6.setText("jLabel37");

        TextField1.setMinimumSize(new java.awt.Dimension(100, 100));
        TextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField1ActionPerformed(evt);
            }
        });

        TextField2.setMinimumSize(new java.awt.Dimension(100, 100));

        TextField3.setMinimumSize(new java.awt.Dimension(100, 100));
        TextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField3ActionPerformed(evt);
            }
        });

        TextField4.setMinimumSize(new java.awt.Dimension(100, 100));

        TextFiedl5.setMinimumSize(new java.awt.Dimension(100, 100));

        TextField6.setMinimumSize(new java.awt.Dimension(100, 100));

        SaveButton.setText("save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        DoneButton.setText("Done");
        DoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainDialogLayout = new javax.swing.GroupLayout(mainDialog.getContentPane());
        mainDialog.getContentPane().setLayout(mainDialogLayout);
        mainDialogLayout.setHorizontalGroup(
            mainDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainDialogLayout.createSequentialGroup()
                .addGroup(mainDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainDialogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mainDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainDialogLayout.createSequentialGroup()
                                .addGroup(mainDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label1)
                                    .addComponent(label6))
                                .addGap(66, 66, 66)
                                .addGroup(mainDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainDialogLayout.createSequentialGroup()
                                .addGroup(mainDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label2)
                                    .addComponent(label4)
                                    .addComponent(label5)
                                    .addComponent(label3))
                                .addGap(66, 66, 66)
                                .addGroup(mainDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextFiedl5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(mainDialogLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(SaveButton)
                        .addGap(41, 41, 41)
                        .addComponent(DoneButton)))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        mainDialogLayout.setVerticalGroup(
            mainDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1)
                    .addComponent(TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2)
                    .addComponent(TextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label3)
                    .addComponent(TextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(mainDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainDialogLayout.createSequentialGroup()
                        .addComponent(TextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(mainDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label5)
                            .addComponent(TextFiedl5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14)
                .addGroup(mainDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label6)
                    .addComponent(TextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(mainDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveButton)
                    .addComponent(DoneButton))
                .addContainerGap())
        );

        EditDialog.setMinimumSize(new java.awt.Dimension(500, 500));

        LABEL1.setText("jLabel1");

        LABEL2.setText("jLabel2");

        LABEL3.setText("jLabel3");

        LABEL4.setText("jLabel5");

        LABEL5.setText("jLabel8");

        LABEL6.setText("jLabel9");

        TEXT1.setText("jTextField1");

        TEXT2.setText("jTextField2");

        Text3.setText("jTextField3");

        Text4.setText("jTextField4");

        TEXT5.setText("jTextField7");

        TEXT6.setText("jTextField8");

        editButton.setText("EDIT");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EditDialogLayout = new javax.swing.GroupLayout(EditDialog.getContentPane());
        EditDialog.getContentPane().setLayout(EditDialogLayout);
        EditDialogLayout.setHorizontalGroup(
            EditDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EditDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LABEL1)
                    .addComponent(LABEL2)
                    .addComponent(LABEL3)
                    .addComponent(LABEL4)
                    .addComponent(LABEL5)
                    .addComponent(LABEL6))
                .addGap(97, 97, 97)
                .addGroup(EditDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TEXT6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TEXT5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TEXT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TEXT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditDialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editButton)
                .addGap(85, 85, 85))
        );
        EditDialogLayout.setVerticalGroup(
            EditDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EditDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(EditDialogLayout.createSequentialGroup()
                        .addGroup(EditDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LABEL1)
                            .addComponent(TEXT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(EditDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LABEL2)
                            .addComponent(TEXT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(EditDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LABEL3)
                            .addComponent(Text3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LABEL4))
                    .addComponent(Text4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EditDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LABEL5)
                    .addComponent(TEXT5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EditDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LABEL6)
                    .addComponent(TEXT6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(editButton)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 944));
        setPreferredSize(new java.awt.Dimension(1300, 944));

        Rectangle.setText("Rectangle");
        Rectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RectangleActionPerformed(evt);
            }
        });

        Triangle.setText("Triangle");
        Triangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TriangleActionPerformed(evt);
            }
        });

        Ellipse.setText("Ellipse");
        Ellipse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EllipseActionPerformed(evt);
            }
        });

        Square.setText("Square");
        Square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SquareActionPerformed(evt);
            }
        });

        LineSegment.setText("Line Segement");
        LineSegment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LineSegmentActionPerformed(evt);
            }
        });

        Circle.setText("Circle");
        Circle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CircleActionPerformed(evt);
            }
        });

        canvas1.setBackground(new java.awt.Color(255, 255, 255));

        jButton8.setText("Undo");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Redo");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Select Shape");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        MoveButton.setText("Move");
        MoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoveButtonActionPerformed(evt);
            }
        });

        ColorButton.setText("Color");
        ColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorButtonActionPerformed(evt);
            }
        });

        EditButton.setText("Edit");
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        CopyButton.setText("Copy");
        CopyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("Select plugins");

        importButton.setText("Import");
        importButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importButtonActionPerformed(evt);
            }
        });

        useButton.setText("Use");
        useButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(Circle, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LineSegment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Square)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ellipse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Triangle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Rectangle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(MoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CopyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(useButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(importButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 3194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Rectangle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Triangle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addComponent(Ellipse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Square, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LineSegment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Circle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MoveButton)
                            .addComponent(EditButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CopyButton)
                            .addComponent(ColorButton))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel32))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DeleteButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(importButton)
                            .addComponent(useButton)))
                    .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(260, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RectangleActionPerformed
//      jDialog1.setVisible(true); COde el adim
        this.cur = new Rectangle();
        Map<String, Double> mp = cur.getProperties();
        Hide();
        Display(mp);// TODO add your handling code here:
    }//GEN-LAST:event_RectangleActionPerformed

    private void TriangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TriangleActionPerformed
        this.cur = new Triangle();
        Map<String, Double> mp = cur.getProperties();
        Hide();
        Display(mp);        // TODO add your handling code here:
    }//GEN-LAST:event_TriangleActionPerformed

    private void ColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorButtonActionPerformed

        ColorDialog.setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_ColorButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void SquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SquareActionPerformed
        this.cur = new Square();
        Map<String, Double> mp = cur.getProperties();
        Hide();
        Display(mp);          // TODO add your handling code here:
    }//GEN-LAST:event_SquareActionPerformed

    private void MoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoveButtonActionPerformed
        MoveDialog.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_MoveButtonActionPerformed

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        SaveButton.setVisible(false);
        DoneButton.setVisible(true);

        if (jComboBox1.getItemCount() == 0) {
            return;
        }
        int idx = jComboBox1.getSelectedIndex();
        cur = jComboBox1.getItemAt(idx);
        Map<String, Double> mp = cur.getProperties();
   
        Hide();
        displayEditDialog();

        // TODO add your handling code here:
    }//GEN-LAST:event_EditButtonActionPerformed

    private void CopyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyButtonActionPerformed
        CopyDialog.setVisible(true);

    }//GEN-LAST:event_CopyButtonActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int i = 0;
        if (i <= 20) {
            if (jComboBox1.getItemCount() > 0) {
                jComboBox1.removeItemAt(jComboBox1.getItemCount() - 1);
            }
            Engine.getInstance().undo();
            Graphics g = canvas1.getGraphics();
            g.setColor(Color.white);
            g.fillRect(0, 0, canvas1.getWidth(), canvas1.getHeight());
            Engine.getInstance().refresh(canvas1.getGraphics());
            i++;
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "limit exceeded!", "Undo overflow", JOptionPane.ERROR_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (Engine.getInstance().stack.size() > 0) {
            jComboBox1.addItem(Engine.getInstance().stack.lastElement());
        }
        Engine.getInstance().redo();
        Engine.getInstance().refresh(canvas1.getGraphics());
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        if (jComboBox1.getItemCount() == 0) {
            return;
        }
        int idx = jComboBox1.getSelectedIndex();
        jComboBox1.removeItemAt(idx);
        Engine.getInstance().removeShape(jComboBox1.getItemAt(idx));
        Graphics g = canvas1.getGraphics();
        g.setColor(Color.white);
        g.fillRect(0, 0, canvas1.getWidth(), canvas1.getHeight());
        Engine.getInstance().refresh(canvas1.getGraphics());  // TODO add your handling code here:
    }//GEN-LAST:event_DeleteButtonActionPerformed
//move button
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        int ind = jComboBox1.getSelectedIndex();
        Engine.getInstance().addShape(jComboBox1.getItemAt(ind));
        Engine.getInstance().removeShape(jComboBox1.getItemAt(ind));
        Graphics g = canvas1.getGraphics();
        g.setColor(Color.white);
        g.fillRect(0, 0, canvas1.getWidth(), canvas1.getHeight());
        
        int newX = Integer.parseInt(jTextField5.getText());
        int newY = Integer.parseInt(jTextField5.getText());
        Point x = new Point(newX, newY);
     
        jComboBox1.getItemAt(ind).setPosition(x);
        jComboBox1.getItemAt(ind).draw(g);
        Engine.getInstance().refresh(canvas1.getGraphics());

        MoveDialog.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        int index = jComboBox1.getSelectedIndex();

        try {
            Shape c = (Shape) jComboBox1.getItemAt(index).clone();
            int Nx = Integer.parseInt(jTextField9.getText());
            int Ny = Integer.parseInt(jTextField10.getText());
            Point x = new Point(Nx, Ny);
            c.setPosition(x);
            Engine.getInstance().addShape(c);
            jComboBox1.addItem(c);
            Engine.getInstance().refresh(canvas1.getGraphics());
            CopyDialog.setVisible(false);
// TODO add your handling  here:
        } catch (CloneNotSupportedException ex) {
            System.out.println(ex);

        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void EllipseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EllipseActionPerformed
        this.cur = new Ellipse();
        Map<String, Double> mp = cur.getProperties();
        Hide();
        Display(mp);    // TODO add your handling code here:
    }//GEN-LAST:event_EllipseActionPerformed

    private void CircleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CircleActionPerformed
        this.cur = new Circle();
        Map<String, Double> mp = cur.getProperties();
        Hide();
        Display(mp);        // TODO add your handling code here:
    }//GEN-LAST:event_CircleActionPerformed

    private void LineSegmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LineSegmentActionPerformed
        this.cur = new Line();
        Map<String, Double> mp = cur.getProperties();
        Hide();
        Display(mp);       // TODO add your handling code here:
    }//GEN-LAST:event_LineSegmentActionPerformed

    private void importButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importButtonActionPerformed
        FileNameExtensionFilter jarFilter = new FileNameExtensionFilter("JAR files", "jar");
        jFileChooser1.setFileFilter(jarFilter);
        jFileChooser1.showOpenDialog(null);
        File pluginFile = jFileChooser1.getSelectedFile();
        String qualifiedClassName = javax.swing.JOptionPane.showInputDialog("Enter Qualified Class Name: ");
        try {
            URL url = pluginFile.toURL();
            URL[] urls = new URL[]{url};
            ClassLoader loader = new URLClassLoader(urls);
            Class myClass = Class.forName(qualifiedClassName, true, loader);
            Engine.getInstance().installPluginShape(myClass);
            jComboBox2.removeAllItems();
            Engine.getInstance().getSupportedShapes().forEach((supportedShape) -> {
                jComboBox2.addItem(supportedShape);
            });
        } catch (MalformedURLException | ClassNotFoundException e) {
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_importButtonActionPerformed

    private void useButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useButtonActionPerformed
        if (jComboBox2.getItemCount() == 0) {
            return;
        }
        int idx = jComboBox2.getSelectedIndex();
        try {
            Constructor<? extends Shape> constructor = jComboBox2.getItemAt(idx).getDeclaredConstructor();
            constructor.setAccessible(true);
            this.cur = constructor.newInstance();
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
        }
        Map<String, Double> mp = cur.getProperties();
        Hide();
        Display(mp);        // TODO add your handling code here:
    }//GEN-LAST:event_useButtonActionPerformed

    private void ChangeColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeColorActionPerformed
        int n = jComboBox1.getSelectedIndex();
        Shape s = jComboBox1.getItemAt(n);
        s.setFillColor(jColorChooser2.getColor());
        s.setColor(jColorChooser2.getColor());
        s.draw(canvas1.getGraphics());
        ColorDialog.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_ChangeColorActionPerformed

    private void jTextField30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField30ActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
  int i = 0;
  int in= jComboBox1.getSelectedIndex();
  
        layer2 = new HashMap<String, Double>();
        for (Map.Entry<String, Double> entry : layer1.entrySet()) {
            if(layer1.containsKey("X-axis")){
                xaxis = layer1.get("X-axis");
                continue;
            }
            else if(layer1.containsKey("Y-axis")){
                 yaxis = layer1.get("Y-axis");
                continue;
            }
            else{
            if (i == 0) {
                layer2.put(entry.getKey(), Double.parseDouble(TextField1.getText()));
            }
            if (i == 1) {
                layer2.put(entry.getKey(), Double.parseDouble(TextField2.getText()));
            }
            if (i == 2) {
                layer2.put(entry.getKey(), Double.parseDouble(TextField3.getText()));
            }
            if (i == 3) {
                layer2.put(entry.getKey(), Double.parseDouble(TextField4.getText()));
            }
            if (i == 4) {
                layer2.put(entry.getKey(), Double.parseDouble(TextFiedl5.getText()));
            }
            if (i == 5) {
                layer2.put(entry.getKey(), Double.parseDouble(TextField6.getText()));
            }
            i++;
            }
        }

        Graphics g = canvas1.getGraphics();
        g.setColor(Color.white);
        g.fillRect(0, 0, canvas1.getWidth(), canvas1.getHeight());
        Engine.getInstance().refresh(canvas1.getGraphics());
        Hide();
     
        layer2.clear();        // TODO add your handling code here:
    }//GEN-LAST:event_editButtonActionPerformed

    private void SelectColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectColorActionPerformed
ColorDialog.setVisible(false);          // TODO add your handling code here:
    }//GEN-LAST:event_SelectColorActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
       
        layer2.clear();
        int i = 0;
        layer2 = new HashMap<>();
        for (Map.Entry<String, Double> entry : layer1.entrySet()) {
            if (i == 0) {
                layer2.put(entry.getKey(), Double.parseDouble(TextField1.getText()));
            }
            if (i == 1) {
                layer2.put(entry.getKey(), Double.parseDouble(TextField2.getText()));
            }
            if (i == 2) {
                layer2.put(entry.getKey(), Double.parseDouble(TextField3.getText()));
            }
            if (i == 3) {
                layer2.put(entry.getKey(), Double.parseDouble(TextField4.getText()));
            }
            if (i == 4) {
                layer2.put(entry.getKey(), Double.parseDouble(TextFiedl5.getText()));
            }
            if (i == 5) {
                layer2.put(entry.getKey(), Double.parseDouble(TextField6.getText()));
            }

            i++;
        }
        Point p = new Point();
        if (!layer2.containsKey("X1") && !layer2.containsKey("Y1")) {
            p.x = layer2.get("X-axis").intValue();
            p.y = layer2.get("Y-axis").intValue();
            cur.setPosition(p);
        }
        cur.setProperties(new HashMap<>(layer2));
        Graphics g = canvas1.getGraphics();
        g.setColor(Color.white);
        g.fillRect(0, 0, canvas1.getWidth(), canvas1.getHeight());

        cur.setColor(jColorChooser2.getColor());
        cur.setFillColor(jColorChooser2.getColor());
        Engine.getInstance().addShape(cur);
        Engine.getInstance().refresh(canvas1.getGraphics());
        jComboBox1.addItem(cur);
        Hide();
        layer2.clear();// TODO add your handling code here:
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void TextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField1ActionPerformed

    private void TextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField3ActionPerformed

    private void DoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneButtonActionPerformed
int i = 0;
  
  
  int in= jComboBox1.getSelectedIndex();
  Shape s = jComboBox1.getItemAt(in);
  layer1=s.getProperties();
  
        layer2 = new HashMap<String, Double>();
        for (Map.Entry<String, Double> entry : layer1.entrySet()) {
            if(entry.getKey().equals("X-axis")){
                xaxis = layer1.get("X-axis");
                layer2.put("X-axis", xaxis);
               
                continue;
            }
           else if(entry.getKey().equals("Y-axis")){
                 yaxis = layer1.get("Y-axis");
                  layer2.put("Y-axis", yaxis);
                continue;
            }
            else{
            if (i == 0) {
                layer2.put(entry.getKey(), Double.parseDouble(TextField1.getText()));
            }
            if (i == 1) {
                layer2.put(entry.getKey(), Double.parseDouble(TextField2.getText()));
            }
            if (i == 2) {
                layer2.put(entry.getKey(), Double.parseDouble(TextField3.getText()));
            }
            if (i == 3) {
                layer2.put(entry.getKey(), Double.parseDouble(TextField4.getText()));
            }
            if (i == 4) {
                layer2.put(entry.getKey(), Double.parseDouble(TextFiedl5.getText()));
            }
            if (i == 5) {
                layer2.put(entry.getKey(), Double.parseDouble(TextField6.getText()));
            }
            i++;
            }
        }

s.setProperties(new HashMap<>(layer2));
        Graphics g = canvas1.getGraphics();
        g.setColor(Color.white);
        g.fillRect(0, 0, canvas1.getWidth(), canvas1.getHeight());
        Engine.getInstance().refresh(canvas1.getGraphics());
        Hide();
     SaveButton.setVisible(true);
        layer2.clear();        // TODO add your handling code here:
    }//GEN-LAST:event_DoneButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PaintFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaintFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaintFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaintFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaintFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChangeColor;
    private javax.swing.JButton Circle;
    private javax.swing.JButton ColorButton;
    private javax.swing.JDialog ColorDialog;
    private javax.swing.JButton CopyButton;
    private javax.swing.JDialog CopyDialog;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton DoneButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JDialog EditDialog;
    private javax.swing.JButton Ellipse;
    private javax.swing.JLabel LABEL1;
    private javax.swing.JLabel LABEL2;
    private javax.swing.JLabel LABEL3;
    private javax.swing.JLabel LABEL4;
    private javax.swing.JLabel LABEL5;
    private javax.swing.JLabel LABEL6;
    private javax.swing.JButton LineSegment;
    private javax.swing.JButton MoveButton;
    private javax.swing.JDialog MoveDialog;
    private javax.swing.JButton Rectangle;
    private javax.swing.JButton SaveButton;
    private javax.swing.JButton SelectColor;
    private javax.swing.JButton Square;
    private javax.swing.JTextField TEXT1;
    private javax.swing.JTextField TEXT2;
    private javax.swing.JTextField TEXT5;
    private javax.swing.JTextField TEXT6;
    private javax.swing.JTextField Text3;
    private javax.swing.JTextField Text4;
    private javax.swing.JTextField TextFiedl5;
    private javax.swing.JTextField TextField1;
    private javax.swing.JTextField TextField2;
    private javax.swing.JTextField TextField3;
    private javax.swing.JTextField TextField4;
    private javax.swing.JTextField TextField6;
    private javax.swing.JButton Triangle;
    private java.awt.Canvas canvas1;
    private javax.swing.JButton editButton;
    private javax.swing.JButton importButton;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JComboBox<Shape> jComboBox1;
    private javax.swing.JComboBox<Class<? extends Shape>> jComboBox2;
    private javax.swing.JDialog jDialog10;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JDialog mainDialog;
    private javax.swing.JButton useButton;
    // End of variables declaration//GEN-END:variables
}
