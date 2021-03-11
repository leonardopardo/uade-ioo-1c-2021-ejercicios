package clase01.libraries;

import java.util.ArrayList;
import java.util.Date;
import java.util.Dictionary;
import java.util.Hashtable;

public class Vuelo {
    protected ArrayList<Tripulante> tripulantes;
    protected ArrayList<Pasajero> pasajeros;
    protected Dictionary<Aeropuerto, Integer> escalas;
    protected Aeropuerto aeropuertoOrigen;
    protected Aeropuerto aeropuertoDestion;
    protected Avion avion;
    protected Date fecha;
    protected int duracionenMinutos;
    
    public Vuelo(Aeropuerto origen, Aeropuerto destino,
                 Dictionary<Aeropuerto, Integer> escalas,
                 Date fecha, int duracionEstimada) {

        this.tripulantes = new ArrayList<>();
        this.pasajeros = new ArrayList<>();
        this.escalas = escalas;
        this.aeropuertoOrigen = origen;
        this.aeropuertoDestion = destino;
        this.duracionenMinutos = duracionEstimada;
        this.fecha = fecha;
    }

    /**
     * 1. La capacidad de un vuelo ocupada por pasajeros.
     * @return
     */
    public float porcentajeOcupacion() {
        return (this.pasajeros.size()
                / avion.asientos.size()) * 100;
    }

    /**
     * 2. La duración total aproximada de un vuelo, teniendo en cuenta que, de existir, en cada escala se demora un
     * tiempo diferente.
     * @return
     */
    public int calcularDuracionVuelo() {

        for (int i = 0; i < this.escalas.size(); i++) {
            this.duracionenMinutos += this.escalas.get(i);
        }

        return this.duracionenMinutos;
    }

    /**
     *
     * @param aeropuerto
     */
    public void agregarEscala(Aeropuerto aeropuerto, int duracionenMinutos) {
        this.escalas.put(aeropuerto, duracionenMinutos);
    }

    /**
     *
     * @param pasajero
     */
    public void agregarPasajero(Pasajero pasajero) {
        this.pasajeros.add(pasajero);
    }

    /**
     *
     * @param tripulante
     */
    public void agregarTripulante(Tripulante tripulante)
    {
        this.tripulantes.add(tripulante);
    }
}
