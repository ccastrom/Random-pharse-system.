/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TMPlace extends AbstractTableModel {

    private List<String> lista3;

    public TMPlace(List<String> lista3) {
        this.lista3 = lista3;
    }

    @Override
    public int getRowCount() {
        return lista3.size();

    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String a = lista3.get(rowIndex);
        return a;
    }

    @Override
    public String getColumnName(int column) {

        if (column == 0) {
            return "Place";

        } else {
            return null;
        }
    }

}
