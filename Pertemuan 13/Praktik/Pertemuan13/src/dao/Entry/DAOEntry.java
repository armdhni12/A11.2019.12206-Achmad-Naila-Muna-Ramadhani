/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Entry;
import koneksi.Entry.Koneksi;
import model.Entry.Entry;
import daointerface.Entry.IEntry;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Entry.Entry;
/**
 *
 * @author P1401UA
 */
public class DAOEntry implements IEntry {
    final String update = "UPDATE tbl_entry set telepon=?, umur=?, alamat=?, email=? where nama=?;";
    final String delete = "delete from tbl_entry where nama=?;";
    final String select = "SELECT * FROM tbl_entry;";
    final String carinama = "SELECT * FROM tbl_entry where nama like ?";
    
    public DAOEntry() {
        connection = Koneksi.connection();
    }
    @Override
    public void insert(Entry b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setString(1,b.getNama());
            statement.setInt(2, b.getTelepon());
            statement.setInt(3, b.getUmur());
            statement.setString(4, b.getAlamat());
            statement.setString(5, b.getEmail());
            statement.execute();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()) {
                b.setNama(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("Berhasil Input");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal Input");
            }
        }
    }
    Connection connection;
    String insert = "insert into tbl_entry (nama,telepon, umur, alamat, email) values  (?,?, ?, ?, ?);";
    @Override
    public void update(Entry b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);
            statement.setInt(1, b.getTelepon());
            statement.setInt(2, b.getUmur());
            statement.setString(3, b.getAlamat());
            statement.setString(4, b.getEmail());
            statement.setString(5, b.getNama());
            statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Berhasil Update");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal Update");
            }
        }
    }
    @Override
    public void delete(String nama) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            statement.setString(1, nama);
            statement.execute();
        } catch (SQLException ex) {
            System.out.println("Berhasil Delete");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal Delete");
            }
        }
    }
    
    public List<Entry> getAll() {
        List<Entry> lb = null;
        try {
            lb = new ArrayList<Entry>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {                
                Entry b = new Entry();
                b.setNama(rs.getString("nama"));
                b.setTelepon(rs.getInt("telepon"));
                b.setUmur(rs.getInt("umur"));
                b.setAlamat(rs.getString("alamat"));
                b.setEmail(rs.getString("email"));
                lb.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }
    
    public List<Entry> getCariNama(String nama) {
        List<Entry> lb = null;
        try {
            lb = new ArrayList<Entry>();
            PreparedStatement st = connection.prepareStatement(carinama);
            st.setString(1, "%" + nama + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {                
                Entry b = new Entry();
                b.setNama(rs.getString("nama"));
                b.setTelepon(rs.getInt("telepon"));
                b.setUmur(rs.getInt("umur"));
                b.setAlamat(rs.getString("alamat"));
                b.setEmail(rs.getString("email"));
                lb.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }
    
    
}
