
package model;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class TMName extends AbstractTableModel {
     private List<String> lista;
     
     public TMName(List<String>lista){
         this.lista=lista;
     }

    @Override
    public int getRowCount() {
        return lista.size();
        
    }

    @Override
    public int getColumnCount() {
       return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      String a= lista.get(rowIndex);
      return a;
    }

    @Override
    public String getColumnName(int column) {
        if(column==0){
            return "Nombre";
            
        }else{
            return null;
        }
            

    }
    
    
    
}
