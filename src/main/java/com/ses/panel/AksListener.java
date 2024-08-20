package com.ses.panel;

import com.fazecast.jSerialComm.SerialPort;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class AksListener extends Thread {

    private volatile boolean running = true;
    private DataListener dataListener;

    @Override
    public void run() {
        listener();
    }

    public void setAksListener(DataListener dataListener) {
        this.dataListener = dataListener;
    }

    public void stopRunning() {
        running = false;
    }

    private static SerialPort connectSerial() {
        String[] portNames = {"/dev/ttyUSB0", "/dev/ttyUSB1", "/dev/ttyUSB2", "COM3"};

        for (String portName : portNames) {
            SerialPort serialPort = SerialPort.getCommPort(portName);
            serialPort.setBaudRate(115200);
            serialPort.setComPortTimeouts(SerialPort.TIMEOUT_NONBLOCKING, 0, 10);

            if (serialPort.openPort()) {
                System.out.println("Connected to " + portName);
                return serialPort;
            } else {
                System.out.println("Failed to open " + portName);
            }
        }

        System.out.println("Unable to connect to any serial port.");
        return null;
    }


    public void listener() {

        SerialPort serialPort = connectSerial();
        byte[] buffer = new byte[1024];
        int bufferIndex = 0;
        int[] group = new int[13];

        while (running) {
            try {
                if (serialPort.bytesAvailable() > 0) {
                    int numRead = serialPort.readBytes(buffer, buffer.length);
                    for (int i = 0; i < numRead; i++) {
                        group[bufferIndex++] = Byte.toUnsignedInt(buffer[i]);

                        if (bufferIndex == 13) {
                            StringBuilder incomingData = new StringBuilder();
                            for (int j = 0; j < 13; j++) {
                                incomingData.append(group[j]).append(" ");
                            }

                            if (dataListener != null) {
                                dataListener.data(incomingData.toString().trim());
                            }

                            bufferIndex = 0;  // Sonraki grup için sıfırla
                        }
                    }
                }
            } catch (Exception e) {}
        }
        
        serialPort.closePort();  // Seri portu kapatma
    }
    
}
