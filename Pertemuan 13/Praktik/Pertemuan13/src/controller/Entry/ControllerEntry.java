/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Entry;
import dao.Entry.DAOEntry;
import daointerface.Entry.IEntry;
import model.Entry.Entry;
import model.Entry.TabelModelEntry;
import view.Entri.FormEntry;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author P1401UA
 */
public class ControllerEntry {
    public ControllerEntry(FormEntry frame) {
        this.frame = frame;
        implEntry = new DAOEntry();
        lb = implEntry.getAll();
    }
    
    public void reset() {
        frame.getTxtNama().setText("");
        frame.getTxtUmur().setText("");
        frame.getTxtTelepon().setText("");
        frame.getTxtAlamat().setText("");
        frame.getTxtEmail().setText("");
    }
    
    public  void isiTable() {
        lb = implEntry.getAll();
        TabelModelEntry tmb = new TabelModelEntry(lb);
        frame.getTabelData().setModel(tmb);
    }
    
    public void insert() {
        if (!frame.getTxtNama().getText().trim().isEmpty()) {
            Entry b = new Entry();
            
            
            b.setNama(frame.getTxtNama().getText());
            b.setTelepon(Integer.parseInt(frame.getTxtTelepon().getText()));
            b.setUmur(Integer.parseInt(frame.getTxtUmur().getText()));
            
            b.setAlamat(frame.getTxtAlamat().getText());
            b.setEmail(frame.getTxtEmail().getText());
            implEntry.insert(b);
            JOptionPane.showMessageDialog(null, "Simpan Data Sukses");
        } else { 
            JOptionPane.showMessageDialog(frame, "Data Tidak Boleh Kosong");
        }
    }
    FormEntry frame;
    IEntry implEntry;
    List<Entry> lb;
    
    public void update() {
        if (!frame.getTxtNama().getText().trim().isEmpty()) {
            Entry b = new Entry();
            
            b.setNama(frame.getTxtNama().getText());
            b.setTelepon(Integer.parseInt(frame.getTxtTelepon().getText()));
            b.setUmur(Integer.parseInt(frame.getTxtUmur().getText()));
            b.setAlamat(frame.getTxtAlamat().getText());
            
            b.setEmail(frame.getTxtEmail().getText());
            
            implEntry.update(b);
            JOptionPane.showMessageDialog(null, "Update Data Sukses");
        } else {
            JOptionPane.showMessageDialog(frame, "Pilih Data yang akan diubah");
        }
    }
     public void delete() {
        if (!frame.getTxtNama().getText().trim().isEmpty()) {
            String id = frame.getTxtNama().getText();
            implEntry.delete(id);
            JOptionPane.showMessageDialog(null, "Hapus Data Sukses");
        } else {
            JOptionPane.showMessageDialog(frame, "Pilih Data yang akan dihapus");
        }
    }
    
    
}
