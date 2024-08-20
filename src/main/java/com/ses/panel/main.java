package com.ses.panel;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class main implements KeyListener {

    private JFrame ui;
    private JFrame ui1;
    private JFrame ui2;
    private JFrame ui3;
    private AksListener aksListener;
    
    private JFrame currentUI;

    public main() {
        java.awt.EventQueue.invokeLater(() -> {
            aksListener = new AksListener();
            aksListener.start();
            
            ui = new UI();
            ui.addKeyListener(this);
            ui.setVisible(true);
            currentUI = ui;
            
            aksListener.setAksListener((String output) -> {
                if(currentUI instanceof UI) {
                    ((UI) currentUI).updateUI(output);
                } else if(currentUI instanceof UI1) {
                    ((UI1) currentUI).updateUI(output);
                }
                // Diğer UI sınıfları için de benzer şekilde
            });
        });
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
            System.out.println(e);
        }
        new main();
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_F1 -> {
                if (ui == null) {
                    ui = new UI();
                    ui.addKeyListener(this);
                }
                if (!ui.isVisible()) {
                    hideAllWindows();
                    ui.setVisible(true);
                    currentUI = ui;
                }
            }
            case KeyEvent.VK_F2 -> {
                if (ui1 == null) {
                    ui1 = new UI1();
                    ui1.addKeyListener(this);
                }
                if (!ui1.isVisible()) {
                    hideAllWindows();
                    ui1.setVisible(true);
                    currentUI = ui1;
                }
            }
            case KeyEvent.VK_F3 -> {
                if (ui2 == null) {
                    ui2 = new UI2();
                    ui2.addKeyListener(this);
                }
                if (!ui2.isVisible()) {
                    hideAllWindows();
                    ui2.setVisible(true);
                    currentUI = ui2;
                }
            }
            case KeyEvent.VK_F4 -> {
                if (ui3 == null) {
                    ui3 = new UI3();
                    ui3.addKeyListener(this);
                }
                if (!ui3.isVisible()) {
                    hideAllWindows();
                    ui3.setVisible(true);
                    currentUI = ui3;
                }
            } default -> {}
            // Diğer case'ler de benzer şekilde
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    private void hideAllWindows() {
        if (ui != null) {
            ui.setVisible(false);
        }
        if (ui1 != null) {
            ui1.setVisible(false);
        }
        if (ui2 != null) {
            ui2.setVisible(false);
        }
        if (ui3 != null) {
            ui3.setVisible(false);
        }
    }
}
