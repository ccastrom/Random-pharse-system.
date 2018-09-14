
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;


public class TMAction extends AbstractTableModel {
    private List<String>lista2;

    public TMAction(List<String> lista2) {
        this.lista2 = lista2;
    }
    
    @Override
    public int getRowCount() {
        return lista2.size();
        
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       String a= lista2.get(rowIndex);
       return a;
    }

    @Override
    public String getColumnName(int column) {
        if(column==0){
            return "Action";
            
        }else{
            return null;
        }
               
            }
    
}
