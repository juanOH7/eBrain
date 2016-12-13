package ebrain;

import java.util.Date;
import java.util.LinkedList;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.AdjacencyListGraph;

public class Perfil {

    private String nombre;
    private String raza;
    private String genero;
    private Date fechaN;
    private String observaciones;
    private LinkedList<Perfil> hijos;
    private LinkedList<AdjacencyListGraph> mapa;

    @Override
    public String toString() {
        return nombre;
    }

    public Perfil(String nombre, String raza, String genero, Date fechaN, String observaciones) {
        this.nombre = nombre;
        this.raza = raza;
        this.genero = genero;
        this.fechaN = fechaN;
        this.observaciones = observaciones;
        this.hijos = new LinkedList<>();
        this.mapa = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechaN() {
        return fechaN;
    }

    public void setFechaN(Date fechaN) {
        this.fechaN = fechaN;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public LinkedList<Perfil> getHijos() {
        return hijos;
    }

    public void setHijos(LinkedList<Perfil> hijos) {
        this.hijos = hijos;
    }

    public LinkedList<AdjacencyListGraph> getMapa() {
        return mapa;
    }

    public int numCone() {
        int cant = 0;
        if (!mapa.isEmpty()) {
            for (int i = 0; i < mapa.size(); i++) {
                cant += mapa.get(i).getEdgeCount();
            }
        }
        return cant;
    }

    public int numCon() {
        return mapa.size();
    }

    public void setMapa(LinkedList<AdjacencyListGraph> mapa) {
        this.mapa = mapa;
    }

}
