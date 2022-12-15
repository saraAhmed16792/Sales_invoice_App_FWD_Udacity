/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model;

import app.view.AppFrame;
import app.view.InvoiceDialog;
import app.view.LineDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class FileOperations implements ActionListener ,ListSelectionListener{
private AppFrame frame;
   private InvoiceDialog invoiceDialog;
   private LineDialog lineDialog;
           
    public FileOperations(AppFrame frame) {
        this.frame = frame;
    }
     public ArrayList<Invoices> readFile() {
        String headerPath;
        String itemPath;
        File headerFile;
        File itemFile;
        List<String> headerLines = null;
        List<String> itemsLines = null;
        int result;
        ArrayList<Invoices> inv = new ArrayList<>();

        JOptionPane.showMessageDialog(frame, "Please insert Headers File then Lines File");

        JFileChooser file = new JFileChooser();
        do {
            result = file.showOpenDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                headerFile = file.getSelectedFile();
                if (headerFile.getName().contains(".csv")) {
                    headerPath = headerFile.getAbsolutePath();
                    break;
                } else {
                    System.out.println("Wrong Headers File Format");
                    JOptionPane.showMessageDialog(frame, "Wrong Headers File Format please insert the correct file again");
                }
            }
        } while (true);
        do {
            result = file.showOpenDialog(frame);

            if (result == JFileChooser.APPROVE_OPTION) {
                itemFile = file.getSelectedFile();
                if (itemFile.getName().contains(".csv")) {
                    itemPath = itemFile.getAbsolutePath();
                    break;
                } else {

                    System.out.println("Wrong Items File Format");
                    JOptionPane.showMessageDialog(frame, "Wrong Items File Format");
                }

            }
        } while (true);

        System.out.println(headerPath);
        System.out.println(itemPath);
        return null;


    }
    
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
