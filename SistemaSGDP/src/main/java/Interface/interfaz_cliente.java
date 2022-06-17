
package Interface;

import Modelo.modelo_cliente;
import java.util.ArrayList;
import java.util.List;

public interface interfaz_cliente {
    List<modelo_cliente> CliLista = new ArrayList();
    List<modelo_cliente> CliLista();
    List<modelo_cliente> BuscarCliente(modelo_cliente clie);
    int ingresoC(modelo_cliente ep);
}
