package ebrain;

import java.util.LinkedList;
import org.graphstream.graph.Edge;

public class Palabras {

    private String nombre;
    private LinkedList<Edge> conexiones;

    public Palabras(String nombre) {
        this.nombre = nombre;
        conexiones = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Edge> getConexiones() {
        return conexiones;
    }

    public void setConexiones(LinkedList<Edge> conexiones) {
        this.conexiones = conexiones;
    }

}
