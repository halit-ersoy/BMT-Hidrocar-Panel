package com.ses.panel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

public class UiModel {
    
    public JLabel rotateImageFun(JLabel label, double degrees) {
        ImageIcon icon = (ImageIcon) label.getIcon();
        BufferedImage image = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = (Graphics2D) image.getGraphics();
        g2d.drawImage(icon.getImage(), 0, 0, null);
        g2d.dispose();

        double rads = Math.toRadians(degrees);
        double sin = Math.abs(Math.sin(rads)), cos = Math.abs(Math.cos(rads));
        int w = image.getWidth();
        int h = image.getHeight();
        int newWidth = (int) Math.floor(w * cos + h * sin);
        int newHeight = (int) Math.floor(h * cos + w * sin);

        BufferedImage rotated = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
        AffineTransform at = new AffineTransform();
        at.translate((newWidth - w) / 2, (newHeight - h) / 2);

        int x = w / 2;
        int y = h / 2;

        at.rotate(rads, x, y);
        AffineTransformOp rotateOp = new AffineTransformOp(at, AffineTransformOp.TYPE_BILINEAR);
        rotated = rotateOp.filter(image, rotated);

        JLabel rotateLabel = new JLabel(new ImageIcon(rotated));
        
        rotateLabel.setBounds(label.getBounds());
        
        return rotateLabel;
    }
    
    public void updatePanel(Container panel, Container oldCont, Container newCont){
        panel.remove(oldCont);
        panel.add(newCont);
        panel.setComponentZOrder(newCont, 0);
        panel.revalidate();
        panel.repaint();
    }
    
    public void updateContent(JLabel label, String content){
        label.setText(content);
    }
    
    public void updateVisible(Container cont, Boolean visible){
        cont.setVisible(visible);
    }
    
    public void updateTime(JLabel label) {
        
        // İlk güncelleme
        String saat = new SimpleDateFormat("HH:mm:ss").format(new Date());
        label.setText(saat);
        
        Timer timer = new Timer(1000, (ActionEvent e) -> {
            String saat1 = new SimpleDateFormat("HH:mm:ss").format(new Date());
            label.setText(saat1);
        });
        timer.start();
    }
    
    public void updateColor(Container cont, String tempS){
        
        int temp = Integer.parseInt(tempS);
        
        if(temp < 50){
            cont.setBackground(new Color(102, 204, 0));
        }else if(temp < 70){
            cont.setBackground(new Color(255,204,0));
        }else{
            cont.setBackground(new Color(255,0,0));
        }
    }
    
    public int findMaxValue(String[] numbers) {
        int max = Integer.MIN_VALUE;

        for (String number : numbers) {
            int num = Integer.parseInt(number);
            if (num > max) {
                max = num;
            }
        }

        return max;
    }
    
    public void updateIcon(JLabel label, String path) {
        ImageIcon icon = new ImageIcon(getClass().getResource(path));
        label.setIcon(icon);
    }
    
}
