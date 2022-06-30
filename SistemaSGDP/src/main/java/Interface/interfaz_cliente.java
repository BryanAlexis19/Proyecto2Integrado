
package Interface;

import Modelo.*;
import java.util.ArrayList;
import java.util.List;

public interface interfaz_cliente {
    List<modelo_cliente> CliLista = new ArrayList();
    List<modelo_cliente> CliLista();
    List<modelo_cliente> BuscarCliente(modelo_cliente clie);
    int ingresoC(modelo_cliente ep);
    List<modelo_documentacion> filtrarArt(String an);
    int actualizarC(modelo_cliente ac);
}
