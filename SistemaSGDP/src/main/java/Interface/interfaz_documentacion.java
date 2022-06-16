
package Interface;

import Modelo.modelo_documentacion;
import java.util.ArrayList;
import java.util.List;

public interface interfaz_documentacion {
        List<modelo_documentacion> DLista = new ArrayList();
    List<modelo_documentacion> ULista();
    boolean login (modelo_documentacion usr);
}
