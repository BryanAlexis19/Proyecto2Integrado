
package Interface;

import Modelo.modelo_documentacion;
import java.util.ArrayList;
import java.util.List;

public interface interfaz_documentacion {
    List<modelo_documentacion> DLista = new ArrayList();
    List<modelo_documentacion> DLista(); 
    boolean insertarDoc (modelo_documentacion docum );
    boolean actualizarDoc (modelo_documentacion docum );
    boolean eliminarDoc (modelo_documentacion docum );
}
