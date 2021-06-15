/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Entry;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author P1401UA
 */
public class TabelModelEntry extends AbstractTableModel  {
     List<Entry> lu;
     public TabelModelEntry(List<Entry> lu) {
        this.lu = lu;
    }
    
    @Override
    public int getColumnCount() {
        return 5;
    }
    
    public int getRowCount() {
        return lu.size();
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nama";
            case 1:
                return "Telepon";
            case 2:
                return "Umur";
            case 3:
                return "Alamat";
            case 4:
                return "Email";
          
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return lu. get(row).getNama();
            case 1:
                return lu. get(row).getTelepon();
            case 2:
                return lu. get(row).getUmur();
            case 3:
                return lu. get(row).getAlamat();
            case 4:
                return lu. get(row).getEmail();
            default:
                return null; 
        }
    }
    
}
