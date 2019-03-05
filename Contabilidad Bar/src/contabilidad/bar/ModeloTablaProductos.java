

package contabilidad.bar;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kevin
 */
public class ModeloTablaProductos extends DefaultTableModel{
   public boolean isCellEditable (int row, int column)
   {
       if (column == 2)
          return true;
       return false;
   }
}

