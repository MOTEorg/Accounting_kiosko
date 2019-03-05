package contabilidad.bar;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kevin
 */
public class ModeloTablaInventario extends DefaultTableModel{
   public boolean isCellEditable (int row, int column)
   {
       if (column == 4 || column == 5)
          return true;
       return false;
   }
    
}
