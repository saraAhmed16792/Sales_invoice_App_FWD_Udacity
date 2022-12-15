/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class InvoicesTableModel extends AbstractTableModel{
    private ArrayList<Invoices> invoices;
    private String[] columns = {"No.","Date", "Customer" , "Total"};

    public InvoicesTableModel(ArrayList <Invoices> invoices){
        this.invoices = invoices;
    }

    
    @Override
    public int getRowCount() {
                return invoices.size();

    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }
    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
Invoices invoice = invoices.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return invoice.getNum();
            case 1: return invoice.getDate();
            case 2: return invoice.getCustomer();
            case 3: return invoice.getInvoiceTotal();
            default : return "";  
        }
    }
   
}
