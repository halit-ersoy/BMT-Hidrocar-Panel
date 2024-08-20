package com.ses.panel;

import javax.swing.JFrame;

public class UI1 extends JFrame {

    public UI1() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    public void updateUI(String output) {
        /*
        model.updateColor(battery_temperature_color_1, 50);
        model.updateColor(battery_temperature_color_2, 50);
        model.updateColor(battery_temperature_color_3, 50);
        model.updateColor(battery_temperature_color_4, 50);
        model.updateColor(battery_temperature_color_5, 50);
        model.updateColor(battery_temperature_color_6, 50);
        model.updateColor(battery_temperature_color_7, 50);
        model.updateColor(battery_temperature_color_8, 50);
        model.updateColor(motor_driver_color_1, 50);
        model.updateColor(motor_driver_color_2, 50);
        model.updateColor(hydrogen_cylinder_color, 50);
        model.updateColor(onboard_charging_color, 50);
        model.updateColor(eys_color_1, 50);
        model.updateColor(eys_color_2, 50);
        model.updateColor(eys_color_3, 50);
        
        model.updateContent(battery_temperature_text_1, "30" + "°C");
        model.updateContent(battery_temperature_text_2, "30" + "°C");
        model.updateContent(battery_temperature_text_3, "30" + "°C");
        model.updateContent(battery_temperature_text_4, "30" + "°C");
        model.updateContent(battery_temperature_text_5, "30" + "°C");
        model.updateContent(battery_temperature_text_6, "30" + "°C");
        model.updateContent(battery_temperature_text_7, "30" + "°C");
        model.updateContent(battery_temperature_text_8, "30" + "°C");
        model.updateContent(motor_driver_text_1, "50" + "°C");
        model.updateContent(motor_driver_text_2, "50" + "°C");
        model.updateContent(hydrogen_cylinder_text, "70" + "°C");
        model.updateContent(onboard_charging_text, "70" + "°C");
        model.updateContent(eys_text_1, "90" + "°C");
        model.updateContent(eys_text_2, "90" + "°C");
        model.updateContent(eys_text_3, "100" + "°C");
        */
        
        UiModel model = new UiModel();
        String[] data = output.split(" ");
        model.updateContent(battery_temperature_text_1, data[1] + "°C");
        model.updateContent(battery_temperature_text_2, data[2] + "°C");
        model.updateContent(battery_temperature_text_3, data[3] + "°C");
        model.updateContent(battery_temperature_text_4, data[4] + "°C");
        model.updateContent(battery_temperature_text_5, data[5] + "°C");
        model.updateContent(battery_temperature_text_6, data[6] + "°C");
        model.updateContent(hydrogen_cylinder_text, data[7] + "°C");
        
        model.updateColor(battery_temperature_color_1, data[1]);
        model.updateColor(battery_temperature_color_2, data[2]);
        model.updateColor(battery_temperature_color_3, data[3]);
        model.updateColor(battery_temperature_color_4, data[4]);
        model.updateColor(battery_temperature_color_5, data[5]);
        model.updateColor(battery_temperature_color_6, data[6]);
        model.updateColor(hydrogen_cylinder_color, data[7]);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        battery_temperature_color_2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        battery_temperature_text_2 = new javax.swing.JLabel();
        battery_temperature_color_4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        battery_temperature_text_4 = new javax.swing.JLabel();
        battery_temperature_color_3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        battery_temperature_text_3 = new javax.swing.JLabel();
        battery_temperature_color_1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        battery_temperature_text_1 = new javax.swing.JLabel();
        battery_temperature_color_6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        battery_temperature_text_6 = new javax.swing.JLabel();
        battery_temperature_color_8 = new javax.swing.JPanel();
        battery_temperature_text_8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        battery_temperature_color_7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        battery_temperature_text_7 = new javax.swing.JLabel();
        battery_temperature_color_5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        battery_temperature_text_5 = new javax.swing.JLabel();
        motor_driver_color_2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        motor_driver_text_2 = new javax.swing.JLabel();
        onboard_charging_color = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        onboard_charging_text = new javax.swing.JLabel();
        hydrogen_cylinder_color = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        hydrogen_cylinder_text = new javax.swing.JLabel();
        motor_driver_color_1 = new javax.swing.JPanel();
        motor_driver_text_1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        eys_color_2 = new javax.swing.JPanel();
        eys_text_2 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        spare_color = new javax.swing.JPanel();
        eys_color_3 = new javax.swing.JPanel();
        eys_text_3 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        eys_color_1 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        eys_text_1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setUndecorated(true);

        battery_temperature_color_2.setBackground(new java.awt.Color(102, 204, 0));
        battery_temperature_color_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        battery_temperature_color_2.setPreferredSize(new java.awt.Dimension(310, 170));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Batarya Sıcaklığı-2");

        battery_temperature_text_2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        battery_temperature_text_2.setForeground(new java.awt.Color(0, 0, 0));
        battery_temperature_text_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        battery_temperature_text_2.setText("30°C");

        javax.swing.GroupLayout battery_temperature_color_2Layout = new javax.swing.GroupLayout(battery_temperature_color_2);
        battery_temperature_color_2.setLayout(battery_temperature_color_2Layout);
        battery_temperature_color_2Layout.setHorizontalGroup(
            battery_temperature_color_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(battery_temperature_color_2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(battery_temperature_color_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(battery_temperature_text_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        battery_temperature_color_2Layout.setVerticalGroup(
            battery_temperature_color_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(battery_temperature_color_2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(battery_temperature_text_2)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        battery_temperature_color_4.setBackground(new java.awt.Color(102, 204, 0));
        battery_temperature_color_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        battery_temperature_color_4.setPreferredSize(new java.awt.Dimension(310, 170));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Batarya Sıcaklığı-4");

        battery_temperature_text_4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        battery_temperature_text_4.setForeground(new java.awt.Color(0, 0, 0));
        battery_temperature_text_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        battery_temperature_text_4.setText("30°C");

        javax.swing.GroupLayout battery_temperature_color_4Layout = new javax.swing.GroupLayout(battery_temperature_color_4);
        battery_temperature_color_4.setLayout(battery_temperature_color_4Layout);
        battery_temperature_color_4Layout.setHorizontalGroup(
            battery_temperature_color_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(battery_temperature_color_4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(battery_temperature_color_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(battery_temperature_text_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        battery_temperature_color_4Layout.setVerticalGroup(
            battery_temperature_color_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(battery_temperature_color_4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(battery_temperature_text_4)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        battery_temperature_color_3.setBackground(new java.awt.Color(102, 204, 0));
        battery_temperature_color_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        battery_temperature_color_3.setPreferredSize(new java.awt.Dimension(310, 170));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Batarya Sıcaklığı-3");

        battery_temperature_text_3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        battery_temperature_text_3.setForeground(new java.awt.Color(0, 0, 0));
        battery_temperature_text_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        battery_temperature_text_3.setText("30°C");

        javax.swing.GroupLayout battery_temperature_color_3Layout = new javax.swing.GroupLayout(battery_temperature_color_3);
        battery_temperature_color_3.setLayout(battery_temperature_color_3Layout);
        battery_temperature_color_3Layout.setHorizontalGroup(
            battery_temperature_color_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(battery_temperature_color_3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(battery_temperature_color_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(battery_temperature_text_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        battery_temperature_color_3Layout.setVerticalGroup(
            battery_temperature_color_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(battery_temperature_color_3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(battery_temperature_text_3)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        battery_temperature_color_1.setBackground(new java.awt.Color(102, 204, 0));
        battery_temperature_color_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        battery_temperature_color_1.setPreferredSize(new java.awt.Dimension(310, 170));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Batarya Sıcaklığı-1");

        battery_temperature_text_1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        battery_temperature_text_1.setForeground(new java.awt.Color(0, 0, 0));
        battery_temperature_text_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        battery_temperature_text_1.setText("30°C");

        javax.swing.GroupLayout battery_temperature_color_1Layout = new javax.swing.GroupLayout(battery_temperature_color_1);
        battery_temperature_color_1.setLayout(battery_temperature_color_1Layout);
        battery_temperature_color_1Layout.setHorizontalGroup(
            battery_temperature_color_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(battery_temperature_color_1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(battery_temperature_color_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(battery_temperature_text_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        battery_temperature_color_1Layout.setVerticalGroup(
            battery_temperature_color_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(battery_temperature_color_1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(battery_temperature_text_1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        battery_temperature_color_6.setBackground(new java.awt.Color(255, 204, 0));
        battery_temperature_color_6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        battery_temperature_color_6.setPreferredSize(new java.awt.Dimension(310, 170));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Batarya Sıcaklığı-6");

        battery_temperature_text_6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        battery_temperature_text_6.setForeground(new java.awt.Color(0, 0, 0));
        battery_temperature_text_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        battery_temperature_text_6.setText("50°C");

        javax.swing.GroupLayout battery_temperature_color_6Layout = new javax.swing.GroupLayout(battery_temperature_color_6);
        battery_temperature_color_6.setLayout(battery_temperature_color_6Layout);
        battery_temperature_color_6Layout.setHorizontalGroup(
            battery_temperature_color_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(battery_temperature_color_6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(battery_temperature_color_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(battery_temperature_text_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        battery_temperature_color_6Layout.setVerticalGroup(
            battery_temperature_color_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(battery_temperature_color_6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(battery_temperature_text_6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        battery_temperature_color_8.setBackground(new java.awt.Color(255, 204, 0));
        battery_temperature_color_8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        battery_temperature_color_8.setPreferredSize(new java.awt.Dimension(310, 170));

        battery_temperature_text_8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        battery_temperature_text_8.setForeground(new java.awt.Color(0, 0, 0));
        battery_temperature_text_8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        battery_temperature_text_8.setText("50°C");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Batarya Sıcaklığı-8");

        javax.swing.GroupLayout battery_temperature_color_8Layout = new javax.swing.GroupLayout(battery_temperature_color_8);
        battery_temperature_color_8.setLayout(battery_temperature_color_8Layout);
        battery_temperature_color_8Layout.setHorizontalGroup(
            battery_temperature_color_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(battery_temperature_color_8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(battery_temperature_color_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(battery_temperature_text_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        battery_temperature_color_8Layout.setVerticalGroup(
            battery_temperature_color_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(battery_temperature_color_8Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(battery_temperature_text_8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        battery_temperature_color_7.setBackground(new java.awt.Color(255, 204, 0));
        battery_temperature_color_7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        battery_temperature_color_7.setPreferredSize(new java.awt.Dimension(310, 170));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Batarya Sıcaklığı-7");

        battery_temperature_text_7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        battery_temperature_text_7.setForeground(new java.awt.Color(0, 0, 0));
        battery_temperature_text_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        battery_temperature_text_7.setText("50°C");

        javax.swing.GroupLayout battery_temperature_color_7Layout = new javax.swing.GroupLayout(battery_temperature_color_7);
        battery_temperature_color_7.setLayout(battery_temperature_color_7Layout);
        battery_temperature_color_7Layout.setHorizontalGroup(
            battery_temperature_color_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(battery_temperature_color_7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(battery_temperature_color_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(battery_temperature_text_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        battery_temperature_color_7Layout.setVerticalGroup(
            battery_temperature_color_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(battery_temperature_color_7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(battery_temperature_text_7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        battery_temperature_color_5.setBackground(new java.awt.Color(255, 204, 0));
        battery_temperature_color_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        battery_temperature_color_5.setPreferredSize(new java.awt.Dimension(310, 170));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Batarya Sıcaklığı-5");

        battery_temperature_text_5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        battery_temperature_text_5.setForeground(new java.awt.Color(0, 0, 0));
        battery_temperature_text_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        battery_temperature_text_5.setText("50°C");

        javax.swing.GroupLayout battery_temperature_color_5Layout = new javax.swing.GroupLayout(battery_temperature_color_5);
        battery_temperature_color_5.setLayout(battery_temperature_color_5Layout);
        battery_temperature_color_5Layout.setHorizontalGroup(
            battery_temperature_color_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(battery_temperature_color_5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(battery_temperature_color_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(battery_temperature_text_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        battery_temperature_color_5Layout.setVerticalGroup(
            battery_temperature_color_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(battery_temperature_color_5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(battery_temperature_text_5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        motor_driver_color_2.setBackground(new java.awt.Color(255, 0, 0));
        motor_driver_color_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        motor_driver_color_2.setPreferredSize(new java.awt.Dimension(310, 170));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Motor Sürücü-2");

        motor_driver_text_2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        motor_driver_text_2.setForeground(new java.awt.Color(0, 0, 0));
        motor_driver_text_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        motor_driver_text_2.setText("70°C");

        javax.swing.GroupLayout motor_driver_color_2Layout = new javax.swing.GroupLayout(motor_driver_color_2);
        motor_driver_color_2.setLayout(motor_driver_color_2Layout);
        motor_driver_color_2Layout.setHorizontalGroup(
            motor_driver_color_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(motor_driver_color_2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(motor_driver_color_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(motor_driver_text_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        motor_driver_color_2Layout.setVerticalGroup(
            motor_driver_color_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(motor_driver_color_2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(motor_driver_text_2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        onboard_charging_color.setBackground(new java.awt.Color(255, 0, 0));
        onboard_charging_color.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        onboard_charging_color.setPreferredSize(new java.awt.Dimension(310, 170));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Yerleşik şarj");

        onboard_charging_text.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        onboard_charging_text.setForeground(new java.awt.Color(0, 0, 0));
        onboard_charging_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        onboard_charging_text.setText("70°C");

        javax.swing.GroupLayout onboard_charging_colorLayout = new javax.swing.GroupLayout(onboard_charging_color);
        onboard_charging_color.setLayout(onboard_charging_colorLayout);
        onboard_charging_colorLayout.setHorizontalGroup(
            onboard_charging_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(onboard_charging_colorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(onboard_charging_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(onboard_charging_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        onboard_charging_colorLayout.setVerticalGroup(
            onboard_charging_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(onboard_charging_colorLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(onboard_charging_text)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        hydrogen_cylinder_color.setBackground(new java.awt.Color(255, 0, 0));
        hydrogen_cylinder_color.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        hydrogen_cylinder_color.setPreferredSize(new java.awt.Dimension(310, 170));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Hidrojen Tüpü");

        hydrogen_cylinder_text.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        hydrogen_cylinder_text.setForeground(new java.awt.Color(0, 0, 0));
        hydrogen_cylinder_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hydrogen_cylinder_text.setText("70°C");

        javax.swing.GroupLayout hydrogen_cylinder_colorLayout = new javax.swing.GroupLayout(hydrogen_cylinder_color);
        hydrogen_cylinder_color.setLayout(hydrogen_cylinder_colorLayout);
        hydrogen_cylinder_colorLayout.setHorizontalGroup(
            hydrogen_cylinder_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hydrogen_cylinder_colorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hydrogen_cylinder_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hydrogen_cylinder_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        hydrogen_cylinder_colorLayout.setVerticalGroup(
            hydrogen_cylinder_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hydrogen_cylinder_colorLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hydrogen_cylinder_text)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        motor_driver_color_1.setBackground(new java.awt.Color(255, 0, 0));
        motor_driver_color_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        motor_driver_color_1.setPreferredSize(new java.awt.Dimension(310, 170));

        motor_driver_text_1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        motor_driver_text_1.setForeground(new java.awt.Color(0, 0, 0));
        motor_driver_text_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        motor_driver_text_1.setText("70°C");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Motor Sürücü-1");

        javax.swing.GroupLayout motor_driver_color_1Layout = new javax.swing.GroupLayout(motor_driver_color_1);
        motor_driver_color_1.setLayout(motor_driver_color_1Layout);
        motor_driver_color_1Layout.setHorizontalGroup(
            motor_driver_color_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(motor_driver_color_1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(motor_driver_color_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(motor_driver_text_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        motor_driver_color_1Layout.setVerticalGroup(
            motor_driver_color_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(motor_driver_color_1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(motor_driver_text_1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        eys_color_2.setBackground(new java.awt.Color(102, 204, 0));
        eys_color_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        eys_color_2.setPreferredSize(new java.awt.Dimension(310, 170));

        eys_text_2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        eys_text_2.setForeground(new java.awt.Color(0, 0, 0));
        eys_text_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eys_text_2.setText("70°C");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("EYS-2");

        javax.swing.GroupLayout eys_color_2Layout = new javax.swing.GroupLayout(eys_color_2);
        eys_color_2.setLayout(eys_color_2Layout);
        eys_color_2Layout.setHorizontalGroup(
            eys_color_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eys_color_2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(eys_color_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eys_text_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        eys_color_2Layout.setVerticalGroup(
            eys_color_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eys_color_2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eys_text_2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        spare_color.setBackground(new java.awt.Color(102, 204, 0));
        spare_color.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        spare_color.setPreferredSize(new java.awt.Dimension(310, 170));

        javax.swing.GroupLayout spare_colorLayout = new javax.swing.GroupLayout(spare_color);
        spare_color.setLayout(spare_colorLayout);
        spare_colorLayout.setHorizontalGroup(
            spare_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        spare_colorLayout.setVerticalGroup(
            spare_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        eys_color_3.setBackground(new java.awt.Color(102, 204, 0));
        eys_color_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        eys_color_3.setPreferredSize(new java.awt.Dimension(310, 170));

        eys_text_3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        eys_text_3.setForeground(new java.awt.Color(0, 0, 0));
        eys_text_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eys_text_3.setText("70°C");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("EYS-3");

        javax.swing.GroupLayout eys_color_3Layout = new javax.swing.GroupLayout(eys_color_3);
        eys_color_3.setLayout(eys_color_3Layout);
        eys_color_3Layout.setHorizontalGroup(
            eys_color_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eys_color_3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(eys_color_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eys_text_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        eys_color_3Layout.setVerticalGroup(
            eys_color_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eys_color_3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eys_text_3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        eys_color_1.setBackground(new java.awt.Color(102, 204, 0));
        eys_color_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        eys_color_1.setPreferredSize(new java.awt.Dimension(310, 170));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("EYS-1");

        eys_text_1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        eys_text_1.setForeground(new java.awt.Color(0, 0, 0));
        eys_text_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eys_text_1.setText("70°C");

        javax.swing.GroupLayout eys_color_1Layout = new javax.swing.GroupLayout(eys_color_1);
        eys_color_1.setLayout(eys_color_1Layout);
        eys_color_1Layout.setHorizontalGroup(
            eys_color_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eys_color_1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(eys_color_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eys_text_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                .addContainerGap())
        );
        eys_color_1Layout.setVerticalGroup(
            eys_color_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eys_color_1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eys_text_1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(battery_temperature_color_1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(battery_temperature_color_5, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(motor_driver_color_1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(eys_color_1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(battery_temperature_color_2, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(battery_temperature_color_6, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(motor_driver_color_2, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(eys_color_2, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(battery_temperature_color_3, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(battery_temperature_color_7, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(hydrogen_cylinder_color, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(eys_color_3, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(battery_temperature_color_4, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(battery_temperature_color_8, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(onboard_charging_color, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(spare_color, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)))
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(battery_temperature_color_1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(battery_temperature_color_5, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(motor_driver_color_1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(eys_color_1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(battery_temperature_color_2, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(battery_temperature_color_6, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(motor_driver_color_2, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(eys_color_2, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(battery_temperature_color_3, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(battery_temperature_color_7, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(hydrogen_cylinder_color, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(eys_color_3, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(battery_temperature_color_4, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(battery_temperature_color_8, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(onboard_charging_color, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(spare_color, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel battery_temperature_color_1;
    private javax.swing.JPanel battery_temperature_color_2;
    private javax.swing.JPanel battery_temperature_color_3;
    private javax.swing.JPanel battery_temperature_color_4;
    private javax.swing.JPanel battery_temperature_color_5;
    private javax.swing.JPanel battery_temperature_color_6;
    private javax.swing.JPanel battery_temperature_color_7;
    private javax.swing.JPanel battery_temperature_color_8;
    private javax.swing.JLabel battery_temperature_text_1;
    private javax.swing.JLabel battery_temperature_text_2;
    private javax.swing.JLabel battery_temperature_text_3;
    private javax.swing.JLabel battery_temperature_text_4;
    private javax.swing.JLabel battery_temperature_text_5;
    private javax.swing.JLabel battery_temperature_text_6;
    private javax.swing.JLabel battery_temperature_text_7;
    private javax.swing.JLabel battery_temperature_text_8;
    private javax.swing.JPanel eys_color_1;
    private javax.swing.JPanel eys_color_2;
    private javax.swing.JPanel eys_color_3;
    private javax.swing.JLabel eys_text_1;
    private javax.swing.JLabel eys_text_2;
    private javax.swing.JLabel eys_text_3;
    private javax.swing.JPanel hydrogen_cylinder_color;
    private javax.swing.JLabel hydrogen_cylinder_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel motor_driver_color_1;
    private javax.swing.JPanel motor_driver_color_2;
    private javax.swing.JLabel motor_driver_text_1;
    private javax.swing.JLabel motor_driver_text_2;
    private javax.swing.JPanel onboard_charging_color;
    private javax.swing.JLabel onboard_charging_text;
    private javax.swing.JPanel spare_color;
    // End of variables declaration//GEN-END:variables
}
