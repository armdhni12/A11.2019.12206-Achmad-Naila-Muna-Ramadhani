/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daointerface.Entry;

import java.util.List;
import model.Entry.*;

/**
 *
 * @author P1401UA
 */
public interface IEntry {
    public void insert(Entry b);
    public void update(Entry b);
    public void delete(String nama);
    public List<Entry> getAll();
    public List<Entry> getCariNama(String nama);
}
