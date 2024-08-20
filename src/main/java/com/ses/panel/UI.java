package com.ses.panel;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UI extends JFrame {
    
    JLabel speedCross;
    JLabel headlineCross;
    
    public UI() {
        /*
        speed_cross -122, 176
        headline_cross -84, 136
        
        model.updateContent(charge_percentage, "%" + "50");
        model.updateContent(battery_temperature, "50" + "°C");
        model.updateContent(battery_voltage, "50" + "kΩ");
        model.updateContent(instantaneous_charge_voltage, "60" + "V");
        model.updateContent(instantaneous_charging_power, "50" + "kW");
        model.updateContent(instantaneous_power_consumption, "50" + "kW");
        model.updateContent(insulation_resistance, "220" + "V");
        model.updateContent(gear, "D");
        model.updateContent(speed_text, "41" + " km/h");
        model.updateContent(headline_text, "50" + "°C");
        
        model.updateVisible(left_turn_signal, false);
        model.updateVisible(wiper, false);
        model.updateVisible(aks, false);
        model.updateVisible(headlight, false);
        model.updateVisible(right_turn_signal, false);
        model.updateVisible(medium_danger, false);
        model.updateVisible(big_danger, false);
        
        model.updateTime(clock);
        */
        
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }    
    
    public void updateUI(String output) {
        UiModel model = new UiModel();
        String[] data = output.split(" ");
        String[] headlineData = {data[1], data[2], data[3], data[4], data[5], data[6]};
        int headline_max = model.findMaxValue(headlineData);
        if(speedCross != null){
            jPanel1.remove(speedCross);
        }
        if(headlineCross != null){
            jPanel1.remove(headlineCross);
        }
        speedCross = model.rotateImageFun(speed_cross, -122 + ((double)(Integer.parseInt(data[0]) - 0) * (176 - -122)) / (100 - 0));
        headlineCross = model.rotateImageFun(headline_cross, -84 + ((double)(Integer.parseInt(data[7]) - 0) * (136 - -84)) / (100 - 0));
        model.updatePanel(jPanel1, speed_cross, speedCross);
        model.updatePanel(jPanel1, headline_cross, headlineCross);
        model.updateContent(speed_text, data[0] + " km/h");
        model.updateContent(headline_text, data[7] + "°C");
        model.updateContent(battery_temperature, headline_max + "°C");
        model.updateContent(instantaneous_power_consumption, data[8] + "kW");
        model.updateContent(battery_voltage, data[9] + "kΩ");
        model.updateContent(charge_percentage, "%" + data[10]);
        if("0".equals(data[11])){
            model.updateIcon(charging_status, "/uncharge_battery.png");
        }else{
            model.updateIcon(charging_status, "/charge_battery.png");
        }
        if("0".equals(data[12])){
            model.updateContent(gear, "D");
        }else{
            model.updateContent(gear, "R");
        }
        model.updateTime(clock);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        charging_status = new javax.swing.JLabel();
        left_turn_signal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        battery_temperature = new javax.swing.JLabel();
        right_turn_signal = new javax.swing.JLabel();
        wiper = new javax.swing.JLabel();
        aks = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        headlight = new javax.swing.JLabel();
        charge_percentage = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        battery_voltage = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        insulation_resistance = new javax.swing.JLabel();
        instantaneous_charging_power = new javax.swing.JLabel();
        instantaneous_charge_voltage = new javax.swing.JLabel();
        instantaneous_power_consumption = new javax.swing.JLabel();
        clock = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        gear = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        medium_danger = new javax.swing.JLabel();
        big_danger = new javax.swing.JLabel();
        headline_text = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        headline_cross = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        speed_text = new javax.swing.JLabel();
        speed_cross = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1024, 600));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Şarj Durumu");

        charging_status.setIcon(new javax.swing.ImageIcon(getClass().getResource("/charge_battery.png"))); // NOI18N

        left_turn_signal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        left_turn_signal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/left_led.png"))); // NOI18N
        left_turn_signal.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Batarya Gerilimi");

        battery_temperature.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        battery_temperature.setForeground(new java.awt.Color(255, 0, 0));
        battery_temperature.setText("50°C");

        right_turn_signal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        right_turn_signal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/right_led.png"))); // NOI18N

        wiper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wiper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wash.png"))); // NOI18N

        aks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aks.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Şarj Yüzdesi");

        headlight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headlight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/far.png"))); // NOI18N

        charge_percentage.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        charge_percentage.setForeground(new java.awt.Color(255, 0, 0));
        charge_percentage.setText("%50");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("Batarya Sıcaklığı");

        battery_voltage.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        battery_voltage.setForeground(new java.awt.Color(255, 0, 0));
        battery_voltage.setText("50kΩ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("İzolasyon Direnci");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("Anlık Şarj Gücü");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("Anlık Şarj Gerilimi");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("Anlık Güç Tüketimi");

        insulation_resistance.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        insulation_resistance.setForeground(new java.awt.Color(255, 0, 0));
        insulation_resistance.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        insulation_resistance.setText("220V");

        instantaneous_charging_power.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        instantaneous_charging_power.setForeground(new java.awt.Color(255, 0, 0));
        instantaneous_charging_power.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        instantaneous_charging_power.setText("50kW");

        instantaneous_charge_voltage.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        instantaneous_charge_voltage.setForeground(new java.awt.Color(255, 0, 0));
        instantaneous_charge_voltage.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        instantaneous_charge_voltage.setText("60V");

        instantaneous_power_consumption.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        instantaneous_power_consumption.setForeground(new java.awt.Color(255, 0, 0));
        instantaneous_power_consumption.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        instantaneous_power_consumption.setText("50kW");

        clock.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        clock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clock.setText("19:20");
        clock.setMinimumSize(new java.awt.Dimension(0, 0));

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setMaximumSize(new java.awt.Dimension(450, 419));
        jPanel1.setMinimumSize(new java.awt.Dimension(450, 419));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 419));
        jPanel1.setLayout(null);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel19.setText("40");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(4, 28, 140, 48);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("50");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(0, 0, 470, 48);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel21.setText("60");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(330, 28, 140, 48);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel22.setText("70");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(404, 106, 60, 48);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("80");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(0, 210, 470, 48);

        gear.setFont(new java.awt.Font("Segoe UI", 1, 56)); // NOI18N
        gear.setText("R");
        jPanel1.add(gear);
        gear.setBounds(330, 420, 140, 76);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel24.setText("90");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(402, 316, 60, 48);

        medium_danger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/danger_orange.png"))); // NOI18N
        jPanel1.add(medium_danger);
        medium_danger.setBounds(40, 440, 44, 39);

        big_danger.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        big_danger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/danger_red.png"))); // NOI18N
        jPanel1.add(big_danger);
        big_danger.setBounds(90, 440, 45, 39);

        headline_text.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        headline_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headline_text.setText("50°C");
        jPanel1.add(headline_text);
        headline_text.setBounds(0, 500, 470, 32);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel25.setText("10");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(8, 316, 60, 48);

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("20");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(0, 208, 470, 48);

        headline_cross.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headline_cross.setIcon(new javax.swing.ImageIcon(getClass().getResource("/black_ibre_small.png"))); // NOI18N
        jPanel1.add(headline_cross);
        headline_cross.setBounds(0, 434, 470, 90);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel27.setText("30");
        jPanel1.add(jLabel27);
        jLabel27.setBounds(8, 106, 60, 48);

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hot_cross.png"))); // NOI18N
        jPanel1.add(jLabel28);
        jLabel28.setBounds(0, 400, 470, 103);

        speed_text.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        speed_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        speed_text.setText("41 km/h");
        jPanel1.add(speed_text);
        speed_text.setBounds(0, 360, 472, 32);

        speed_cross.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        speed_cross.setIcon(new javax.swing.ImageIcon(getClass().getResource("/black_ibre_big.png"))); // NOI18N
        jPanel1.add(speed_cross);
        speed_cross.setBounds(0, 26, 470, 418);

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cross.png"))); // NOI18N
        jPanel1.add(jLabel18);
        jLabel18.setBounds(0, 42, 470, 360);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(left_turn_signal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(22, 22, 22)
                                .addComponent(wiper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(20, 20, 20)
                                .addComponent(aks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(42, 42, 42))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(charging_status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(90, 90, 90))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(49, 49, 49))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(charge_percentage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(37, 37, 37))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(battery_temperature, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(47, 47, 47))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(battery_voltage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(37, 37, 37)))
                                .addGap(18, 18, 18)))
                        .addGap(62, 62, 62)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(headlight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(20, 20, 20)
                                .addComponent(right_turn_signal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12))
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(instantaneous_charge_voltage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(instantaneous_power_consumption, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(790, 790, 790)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(insulation_resistance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(817, 817, 817))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(790, 790, 790)
                        .addComponent(instantaneous_charging_power, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(left_turn_signal)
                    .addComponent(wiper)
                    .addComponent(aks))
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(charging_status)
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(charge_percentage)
                .addGap(12, 12, 12)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(battery_temperature)
                .addGap(62, 62, 62)
                .addComponent(battery_voltage))
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headlight)
                    .addComponent(right_turn_signal))
                .addGap(270, 270, 270)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(instantaneous_charge_voltage)
                .addGap(12, 12, 12)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(instantaneous_power_consumption))
            .addGroup(layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(jLabel5))
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(instantaneous_charging_power))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel3))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(insulation_resistance))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel10))
            .addComponent(clock, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aks;
    private javax.swing.JLabel battery_temperature;
    private javax.swing.JLabel battery_voltage;
    private javax.swing.JLabel big_danger;
    private javax.swing.JLabel charge_percentage;
    private javax.swing.JLabel charging_status;
    private javax.swing.JLabel clock;
    private javax.swing.JLabel gear;
    private javax.swing.JLabel headlight;
    private javax.swing.JLabel headline_cross;
    private javax.swing.JLabel headline_text;
    private javax.swing.JLabel instantaneous_charge_voltage;
    private javax.swing.JLabel instantaneous_charging_power;
    private javax.swing.JLabel instantaneous_power_consumption;
    private javax.swing.JLabel insulation_resistance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel left_turn_signal;
    private javax.swing.JLabel medium_danger;
    private javax.swing.JLabel right_turn_signal;
    private javax.swing.JLabel speed_cross;
    private javax.swing.JLabel speed_text;
    private javax.swing.JLabel wiper;
    // End of variables declaration//GEN-END:variables
}
